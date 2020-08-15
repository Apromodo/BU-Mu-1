package com.example.bilp210_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button sayilarButon,aileButon,renklerButon,cumlelerButon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sayilarButon=findViewById(R.id.sayilarButon);
        aileButon=findViewById(R.id.aileButon);
        renklerButon=findViewById(R.id.renklerButon);
        cumlelerButon=findViewById(R.id.cumlelerButon);



        sayilarButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,sayilar.class);
                startActivity(intent);
            }
        });

        aileButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,aile.class);
                startActivity(intent);
            }
        });

        renklerButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,renkler.class);
                startActivity(intent);
            }
        });

        cumlelerButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,cumleler.class);
                startActivity(intent);
            }
        });




    }


}