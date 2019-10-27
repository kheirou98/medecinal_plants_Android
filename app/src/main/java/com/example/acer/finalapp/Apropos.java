package com.example.acer.finalapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Apropos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apropos);
        TextView txt = (TextView)findViewById(R.id.aproposTXT);
        txt.setText("LADJOUZI Bachir\n" +
                "TABELLOUT Youcef\n"+"ZINE Hocine\n"+"MEDKOUR Kheir Eddine\n"+"CHENNOUF Mohamed Amine\n"+
                "GACEM Tarek"
        );
        TextView txt0 = (TextView)findViewById(R.id.about);
        txt0.setText("Plants captured \n" +
                "est une applicaton \n" +
                "destinee aux pharmaciens \n" +
                "et medecines pour leur facilite\n" +
                "la reconnaissance d'une plante\n" +
                "medicinale");

    }

    public void webSite(View view) {

        Toast.makeText(this, "Ouverture du site DEVit ...", Toast.LENGTH_LONG).show();
        Intent browserintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/esi.dz/devit/accueil"));
        startActivity(browserintent);
    }

    public void Facebook(View view) {
        Toast.makeText(this, "Ouverture du notre page facebook ...", Toast.LENGTH_LONG).show();
        Intent browserintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/DEVit-1233852490057173/"));
        startActivity(browserintent);

    }
}
