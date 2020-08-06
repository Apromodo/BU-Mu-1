package com.example.bilp210_6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button topla,cikar,carp,bol;
    private EditText sayi1ET,sayi2ET;
    private TextView sonucTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gorselleriTanit();
        topla.setOnClickListener(this);
        cikar.setOnClickListener(this);
        carp.setOnClickListener(this);
        bol.setOnClickListener(this);


    }

    private void gorselleriTanit() {


        topla=findViewById(R.id.topla);
        cikar=findViewById(R.id.cikar);
        carp=findViewById(R.id.carp);
        bol=findViewById(R.id.bol);
        sayi1ET=findViewById(R.id.sayi1ET);
        sayi2ET=findViewById(R.id.sayi2ET);
        sonucTV=findViewById(R.id.sonucTV);

    }

    @Override
    public void onClick(View v) {
        String str1 = sayi1ET.getText().toString();
        String str2 = sayi2ET.getText().toString();

        double sayi1=Double.parseDouble(str1);
        double sayi2=Double.parseDouble(str2);

        double sonuc;

        if (v.getId()==topla.getId())
            sonuc=sayi1+sayi2;
        else if(v.getId()==cikar.getId())
            sonuc=sayi1-sayi2;
        else if(v.getId()==carp.getId())
            sonuc=sayi1*sayi2;
        else
            sonuc=sayi1/sayi2;


        sonucTV.setText("= "+sonuc);
    }
}