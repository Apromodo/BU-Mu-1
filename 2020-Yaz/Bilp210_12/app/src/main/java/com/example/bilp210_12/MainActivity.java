package com.example.bilp210_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String jsonCevabi;
    private ArrayList<String> iller;
    private ListView listView;
    private ArrayAdapter<String> adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        iller=new ArrayList<>();
        jsonCevabi=dosyadanOku("il_ilce.json");


        try {
            JSONArray kokJA=new JSONArray(jsonCevabi);
            for (int i=0;i<kokJA.length();i++) {
                JSONObject ilJO=kokJA.getJSONObject(i);
                String ilAdi=ilJO.getString("il");
                iller.add(ilAdi);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


        adaptor=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,iller);
        listView.setAdapter(adaptor);


    }

    private String dosyadanOku(String dosyaAdi) {
        //try'dan sonra normal parantez() açıp kapatıp, satırı bu parantezler arasına taşıdık
        StringBuilder sb=new StringBuilder();
        try (InputStream is = getAssets().open(dosyaAdi);
             InputStreamReader isr=new InputStreamReader(is);
             BufferedReader br=new BufferedReader(isr);
        ) {
            String satir=br.readLine();//İLK SATIRI OKU
            while(satir!=null) {//SON OKUNAN SATIR NULL OLMADIĞI SÜRECE;sb'ye ekle ve bir daha oku
                sb.append(satir);
                satir = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();//okuduğumuz satırları içinde biriktirdiğimiz sb'yi döndür
    }



}