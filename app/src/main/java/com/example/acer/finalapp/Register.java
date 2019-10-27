package com.example.acer.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void buconnect (View view) {
        Intent intent_connexion = new Intent(this,MainActivity.class);
        startActivity(intent_connexion);
    }
}
