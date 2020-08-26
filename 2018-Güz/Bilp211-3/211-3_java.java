package com.example.orhun.a0911;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView fiyattw, miktartw;
    Button btn1, btn2;
   int miktar=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     fiyattw=findViewById(R.id.fiyattw);
     miktartw=findViewById(R.id.miktartw);
     btn1=findViewById(R.id.btn1);
     btn2=findViewById(R.id.btn2);


     btn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             miktar++;
             fiyattw.setText(""+miktar*5+"TL");
         }
     });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                miktar--;
                if (miktar>0){
                    fiyattw.setText(""+miktar);
                }

            }
        });




    }
}