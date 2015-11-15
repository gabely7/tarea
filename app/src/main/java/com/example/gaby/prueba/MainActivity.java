package com.example.gaby.prueba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void siguienteActivity (View view){
        Intent intent =new Intent(this,Pozos.class);
        startActivity(intent);
    }
    public void siguienteActivitydos (View view){
       Intent intent =new Intent(this,favoritos.class);
       startActivity(intent);
    }
}
