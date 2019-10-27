package com.example.acer.finalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Users extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        RecyclerView recyclerview = findViewById(R.id.recyclerview);
        ArrayList<String> users = new ArrayList();
        for (int i=0;i<10;i++){
            users.add("User"+i);
        }
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(new UsersAdapter(users));
    }
}
