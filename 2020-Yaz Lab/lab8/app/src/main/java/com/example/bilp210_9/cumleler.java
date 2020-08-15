package com.example.bilp210_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class cumleler extends AppCompatActivity {

    private String[] cumleler;
    private ListView cumlelerLV;
    private ArrayAdapter<String> adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cumleler);
        cumleler=new String[] {"you shall not pass-Geçemezsiniz", "guns lots of guns-silah çok fazla silah"};

        cumlelerLV=findViewById(R.id.cumlelerLV);
        adaptor=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,cumleler);
        cumlelerLV.setAdapter(adaptor);


    }
}