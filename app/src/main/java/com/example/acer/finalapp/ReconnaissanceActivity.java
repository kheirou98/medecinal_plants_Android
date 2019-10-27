package com.example.acer.finalapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import static com.example.acer.finalapp.R.id.apropos;
import static com.example.acer.finalapp.R.id.txtType;

public class ReconnaissanceActivity extends AppCompatActivity {
    String type;
    ListView listview_plante;
    String[] plantes = new String[]{"Fruit","Fleur","Feuille","Plante"};

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
       // Toast.makeText(ReconnaissanceActivity.this, "Recherche de la plante dans la base de donnèe", Toast.LENGTH_LONG).show();

        setContentView(R.layout.activity_reconnaissance);
        listview_plante = (ListView) findViewById(R.id.listView1);
        typeadapter myadapter=new typeadapter(ReconnaissanceActivity.this,plantes);
        listview_plante.setAdapter(myadapter);
        listview_plante.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {

               Toast.makeText(ReconnaissanceActivity.this, "Recherche de la plante dans la base de donnèe ...", Toast.LENGTH_LONG).show();
                String affiche=plantes[position];
                if( position==0)
                    type="Fruit";
                if (position==1)
                    type="Fleur";
                if (position==2)
                    type="Feuille";
                if (position==3)
                    type="Plante";



                //     Toast.makeText(getApplicationContext(),affiche,Toast.LENGTH_LONG).show();

                Intent intent = new Intent(ReconnaissanceActivity.this, ResultActivity.class);
                byte[] bytes = getIntent().getByteArrayExtra("bitmapbytes");
                Bitmap imgInt = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);

                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgInt.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] bytess = stream.toByteArray();

                intent.putExtra("bitmapbytes",bytess);
                intent.putExtra("type",type);

                startActivity(intent);
            }
        });
    }
}
