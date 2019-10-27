package com.example.acer.finalapp;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by User on 21/04/2017.
 */

public class Historique extends AppCompatActivity{

    private final  int taille_max_history = 30;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historique);
        //int pos = getIntent().getExtras().getInt("position");

        ListView lv = (ListView)findViewById(R.id.historiquelist);
        //   final Intent myi =  new Intent(this,Main2Activity.class);
        DBconnections database = new DBconnections(this);
        ArrayList<String > arraylist = database.getAllrecord();int i ;



        if (MainActivity.MAJ){
            for (i=0;i<MainActivity.favor.size();i++)
            {
                busave(MainActivity.favor.get(i).toString());
            }
            MainActivity.favor.clear();

            MainActivity.MAJ = false;
        }
        final Intent myi =  new Intent(this,PlanteDetail.class);



        arraylist = database.getAllrecord();
        final ArrayList<String > array = arraylist;

        lv.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arraylist));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {;


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(getApplicationContext(),arraylist.get(i).toString(),Toast.LENGTH_SHORT).show();
                //Intent myi = new Intent(this, Main2Activity.class);
                //TextView txt = (TextView) findViewById(R.id.textView) ;
                //txt.setText("hhhhh");

                myi.putExtra("PlanteName",array.get(i).toString());

                startActivity(myi);}
        });
    }

   /* public void buSave(View view) {
        EditText txt = (EditText)findViewById(R.id.editText);
        ListView lv = (ListView)findViewById(R.id.LV);
        DBconnections db = new DBconnections(this);
        db.InsertRowAdmin(txt.getText().toString());

        ArrayList<String > arrlist = db.getAllrecord();
        lv.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrlist));
    }*/

    /*public void buupdate(View view) {

        EditText txtname = (EditText)findViewById(R.id.editText);
        EditText txtid = (EditText)findViewById(R.id.txt_id);
        ListView lv = (ListView)findViewById(R.id.LV);
        DBconnections db = new DBconnections(this);
        db.update(txtname.getText().toString(),Integer.parseInt(txtid.getText().toString()));
        ArrayList<String > arrlist = db.getAllrecord();
        lv.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrlist));
        txtid.setText("");
        txtname.setText("");
    }*/

    /*public void budelete(View view) {
        EditText txtid = (EditText)findViewById(R.id.txt_id);
        ListView lv = (ListView)findViewById(R.id.LV);
        DBconnections db = new DBconnections(this);
        db.delete(Integer.parseInt(txtid.getText().toString()));
        ArrayList<String > arrlist = db.getAllrecord();
        lv.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrlist));
        txtid   .setText("");
    }*/

    public void deleteAll(View view) {
        ListView lv = (ListView)findViewById(R.id.historiquelist);
        DBconnections db = new DBconnections(this);

        ArrayList<String > arrlist = db.getAllrecord();
        int s = arrlist.size();int i;


        Toast.makeText(Historique.this, "Suppression de l'historique ...", Toast.LENGTH_LONG).show();

        for (i=0;i<s;i++)
        {
            db.delete(Integer.valueOf(i+1));}



        arrlist = db.getAllrecord();
        lv.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrlist));

    }
    public void busave(String mot) {
        //  EditText txt =(EditText)findViewById(R.id.EssaiText);
        //String mot = txt.getText().toString();
        ListView lv = (ListView) findViewById(R.id.historiquelist);
        DBconnections db = new DBconnections(this);
        ArrayList<String> arrlist = db.getAllrecord();
        int s = arrlist.size();
        Integer id = new Integer(Integer.valueOf(1));
        int i;
        if (s == taille_max_history) {
            for (i = 1; i < taille_max_history; i++) {
                db.update(arrlist.get(i - 1).toString(), Integer.valueOf(i + 1));
            }
            db.update(mot, id); //  txt.getText().toString() ---> nom de la plante
        } else {
            if (s == 0) {
                db.InsertRowAdmin(mot);//  txt.getText().toString() ---> nom de la plante
            } else db.InsertRowAdmin(arrlist.get(s - 1).toString());
            for (i = s - 1; i > 0; i--) {
                db.update(arrlist.get(i - 1).toString(), Integer.valueOf(i + 1));
            }
            if (s != 0) db.update(mot, id);//  txt.getText().toString() ---> nom de la plante
        }
    }



   /* public void busave(View view) {
        //EditText txt = (EditText)findViewById(R.id.esaitxt);
        ListView lv = (ListView)findViewById(R.id.historiquelist);
        DBconnections db = new DBconnections(this);
        ArrayList<String > arrlist = db.getAllrecord();
        int s = arrlist.size();
        Integer id = new Integer(Integer.valueOf(1));
        int i;
        if (s == taille_max_history )
        {
            for (i=1;i<taille_max_history;i++)
            {
                db.update(arrlist.get(i-1).toString(),Integer.valueOf(i+1));
            }
            db.update(txt.getText().toString(),id); //  txt.getText().toString() ---> nom de la plante
        }
        else
        {
            if (s == 0)
            {
                db.InsertRowAdmin(txt.getText().toString());//  txt.getText().toString() ---> nom de la plante
            }
            else  db.InsertRowAdmin(arrlist.get(s-1).toString());
            for (i=s-1;i>0;i--)
            {
                db.update(arrlist.get(i-1).toString(),Integer.valueOf(i+1));
            }
            if (s != 0) db.update(txt.getText().toString(),id);//  txt.getText().toString() ---> nom de la plante
        }




        arrlist = db.getAllrecord();

        lv.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrlist));



       // txt.setText("");
    }*/
}
