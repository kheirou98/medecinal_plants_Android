package com.example.acer.finalapp;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class PlanteDetail extends Activity {
    private final  int taille_max_history = 20;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);
        // TextView texte = (TextView) findViewById(R.id.plante_detail);
        ImageView image = (ImageView) findViewById(R.id.plante_image);
        TextView textname = (TextView) findViewById(R.id.plantename);
        TextView texttype = (TextView) findViewById(R.id.plantetype);
        TextView namelatin = (TextView) findViewById(R.id.nomlatin);
        TextView textfamille = (TextView) findViewById(R.id.plantefamille);
        TextView textutilite = (TextView) findViewById(R.id.partieUti);
        TextView textutiliteCtxt = (TextView) findViewById(R.id.partieUtiContxt);
        TextView posologie = (TextView) findViewById(R.id.plantePosologie);
        TextView posologieCtxt = (TextView) findViewById(R.id.plantePosologieCtxt);
        TextView emploi = (TextView) findViewById(R.id.panteEmploi);
        TextView emploiCtxt = (TextView) findViewById(R.id.panteEmploiCtxt);
        TextView propriete = (TextView) findViewById(R.id.PlantPropriete);
        TextView proprieteCtxt = (TextView) findViewById(R.id.PlantProprieteCtxt);



        // Get intent data
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("PlanteName");

        SQLiteHelper db = new SQLiteHelper(getBaseContext());
        PlantesMedicinales plante = db.getPlante(name);
        db.close();

        textname.setText(plante.getName().toString());
        texttype.setText(plante.getType().toString());
        namelatin.setText(plante.getNomLatin().toString());
        textfamille.setText(plante.getFamille());
        textutilite.setText(this.getTypeContext(plante.getPartieUtilises()));
        textutiliteCtxt.setText(this.getContext(plante.getPartieUtilises()));
        posologie.setText(this.getTypeContext(plante.getPosologie()));
        posologieCtxt.setText(this.getContext(plante.getPosologie()));
        emploi.setText(this.getTypeContext(plante.getPrecautions()));
        emploiCtxt.setText(this.getContext(plante.getPrecautions()));
        propriete.setText(this.getTypeContext(plante.getProprietes()));
        proprieteCtxt.setText(this.getContext(plante.getProprietes()));




        //   texte.setText(plante.toString());
        Resources resources = this.getResources();
        final int imageId = resources.getIdentifier(plante.getImage(), "drawable", this.getPackageName());

        image.setImageDrawable(resources.getDrawable(imageId));

    }

    private  String getTypeContext(String s)
    {
        int i=0;
        String a="",x;
        x = s.substring(i, i+1);
        while (!x.equals("\n"))
        {
            i++;
            //System.out.println(a);
            a = a+x;
            x = s.substring(i, i+1);

        }
        return a;
    }
    private  String getContext(String s)
    {
        int i=0;
        String a="",b="",x;
        x = s.substring(i, i+1);
        while (!x.equals("\n"))
        {
            i++;
            //System.out.println(a);
            a = a+x;
            x = s.substring(i, i+1);

        }

        b=s.replaceAll(a,"");
        return b;
    }


    public void buttonSave(View view) {
        // EditText txt = (EditText)findViewById(R.id.EDITE);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("PlanteName");


        Toast.makeText(PlanteDetail.this,"Plante sauvgardée ", Toast.LENGTH_LONG).show();


        SQLiteHelper db = new SQLiteHelper(getBaseContext());
        PlantesMedicinales plante = db.getPlante(name);
        db.close();
        MainActivity.favor.add(plante.getName().toString());
        MainActivity.MAJ = true;
    }
}
