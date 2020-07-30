package com.example.bilp210_5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {



    private TextView textView;
    private boolean durum;
    private Button buton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView=findViewById(R.id.textview);
        buton=findViewById(R.id.buton);
        durum=true;



    }




    public void yazdir(View view) {
        textView.setText("TextView içweiği yazdir metodu ile değiştirildi");
        if(durum) {

            textView.setText("hELLO WORLD");
            textView.setBackgroundColor(RED);
            buton.setText("Mesaj 2");
        }
        else {

            textView.setText("MERHABA DÜNA ");
            textView.setBackgroundColor(GREEN);
            buton.setText("Mesaj 1");
        }
        durum=!durum;
    }
}