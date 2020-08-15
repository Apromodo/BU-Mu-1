package com.example.bilp210_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class renkler extends AppCompatActivity {

    private String[] renkler;
    private ListView renklerLV;
    private ArrayAdapter<String> adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renkler);
        renkler=new String[] {"Kırmızı-Red", "Sarı-Yellow", "Mavi-Blue", "Yeşil-Green", "Siyah-Black", "Gri-Grey"};

        renklerLV=findViewById(R.id.renklerLV);
        adaptor=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,renkler);
        renklerLV.setAdapter(adaptor);


    }
}