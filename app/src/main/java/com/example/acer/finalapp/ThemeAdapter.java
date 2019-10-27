package com.example.acer.finalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class ThemeAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<String > themesList;

    public ThemeAdapter(Context context, int layout, ArrayList<String> themesList) {
        this.context = context;
        this.layout = layout;
        this.themesList = themesList;
    }



    @Override
    public int getCount() {
        return themesList.size();
    }

    @Override
    public Object getItem(int position) {
        return themesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View row = view;
        ViewHolder holder = new ViewHolder();

        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);
            holder.txtName = (TextView) row.findViewById(R.id.txtName2);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }

        String theme = themesList.get(position);

        holder.txtName.setText(theme);



        return row;
    }


    private class ViewHolder {

        TextView txtName;
    }

}
