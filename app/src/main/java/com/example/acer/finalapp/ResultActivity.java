package com.example.acer.finalapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.graphics.Bitmap;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;


import org.opencv.android.Utils;
import org.opencv.core.CvType;
import org.opencv.core.Point;
import org.opencv.core.Core;
import org.opencv.core.MatOfFloat;
import org.opencv.calib3d.Calib3d;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.MatOfDMatch;
import org.opencv.core.MatOfByte;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.Features2d;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.core.Scalar;
import org.opencv.core.DMatch;
import org.opencv.features2d.FlannBasedMatcher;
import org.opencv.imgproc.Imgproc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import org.opencv.android.OpenCVLoader;
import static java.lang.System.*;
import static org.opencv.imgproc.Imgproc.ADAPTIVE_THRESH_MEAN_C;
import static org.opencv.imgproc.Imgproc.THRESH_BINARY;
import static org.opencv.imgproc.Imgproc.adaptiveThreshold;


import android.Manifest;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;

import java.io.FileNotFoundException;
import java.io.InputStream;


public class ResultActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    static {
        if (!OpenCVLoader.initDebug()) {
            Log.d(TAG, "OpenCV not loaded");
        } else {
            Log.d(TAG, "OpenCV loaded");
        }
    }

    private FeatureDetector detector = FeatureDetector.create(FeatureDetector.ORB);
    private DescriptorExtractor descriptor = DescriptorExtractor.create(DescriptorExtractor.ORB);
    private DescriptorMatcher matcher = DescriptorMatcher.create(DescriptorMatcher.BRUTEFORCE_HAMMING);
    private Context context;


    ListView listView;
    ArrayList<PlantesMedicinales> list;
    PlantesMedicinalesListAdapter adapter = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
       // Toast.makeText(ResultActivity.this, "Recherche en cours ...", Toast.LENGTH_LONG).show();
        SQLiteHelper db = new SQLiteHelper(getBaseContext()) ;
        listView = (ListView) findViewById(R.id.listview2);

        Resources resources = this.getResources();
        Bitmap imgBase;
        ArrayList<Result> ResultaRecherche = new ArrayList<Result>();
        float taux;


        ArrayList<PlantesMedicinales> plantes = new ArrayList<PlantesMedicinales>();
        ArrayList<PlantesMedicinales> finale = new ArrayList<PlantesMedicinales>();

        byte[] bytes = getIntent().getByteArrayExtra("bitmapbytes");
        Bitmap imgInt = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);

        String type_plante=getIntent().getStringExtra("type");
        plantes = db.getType(type_plante);



        int i=0;
        if(type_plante=="Feuille" ||type_plante =="Plante"){
            for (i = 0; i < plantes.size(); i++) {
                int imageId = resources.getIdentifier(plantes.get(i).getImage(), "drawable", getPackageName());
                imgBase = BitmapFactory.decodeResource(getResources(), imageId);
                    taux = orb(imgBase, imgInt);
                    if (taux >= 30) {
                        Result result = new Result();
                        result.setImgaeId(imageId);
                        result.setNom(plantes.get(i).getName());
                        result.setTaux(taux);
                        rempTab(ResultaRecherche, result);
                    }
            }

        }else {
            for (i = 0; i < plantes.size(); i++) {
                int imageId = resources.getIdentifier(plantes.get(i).getImage(), "drawable", getPackageName());
                imgBase = BitmapFactory.decodeResource(getResources(), imageId);

                if (histo(imgInt, imgBase) > 15000) {

                } else {
                    taux = orb(imgBase, imgInt);
                    if (taux >= 30) {
                        Result result = new Result();
                        result.setImgaeId(imageId);
                        result.setNom(plantes.get(i).getName());
                        result.setTaux(taux);
                        rempTab(ResultaRecherche, result);
                    }
                }

            }
        }

        finale=convertPlante(ResultaRecherche);
        list = finale;


        Toast.makeText(ResultActivity.this, "Fin de la recherche .", Toast.LENGTH_LONG).show();

        if(list.size() == 0 ){
            TextView txt = (TextView) findViewById(R.id.textView5);
            txt.setText("AUCUN RESULTAT TROUVE");
        }
        db.close();
        Log.i("Plantes Number", Integer.toString(list.size()));
        adapter = new PlantesMedicinalesListAdapter(this, R.layout.list_item, list);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                Intent intent = new Intent(ResultActivity.this, PlanteDetail.class);
                intent.putExtra("PlanteName", list.get(position).getName());

                startActivity(intent);
            }
        });

    }


    public double histo(Bitmap image1 , Bitmap image2)
    {
        Bitmap bmpimg1= image1 ;
        Bitmap bmpimg2 = image2 ;
        bmpimg1 = Bitmap.createScaledBitmap(bmpimg1, 100, 100, true);
        bmpimg2 = Bitmap.createScaledBitmap(bmpimg2, 100, 100, true);
        Mat img1 = new Mat();
        Utils.bitmapToMat(bmpimg1, img1);
        Mat img2 = new Mat();
        Utils.bitmapToMat(bmpimg2, img2);
        //Imgproc.cvtColor(img1, img1, Imgproc.COLOR_RGBA2GRAY);
        //Imgproc.cvtColor(img2, img2, Imgproc.COLOR_RGBA2GRAY);
        img1.convertTo(img1, CvType.CV_32F);
        img2.convertTo(img2, CvType.CV_32F);
        Mat hist1 = new Mat();
        Mat hist2 = new Mat();

        MatOfInt histSize = new MatOfInt(180);
        MatOfInt channels = new MatOfInt(0);

        ArrayList<Mat> bgr_planes1= new ArrayList<Mat>();
        ArrayList<Mat> bgr_planes2= new ArrayList<Mat>();

        Core.split(img1, bgr_planes1);
        Core.split(img2, bgr_planes2);

        MatOfFloat histRanges = new MatOfFloat (0f, 180f);

        boolean accumulate = false;

        Imgproc.calcHist(bgr_planes1, channels, new Mat(), hist1, histSize, histRanges, accumulate);
        Core.normalize(hist1, hist1, 0, hist1.rows(), Core.NORM_MINMAX, -1, new Mat());

        Imgproc.calcHist(bgr_planes2, channels, new Mat(), hist2, histSize, histRanges, accumulate);
        Core.normalize(hist2, hist2, 0, hist2.rows(), Core.NORM_MINMAX, -1, new Mat());

        img1.convertTo(img1, CvType.CV_32F);
        img2.convertTo(img2, CvType.CV_32F);
        hist1.convertTo(hist1, CvType.CV_32F);
        hist2.convertTo(hist2, CvType.CV_32F);

        double compare = Imgproc.compareHist(hist1, hist2, Imgproc.CV_COMP_CHISQR);
        return compare;
    }

    public float orb(Bitmap image1 , Bitmap image2){

        int i;

        // first image :
        Mat img1 = new Mat();
        Utils.bitmapToMat(image1, img1);

        Imgproc.cvtColor(img1, img1, Imgproc.COLOR_RGB2GRAY);

        //adaptiveThreshold(img1, img1, 255, ADAPTIVE_THRESH_MEAN_C, THRESH_BINARY, 15, 40);

        Mat descriptors1 = new Mat();
        MatOfKeyPoint keypoints1 = new MatOfKeyPoint();

        detector.detect(img1, keypoints1);
        descriptor.compute(img1, keypoints1, descriptors1);


        // second image :


        Mat img2 = new Mat();
        Utils.bitmapToMat(image2, img2);

        Imgproc.cvtColor(img2, img2, Imgproc.COLOR_BGR2GRAY);
        Mat descriptors2 = new Mat();
        MatOfKeyPoint keypoints2 = new MatOfKeyPoint();

        detector.detect(img2, keypoints2);
        descriptor.compute(img2, keypoints2, descriptors2);

        //matcher should include 2 different image's descriptors
        MatOfDMatch matches = new MatOfDMatch();  //we will save our mathes here
        matcher.match(descriptors1, descriptors2, matches);


        // calculation of min and max distance

        List<DMatch> matchesList = matches.toList();
        double max_dist =0, min_dist= 100;
        double dist;
        int row_count = matchesList.size();
        for( i = 0; i < row_count; i++ )
        {   dist = (double) matchesList.get(i).distance;
            if( dist < min_dist ) min_dist = dist;
            if( dist > max_dist ) max_dist = dist;
        }

        // calculating good matches

        List<DMatch> matches_final= new ArrayList<DMatch>();
        for( i = 0; i < row_count; i++ ) {
            if (matchesList.get(i).distance <= 64)
            {
                matches_final.add(matches.toList().get(i));
            }
        }

        float taux = ((float) matches_final.size() )/ ((float) matchesList.size());
        return taux*100;

    }


    public void rempTab(ArrayList<Result> tab, Result result){

        int i ;
        Result var= new Result();

        if(tab.size()==0){
            tab.add(result);
        }else {

            for (i = 0; i < tab.size()-1; i++) ;
            {
                if (tab.get(i).getTaux() < result.getTaux()) {
                    var.copy(tab.get(i));
                    tab.get(i).copy(result);
                    result.copy(var);
                }
            }
            if(tab.size()<6){
                tab.add(result);
            }
        }

    }

    public ArrayList<PlantesMedicinales> convertPlante(ArrayList<Result> ResultatRecherche){
        int i;
        ArrayList<PlantesMedicinales> finale = new ArrayList<PlantesMedicinales>();
        SQLiteHelper db = new SQLiteHelper(getBaseContext()) ;
        for(i=0 ; i<ResultatRecherche.size();i++){
            String string = ResultatRecherche.get(i).getNom();
            PlantesMedicinales plante=db.getPlante(string);
            finale.add(plante);
        }
        return finale;
    }
}
