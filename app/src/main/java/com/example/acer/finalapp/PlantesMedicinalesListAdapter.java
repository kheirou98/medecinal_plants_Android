package com.example.acer.finalapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlantesMedicinalesListAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<PlantesMedicinales> plantesList;

    public PlantesMedicinalesListAdapter(Context context, int layout, ArrayList<PlantesMedicinales> plantesList) {
        this.context = context;
        this.layout = layout;
        this.plantesList = plantesList;
    }



    @Override
    public int getCount() {
        return plantesList.size();
    }

    @Override
    public Object getItem(int position) {
        return plantesList.get(position);
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
            holder.txtName = (TextView) row.findViewById(R.id.txtName);
            holder.imageView = (ImageView) row.findViewById(R.id.imgPlante);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }

        PlantesMedicinales plantes = plantesList.get(position);

        holder.txtName.setText(plantes.getName());

        Bitmap bmp = decodeURI(plantes.getImage());
        holder.imageView.setImageBitmap(bmp);

        return row;
    }

    /**
     * This method is to scale down the image
     */
    public Bitmap decodeURI(String name) {

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;

        //BitmapFactory.decodeFile(filePath, options);
        int imageId = context.getResources().getIdentifier(name, "drawable", context.getPackageName());
        BitmapFactory.decodeResource(context.getResources(), imageId, options);

        // Only scale if we need to
        // (16384 buffer for img processing)
        Boolean scaleByHeight = Math.abs(options.outHeight - 100) >= Math.abs(options.outWidth - 100);
        if (options.outHeight * options.outWidth * 2 >= 16384) {
            // Load, scaling to smallest power of 2 that'll get it <= desired dimensions
            double sampleSize = scaleByHeight
                    ? options.outHeight / 100
                    : options.outWidth / 100;
            options.inSampleSize =
                    (int) Math.pow(2d, Math.floor(
                            Math.log(sampleSize) / Math.log(2d)));
        }

        // Do the actual decoding
        options.inJustDecodeBounds = false;
        options.inTempStorage = new byte[512];
        Bitmap output = BitmapFactory.decodeResource(context.getResources(), imageId, options);

        return output;
    }

    private class ViewHolder {
        ImageView imageView;
        TextView txtName;
    }

}