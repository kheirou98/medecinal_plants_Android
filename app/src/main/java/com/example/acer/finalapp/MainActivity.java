package com.example.acer.finalapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;
import android.graphics.Bitmap;

import java.io.ByteArrayOutputStream;
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


public class MainActivity extends AppCompatActivity {

    public static ArrayList<String> favor = new ArrayList<String>();
    public static boolean MAJ = false;


    private static final String TAG = "MainActivity";

    static {
        if (!OpenCVLoader.initDebug()) {
            Log.d(TAG, "OpenCV not loaded");
        } else {
            Log.d(TAG, "OpenCV loaded");
        }
    }


    Button btnChoose;

    final int REQUEST_CODE_GALLERY = 999;

    public static SQLiteHelper sqLiteHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);
        boolean mboolean;
        SharedPreferences settings = getSharedPreferences("PREFS_NAME", 0);
        mboolean = settings.getBoolean("FIRST_RUN", false);
        if (!mboolean) {
            DatabaseInitialisation databaseInitialisation = new DatabaseInitialisation(getBaseContext());
           // sqLiteHelper=databaseInitialisation.getSqLiteHelper();

            settings = getSharedPreferences("PREFS_NAME", 0);
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("FIRST_RUN", true);
            editor.commit();

        }

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;

                        //PlantesMedicinalesList selectedplante = null ;
                        switch (item.getItemId()) {
                            case R.id.Home:
                                selectedFragment = homeclass.newInstance();
                                break;
                           case R.id.search:
                               selectedFragment = PlantesMedicinalesList.newInstance();
                                break;
                            case R.id.apropos:
                                selectedFragment = Aide.newInstance();
                                break;
                            case R.id.profil:
                                selectedFragment = Profil.newInstance();
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, homeclass.newInstance());
        transaction.commit();
        btnChoose = (Button) findViewById(R.id.btnChoose);

    }


    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mymenu = getMenuInflater();
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id == R.id.Favorie)
        {
            // Toast.makeText(MainActivity.this,id, Toast.LENGTH_LONG).show();
            Intent favIntent = new Intent(MainActivity.this,Historique.class);
            //favIntent.putExtra("position",0);
            startActivity(favIntent);
        }else
        if(id == R.id.apropos)
        {
            Intent favIntent = new Intent(MainActivity.this,Apropos.class);
            //favIntent.putExtra("position",0);
            startActivity(favIntent);
            // Toast.makeText(MainActivity.this,id, Toast.LENGTH_LONG).show();
        }else
        if(id == R.id.Exit)
        {
            Toast.makeText(MainActivity.this,"Merci d'avoir utiliser notre app", Toast.LENGTH_LONG).show();
            this.finish();
        }else
            if(id == R.id.users) {
                Intent usersIntent = new Intent(MainActivity.this,Users.class);
                startActivity(usersIntent);
            }

        return super.onOptionsItemSelected(item);

    }


    public void buGallerie (View view) {
        ActivityCompat.requestPermissions(
                MainActivity.this,
                new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                REQUEST_CODE_GALLERY
        );
    }
    static final int REQUEST_IMAGE_CAPTURE = 1;
    public void buCapture(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }

    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if(requestCode == REQUEST_CODE_GALLERY){
            if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, REQUEST_CODE_GALLERY);
            }
            else {
                Toast.makeText(getApplicationContext(), "You don't have permission to access file location!", Toast.LENGTH_SHORT).show();
            }
            return;
        }

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == REQUEST_CODE_GALLERY && resultCode == RESULT_OK && data != null){
            Uri uri = data.getData();
            try {
                InputStream inputStream = getContentResolver().openInputStream(uri);
                Intent intent = new Intent(this, ReconnaissanceActivity.class);
                Bitmap imgInt = BitmapFactory.decodeStream(inputStream);

                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgInt.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] bytes = stream.toByteArray();
                intent.putExtra("bitmapbytes",bytes);
                startActivity(intent);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            super.onActivityResult(requestCode, resultCode, data);
        }
        else{
            if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK && data != null){

                    Intent intent = new Intent(this, ReconnaissanceActivity.class);
                    Bundle extras = data.getExtras();
                    Bitmap imgInt = (Bitmap) extras.get("data");

                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    imgInt.compress(Bitmap.CompressFormat.PNG, 100, stream);
                    byte[] bytes = stream.toByteArray();
                    intent.putExtra("bitmapbytes",bytes);
                    startActivity(intent);
                    super.onActivityResult(requestCode, resultCode, data);
            }
        }

    }



}
