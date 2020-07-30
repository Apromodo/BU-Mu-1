package com.example.bilp210_5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private int sayac = 0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
    }

    public void azalt(View view) {
        sayac--;
        textView.setText("SAYAÇ = "+sayac);

    }

    public void artir(View view) {
        sayac++;
        textView.setText("SAYAÇ = "+sayac);
    }
}