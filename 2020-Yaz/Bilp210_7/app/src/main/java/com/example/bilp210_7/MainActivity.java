package com.example.bilp210_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView adetTV,ucretTV;
    private Button artirButon,azaltButon,siparisButon;

    private int adet = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adetTV=findViewById(R.id.adetTV);
        ucretTV=findViewById(R.id.ucretTV);
        azaltButon=findViewById(R.id.azaltButon);
        artirButon=findViewById(R.id.artirButon);
        siparisButon=findViewById(R.id.siparisButon);




        azaltButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(adet>0)
                    adet--;
                adetTV.setText(""+adet);
                ucretTV.setText(adet*20+"TL");

            }
        });

        artirButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adet++;
                adetTV.setText(""+adet);
                ucretTV.setText(adet*20+"TL");
            }
        });

        siparisButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mesaj="sipariş alındı: "+adet*20+"TL";
                Toast.makeText(getApplicationContext(),mesaj,Toast.LENGTH_LONG).show();
                ucretTV.setText("0 TL");
                adetTV.setText("0");
                adet=0;

            }
        });

    }
}