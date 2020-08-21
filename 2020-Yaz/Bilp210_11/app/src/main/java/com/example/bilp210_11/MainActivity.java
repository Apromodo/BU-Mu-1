package com.example.bilp210_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private Button getirButon;
    private EditText plakaET;
    private TextView ilAdiTV;
    private String jsonCevabi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getirButon=findViewById(R.id.getirButon);
        plakaET=findViewById(R.id.plakeET);
        ilAdiTV=findViewById(R.id.ilAdiTV);

        jsonCevabi = dosyadanOku("iller.json");
    }

    private String dosyadanOku(String dosyadanOku) {
        //try'dan sonra normal parantez() açıp kapatıp, satırı bu parantezler arasına taşıdık
        StringBuilder sb=new StringBuilder();
        try (InputStream is = getAssets().open(dosyadanOku);
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

    public void getir(View view) {

        try {
            JSONObject kokJO = new JSONObject(jsonCevabi);
            String plaka = plakaET.getText().toString();
            String ilAdi = kokJO.getString(plaka);
            ilAdiTV.setText("plakasını girdiniz il:\n" + ilAdi);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}