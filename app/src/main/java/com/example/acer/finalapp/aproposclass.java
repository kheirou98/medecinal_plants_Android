package com.example.acer.finalapp;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class aproposclass extends Fragment {

    public List<ListItem> ligne = new ArrayList<ListItem>();


    public View onCreate(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View myview=inflater.inflate(R.layout.apropos,container,false);

        poulateList();
        /* fonction populatelistview**************************************************************/
        final ArrayAdapter<ListItem> adapter = new MyListAdapter();
        ListView Lv = (ListView) myview.findViewById(R.id.LV);
        Lv.setAdapter(adapter);
        Lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TextView txtname =(TextView) view.findViewById(R.id.textView);
                // if (position == 2)        Toast.makeText(getApplicationContext(),txtname.getText(),Toast.LENGTH_LONG).show();
                if (position == (ligne.size() - 1)) {

                    Toast.makeText(getActivity().getApplicationContext(), "Ouverture du site DEVit ...", Toast.LENGTH_LONG).show();
                    Intent browserintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/esi.dz/devit/accueil"));
                    startActivity(browserintent);
                }
                else

                    Toast.makeText(getActivity().getApplicationContext(),ligne.get(position).instr,Toast.LENGTH_LONG).show();


                //adapter.getContext();
                adapter.notifyDataSetChanged();

            }
        });
/***************************************************************************************************************/
        return myview;
    }

    public void poulateList()
    {
        ligne.add(new ListItem(R.drawable.a,"Ne prenez pas des photos lointains"));
        ligne.add(new ListItem(R.drawable.b,"Eviter les image non clair ou flou"));
        ligne.add(new ListItem(R.drawable.c,"Ne prenez pas en photos les feuilles sur l'arbre"));
        ligne.add(new ListItem(R.drawable.d,"Mettez votre plante sur un fond blanc"));
        ligne.add(new ListItem(R.drawable.e,"Prenez la photo sur un seul element de la plante"));
        ligne.add(new ListItem(R.drawable.devit,"Pour visiter notre site cliquez ci-dessus"));


    }

   /* public void populateLV()
    {
        final ArrayAdapter<ListItem> adapter = new MyListAdapter();
        ListView Lv = (ListView) findViewById(R.id.LV);
        Lv.setAdapter(adapter);
        Lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // TextView txtname =(TextView) view.findViewById(R.id.textView);
               // if (position == 2)        Toast.makeText(getApplicationContext(),txtname.getText(),Toast.LENGTH_LONG).show();
                if (position == (ligne.size() - 1)) {

                    Toast.makeText(getApplicationContext(), "Ouverture du site DEVit ...", Toast.LENGTH_LONG).show();
                    Intent browserintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/esi.dz/devit/accueil"));
                    startActivity(browserintent);
                }
                else

                    Toast.makeText(getApplicationContext(),ligne.get(position).instr,Toast.LENGTH_LONG).show();


                //adapter.getContext();
                adapter.notifyDataSetChanged();

            }
        });

    }*/


    private class MyListAdapter extends ArrayAdapter<ListItem>
    {
        public MyListAdapter()
        {
            super(getActivity().getApplicationContext(),R.layout.itemss,ligne);
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View itemView  = convertView;
            if (itemView == null)
            {
                itemView = getActivity().getLayoutInflater().inflate(R.layout.itemss,parent,false);
            }


            ListItem temp = ligne.get(position);

            ImageView tpic = (ImageView)itemView.findViewById(R.id.imageView);
            TextView txtdes =(TextView) itemView.findViewById(R.id.textViewfinal);
            txtdes.setText(temp.instr);


            // ImageView fpic = (ImageView)itemView.findViewById(R.id.imageView2);

            tpic.setImageResource(temp.Pic);
            //  fpic.setImageResource(temp.falsePic);

            // return super.getView(position, convertView, parent);
            return itemView;
        }
    }
    public  static aproposclass newInstance(){
        aproposclass fragment = new aproposclass();
        return fragment;
    }

}
