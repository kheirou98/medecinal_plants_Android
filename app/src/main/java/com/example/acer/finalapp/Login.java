package com.example.acer.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      /*  forgetmdp.setOnClickListener {
            val manager = supportFragmentManager.beginTransaction()
            val popupclass = popup()
            popupclass.show(manager, null)
        }
        cnx.setOnClickListener {
            if (numero.text.toString()==""){
                Toast.makeText(this,"Veuillez remplir les champs de la connexion svp!", LENGTH_SHORT).show()
            }
            else {
                if(mdp.text.toString()=="") {
                    Toast.makeText(this,"Veuillez remplir le champs du mot de passe svp!",LENGTH_SHORT).show()
                }
                else{
                    val builder =  AlertDialog.Builder(this)
                    val dialogView = layoutInflater.inflate(R.layout.progress_dialog,null)
                    val messages = dialogView.findViewById <TextView>(R.id.message)
                            messages.text =  " Connexion en cours ... "
                    builder.setView(dialogView)
                    builder.setCancelable(false)
                    val dialog = builder.create()
                    dialog.show()
                    var  intent_navigation=Intent(this@Login_form, navigation::class.java).apply { putExtra("bool","vrai") }
                    startActivity(intent_navigation)
                }
            }
        }*/
    }
    public void buInscription (View view) {
            Intent intent_register = new Intent(this,Register.class);
            startActivity(intent_register);
    }
    public void buConnexion (View view) {
        Intent intent_connexion = new Intent(this,MainActivity.class);
        startActivity(intent_connexion);
    }
}
