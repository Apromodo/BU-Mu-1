package com.example.bilp210_kaya_unal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btn0,btnC,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    private TextView cevap;


    String basilan;
    String basilan2;
    String basilan3;
    String basilan4;
    String basilan5;
    String basilan6;
    String basilan7;
    String basilan8;
    String basilan0;





    String cevapSifirla;

    //private Button[] tumSayilar;

    //private TextView sonucTV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gorselleriTanit();

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);

        btnC.setOnClickListener(this);

        cevap.setOnClickListener(this);




    }



    private void gorselleriTanit(){

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);

        btnC=findViewById(R.id.btnC);

        cevap=findViewById(R.id.cevap);

    }


    @Override
    public void onClick(View v) {


        //Button butnTik=(Button) V;
        //String varolan=sonucTV.getText().toString();
        //sonucTV.setText(varolan+butnTik.getText().toString());


        if (v.getId()==btn1.getId()) {
            basilan = "1";
            cevap.setText("" + basilan);

        }

        if (v.getId()==btn2.getId()) {
            basilan2 ="2";
            cevap.setText("" + basilan2);

        }

        if (v.getId()==btn3.getId()) {
            basilan3 = "3";
            cevap.setText("" + basilan3);
        }

        if (v.getId()==btn4.getId()) {
            basilan4 = "4";
            cevap.setText("" + basilan4);
        }

        if (v.getId()==btn5.getId()) {
            basilan5 = "5";
            cevap.setText("" + basilan5);
        }

        if (v.getId()==btn6.getId()) {
            basilan6 = "6";
            cevap.setText("" + basilan6);
        }

        if (v.getId()==btn7.getId()) {
            basilan7 = "7";
            cevap.setText("" + basilan7);
        }

        if (v.getId()==btn8.getId()) {
            basilan8 = "8";
            cevap.setText("" + basilan8);
        }

        if (v.getId()==btn0.getId()) {
            basilan0 = "0";
            cevap.setText("" + basilan0);
        }


        cevap.setText(""+basilan+basilan2+basilan3+basilan4+basilan5+basilan6+basilan7+basilan8+basilan0);

        if (v.getId()==btnC.getId()) {
            cevapSifirla = "0";
            cevap.setText("" + cevapSifirla);

        }



    }
}