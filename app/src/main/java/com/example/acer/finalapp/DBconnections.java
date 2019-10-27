package com.example.acer.finalapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by User on 25/02/2017.
 */

public class    DBconnections extends SQLiteOpenHelper {

    public  static  final String DbName = "mystudent.db";
    public  static  final int version = 1;
    public DBconnections(Context context) {
        super(context, DbName, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table IF NOT EXISTS admin (id INTEGER  primary Key,name TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("Drop table if EXISTS admin");
        onCreate(db);

    }

    public void InsertRowAdmin(String name)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("name",name);
        db.insert("admin",null,contentValues);
    }

    public  ArrayList getAllrecord()
    {
        ArrayList array_List = new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from admin",null);
        res.moveToFirst();
        while (res.isAfterLast() == false)
        {
            array_List.add(res.getString(res.getColumnIndex("name")));
            // res.getString(res.getColumnIndex("id"))+"  "+
            res.moveToNext();
        }
        return array_List;
    }

    public void delete (Integer id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from admin where id="+Integer.toString(id));

    }

    public void update (String name,Integer id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("update admin set name='" +name+"' where id = "+Integer.toString(id));
    }
}
