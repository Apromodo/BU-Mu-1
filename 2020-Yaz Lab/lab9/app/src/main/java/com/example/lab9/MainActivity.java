package com.example.lab9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<HavaDurumu> havaD;
    private String[] hava;
    private ListView havaLV;
    private ArrayAdapter<HavaDurumu> adaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        havaD=new ArrayList<HavaDurumu>();

        havaD.add(new HavaDurumu("Ankara","Güneşli"," 28.3 C"));
        havaD.add(new HavaDurumu("Adana","Güneşli"," 32.5 C"));
        havaD.add(new HavaDurumu("Erzurum","Parçalı Bulutlu"," 23.6 C"));
        havaD.add(new HavaDurumu("Rize","Yağışlı"," 25.2 C"));
        havaD.add(new HavaDurumu("İzmir","Güneşli"," 30.0 C"));

        havaLV=findViewById(R.id.havaLV);
        adaptor=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,havaD);
        havaLV.setAdapter(adaptor);



        //hava=new String[] {"Ankara 28.3 C\nGüneşli", "Adana 32.5 C \nGüneşli", "Erzurum 23.6 C\nParçalı Bulutlu", "Rize 25.5 C\nYağışlı", "İzmir 30.3 C\nGüneşli"};

        //havaLV=findViewById(R.id.havaLV);
        //adaptor=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,hava);
        //havaLV.setAdapter(adaptor);


    }
}