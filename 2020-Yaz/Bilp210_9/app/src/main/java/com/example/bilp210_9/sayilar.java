package com.example.bilp210_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.PriorityQueue;

public class sayilar extends AppCompatActivity {

    private String[] sayilar;
    private ListView sayilarLV;
    private ArrayAdapter<String> adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayilar);
        sayilar=new String[]{"Bir-One", "İki-Two", "Üç-Three", "Dört-Four", "Beş-Five", "Altı-Six","Yedi-Seven", "Sekiz-Eight", "Dokuz-Nine", "On-Ten"};

        sayilarLV=findViewById(R.id.sayilarLV);
        adaptor=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,sayilar);
        sayilarLV.setAdapter(adaptor);
    }
}