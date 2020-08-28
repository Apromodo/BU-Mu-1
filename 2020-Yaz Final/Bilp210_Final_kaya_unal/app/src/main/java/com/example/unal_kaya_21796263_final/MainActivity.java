package com.example.unal_kaya_21796263_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Futbolcular> futbolcular;
    private ListView listView;
    private ArrayAdapter<Futbolcular> adaptor;
    private ArrayList<Integer> fusba;
    private String jsonCevabi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        futbolcular = new ArrayList<Futbolcular>();

        futbolcular.add(new Futbolcular(43, "luka modric", "orta saha", 10));
        futbolcular.add(new Futbolcular(44, "cristiano Ronaldo", "Forvet", 7));
        futbolcular.add(new Futbolcular(3192, "Sergio Ramos", "defans", 4));
        futbolcular.add(new Futbolcular(47, "Toni Kroos", "orta saha", 8));
        futbolcular.add(new Futbolcular(48, "Marcelo", "defans", 12));


        listView = findViewById(R.id.listView);
        adaptor = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, futbolcular);
        listView.setAdapter(adaptor);

        fusba = new ArrayList<>();
        jsonCevabi = dosyadanOku("futbolcular.json");

        try {
            JSONArray kokJA = new JSONArray(jsonCevabi);
            for (int i = 0; i < kokJA.length(); i++) {
                JSONObject ilJO = kokJA.getJSONObject(i);
                int ilAdi = ilJO.getInt("numara");
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //int numara= Integer.parseInt(noET.getText().toString());

                //Toast.makeText(this,"asd",toString(futbolcular).length().show();
                //Toast.makeText(this,"123",Toast.LENGTH_LONG).show();
            }
        });

    }

    private String dosyadanOku (String dosyaAdi){
        //try'dan sonra normal parantez() açıp kapatıp, satırı bu parantezler arasına taşıdık
        StringBuilder sb = new StringBuilder();
        try (InputStream is = getAssets().open(dosyaAdi);
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader br = new BufferedReader(isr);
        ) {
            String satir = br.readLine();//İLK SATIRI OKU
            while (satir != null) {//SON OKUNAN SATIR NULL OLMADIĞI SÜRECE;sb'ye ekle ve bir daha oku
                sb.append(satir);
                satir = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();//okuduğumuz satırları içinde biriktirdiğimiz sb'yi döndür
    }

}