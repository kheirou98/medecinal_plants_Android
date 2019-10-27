package com.example.acer.finalapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ThemeList extends Fragment {

    ListView listView2;
    ArrayList<String> list;
    ThemeAdapter adapter = null;



    /**************************************************************************************************************************/
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myview = inflater.inflate(R.layout.theme_list, container, false) ;
        listView2 = (ListView) myview.findViewById(R.id.LVt);
        //btnsearch= (Button) myview.findViewById(R.id.button5) ;
        // get all data from sqlite

        SQLiteHelper db = new SQLiteHelper(getActivity().getBaseContext()) ;
       /********************************************************************************************************************************/
        /*--------------------pour l'affichage de toute la base de données --------------------------------------------------------*/
        list = db.getAlltheme();
        db.close();
        Log.i("Plantes Number", Integer.toString(list.size()));
        adapter = new ThemeAdapter(getActivity().getApplicationContext(), R.layout.theme, list);
        listView2.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
               Intent myintent= new Intent(getActivity().getApplicationContext(),aproposclass.class);
                startActivity(myintent);

            }
        });




        return myview;
    }
    public static ThemeList newInstance() {
        ThemeList fragment = new ThemeList();
        return fragment;
    }
}
