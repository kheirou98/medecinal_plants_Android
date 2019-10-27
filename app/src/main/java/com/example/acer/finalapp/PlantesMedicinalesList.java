package com.example.acer.finalapp;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentContainer;
import android.support.v4.app.FragmentController;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class PlantesMedicinalesList extends Fragment {

    Button btnsearch ;
    ListView listView;
    ArrayList<PlantesMedicinales> list;
    PlantesMedicinalesListAdapter adapter = null;
    AutoCompleteTextView autoCompleteTextView;


    /**************************************************************************************************************************/
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myview = inflater.inflate(R.layout.list_items, container, false) ;
        listView = (ListView) myview.findViewById(R.id.listView);
        btnsearch= (Button) myview.findViewById(R.id.button5) ;
        // get all data from sqlite

        SQLiteHelper db = new SQLiteHelper(getActivity().getBaseContext()) ;
       /*------------------------------------------Pour afficher les noms qui commence par les lettres rechercheés dans la BDD----------------------------------------------------------*/
        ArrayList<String > arrlist = db.getAllname() ;

        String [] texts = arrayToTab(arrlist) ;
        autoCompleteTextView = (AutoCompleteTextView) myview.findViewById(R.id.edtName);
        ArrayAdapter adapter_h = new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,texts);
        autoCompleteTextView.setAdapter(adapter_h);
        /********************************************************************************************************************************/
        /*--------------------pour l'affichage de toute la base de données --------------------------------------------------------*/
        list = db.getAllPlantes();
        db.close();
        Log.i("Plantes Number", Integer.toString(list.size()));
        adapter = new PlantesMedicinalesListAdapter(getActivity().getApplicationContext(), R.layout.list_item, list);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                Intent intent = new Intent(getActivity().getApplicationContext(), PlanteDetail.class);
                intent.putExtra("PlanteName", list.get(position).getName());

                startActivity(intent);
            }
        });

        /************************************* fonction du button search *************************************************/
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

     /*----------------------------FOnction  de button de recherche---------------------------------------------------------*/
                SQLiteHelper db = new SQLiteHelper(getActivity().getBaseContext());
                //ArrayList<String > arrlist = db.getAllrecord();

                list = db.getsearch(autoCompleteTextView.getText().toString());

                db.close();
                Log.i("Plantes Number", Integer.toString(list.size()));

                //list = MainActivity.sqLiteHelper.getAllPlantes();
                adapter = new PlantesMedicinalesListAdapter(getActivity().getApplicationContext(), R.layout.list_item, list);
                listView.setAdapter(adapter);
                adapter.notifyDataSetChanged();

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> a, View v, int position,
                                            long id) {
                        Intent intent = new Intent(getActivity().getApplicationContext(), PlanteDetail.class);
                        intent.putExtra("PlanteName", list.get(position).getName());
                        startActivity(intent);
                    }
                });
            }
        });
        /******************************************************************************************************************/


        return myview;
    }

    /*-------------------------------------- fonction de convertion d'un ARRAYLIST vers UN tABLEAU----------------------------------*/
    public String[] arrayToTab(ArrayList<String> arrayList)
    {
        int s = arrayList.size();
        String []Tab = new String[s];
        int i;
        for(i=0;i<s;i++)    Tab[i]=arrayList.get(i).toString();

        return Tab;
    }
/*********************************************************************************************************************************/









    /**********************************************************************************************/

    public static PlantesMedicinalesList newInstance() {
        PlantesMedicinalesList fragment = new PlantesMedicinalesList();
        return fragment;
    }



    /***************************************************************************************************/


}
