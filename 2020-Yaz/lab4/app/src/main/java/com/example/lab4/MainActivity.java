package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText s1ET, s2ET;
    private TextView sonucTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1ET = findViewById(R.id.s1ET);
        s2ET = findViewById(R.id.s2ET);
        sonucTV = findViewById(R.id.sonucTV);

    }

    public void topla(View view) {
        double s1 = Double.parseDouble(s1ET.getText().toString());
        double s2 = Double.parseDouble(s2ET.getText().toString());
        double sonuc = s1 + s2;
        sonucTV.setText("= " + sonuc);
        s1ET.setText("");
        s2ET.setText("");
    }

    public void cikar(View view) {
        double s1 = Double.parseDouble(s1ET.getText().toString());
        double s2 = Double.parseDouble(s2ET.getText().toString());
        double sonuc = s1 - s2;
        sonucTV.setText("= " + sonuc);
        s1ET.setText("");
        s2ET.setText("");
    }

    public void carp(View view) {
        double s1 = Double.parseDouble(s1ET.getText().toString());
        double s2 = Double.parseDouble(s2ET.getText().toString());
        double sonuc = s1 * s2;
        sonucTV.setText("= " + sonuc);
        s1ET.setText("");
        s2ET.setText("");
    }

    public void bol(View view) {
        double s1 = Double.parseDouble(s1ET.getText().toString());
        double s2 = Double.parseDouble(s2ET.getText().toString());
        double sonuc = s1 / s2;
        sonucTV.setText("= " + sonuc);
        s1ET.setText("");
        s2ET.setText("");
    }
}