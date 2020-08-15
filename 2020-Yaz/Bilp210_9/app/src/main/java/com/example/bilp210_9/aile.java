package com.example.bilp210_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class aile extends AppCompatActivity {

    private ArrayList<String> aileList;
    private ListView aileLV;
    private ArrayAdapter<String> adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aile);
        aileList=new ArrayList<String>();
        aileList.add("Anne-Mother");
        aileList.add("Baba-Father");
        aileList.add("Abi-Brother");
        aileList.add("Kardeş-Sister");
        aileList.add("Büyükanne-Grandmother");
        aileList.add("Büyükbaba-Grandfather");

        aileLV=findViewById(R.id.aileLV);
        adaptor=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,aileList);
        aileLV.setAdapter(adaptor);
    }
}