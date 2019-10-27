package com.example.acer.finalapp;

import android.support.annotation.NonNull;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.*;

import java.util.ArrayList;

public class typeadapter extends ArrayAdapter{
    private Integer[] tab_images_pour_la_liste = {
            R.drawable.fruit,
            R.drawable.fleur,
            R.drawable.feuille,
            R.drawable.plante};



    String[] plante = new String[]{"Fruit","Fleur","Feuille","Plante"};


    public typeadapter(ReconnaissanceActivity context, String[] typeList) {
        super(context,R.layout.type,typeList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.type, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.txtType);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgType);
        textView.setText(plante[position]);

        if(convertView == null )
            imageView.setImageResource(tab_images_pour_la_liste[position]);
        else
            rowView = (View)convertView;

        return rowView;
    }
}

