package com.example.acer.finalapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

import java.util.ArrayList;

public class SQLiteHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "PlantesDB.sqlite";

    String tableName = "PLANTES";
    String sqlCreateQuery = "CREATE TABLE IF NOT EXISTS PLANTES(Id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR,image VARCHAR,nomLatin VARCHAR,famille VARCHAR ,type VARCHAR, proprietes VARCHAR,posologie VARCHAR,precautions VARCHAR, partieUtilises VARCHAR )";

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void queryData(String sql) {
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }

    public void insertData(String name, String image, String nomLatin, String famille,String type, String proprietes,
                           String posologie, String precautions, String partieUtilises) {
        SQLiteDatabase database = getWritableDatabase();
        String sql = "INSERT INTO PLANTES VALUES (NULL,?,?,?,?,?,?,?,?,?)";


        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1, name);
        statement.bindString(2, image);
        statement.bindString(3, nomLatin);
        statement.bindString(4, famille);
        statement.bindString(5,type);
        statement.bindString(6, proprietes);
        statement.bindString(7, posologie);
        statement.bindString(8, precautions);
        statement.bindString(9, partieUtilises);

        statement.executeInsert();
    }

    public Cursor getData(String sql) {
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql, null);
    }

    public ArrayList<PlantesMedicinales> getAllPlantes(  ) {
        ArrayList<PlantesMedicinales> plantes = new ArrayList<PlantesMedicinales>();
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM " + tableName, null);

        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(0);
                String name = cursor.getString(1);
                String image = cursor.getString(2);
                String nomLatin = cursor.getString(3);
                String famille = cursor.getString(4);
                String type =cursor.getString(5);
                String proprietes = cursor.getString(6);
                String partieUtilises = cursor.getString(7);
                String posologie = cursor.getString(8);
                String precautions = cursor.getString(9);


                PlantesMedicinales plante = new PlantesMedicinales(name, image, id, nomLatin, famille,type,
                        proprietes, partieUtilises, posologie, precautions);
                // Add info to plantes list
                plantes.add(plante);
            } while (cursor.moveToNext());
        }

        cursor.close();
        return plantes;
    }


    public PlantesMedicinales getPlante(String name) {
        PlantesMedicinales plante = null;
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM " + tableName + " WHERE name='" + name + "'", null);

        if (cursor.moveToFirst()) {

            int id = cursor.getInt(0);
            //String name = cursor.getString(1);
            String image = cursor.getString(2);
            String nomLatin = cursor.getString(3);
            String famille = cursor.getString(4);
            String type =cursor.getString(5);
            String proprietes = cursor.getString(6);
            String partieUtilises = cursor.getString(7);
            String posologie = cursor.getString(8);
            String precautions = cursor.getString(9);

            plante = new PlantesMedicinales(name, image, id, nomLatin, famille,type,
                    proprietes, partieUtilises, posologie, precautions);
        }

        cursor.close();
        return plante;
    }

    // --------------------------- Filtrer les plantes par leurs type -----------------------//
    public ArrayList<PlantesMedicinales> getType(String type){
        ArrayList<PlantesMedicinales> plantes = new ArrayList<PlantesMedicinales>();
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM " + tableName+ " WHERE type LIKE '"+"%" + type + "%'", null);
        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(0);
                String name = cursor.getString(1);
                String image = cursor.getString(2);
                String nomLatin = cursor.getString(3);
                String famille = cursor.getString(4);
                //String type =cursor.getString(5);
                String proprietes = cursor.getString(6);
                String partieUtilises = cursor.getString(7);
                String posologie = cursor.getString(8);
                String precautions = cursor.getString(9);
                PlantesMedicinales plante = new PlantesMedicinales(name, image, id, nomLatin, famille,type,
                        proprietes, partieUtilises, posologie, precautions);
                plantes.add(plante);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return plantes;
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // create data table
        sqLiteDatabase.execSQL(sqlCreateQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + tableName);
        this.onCreate(sqLiteDatabase);
    }
    public ArrayList<PlantesMedicinales> getsearch (String nom) {
        ArrayList<PlantesMedicinales> plantes = new ArrayList<PlantesMedicinales>();
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM " + tableName+ " WHERE name LIKE '"+nom+ "%'", null);
        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(0);
                String name = cursor.getString(1);
                String image = cursor.getString(2);
                String nomLatin = cursor.getString(3);
                String famille = cursor.getString(4);
                String type =cursor.getString(5);
                String proprietes = cursor.getString(6);
                String partieUtilises = cursor.getString(7);
                String posologie = cursor.getString(8);
                String precautions = cursor.getString(9);
                PlantesMedicinales plante = new PlantesMedicinales(name, image, id, nomLatin, famille,type,
                        proprietes, partieUtilises, posologie, precautions);
                // Add info to plantes list
                plantes.add(plante);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return plantes;
    }
    public ArrayList<String> getAllname () {
        ArrayList<String> arrlist = new ArrayList<>() ;
        SQLiteDatabase db = getReadableDatabase() ;
        Cursor cursor = db.rawQuery("SELECT name FROM " + tableName, null);
        if (cursor.moveToFirst()) {
            do {
                String name = cursor.getString(0) ;
                // Add info to plantes list
                arrlist.add(name);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return arrlist;

    }

     public ArrayList<String> getAlltheme (){
         ArrayList<String> arrlist = new ArrayList<>() ;
         arrlist.add("Plante");
         arrlist.add("Fruit");
         arrlist.add("Fleur");
         arrlist.add("Feuille");
         return arrlist;
    }




}
