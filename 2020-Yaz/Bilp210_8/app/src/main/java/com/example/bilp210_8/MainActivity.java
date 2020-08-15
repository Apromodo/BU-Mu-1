package com.example.bilp210_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private Button[] rakamButonlari=new Button[10];
    private int[] rakamIdleri={R.id.b0,R.id.b1,R.id.b2,R.id.b3,R.id.b4,R.id.b5,R.id.b6,R.id.b7,R.id.b8,R.id.b9};
    private TextView sonucTV;

    private Button[] islemButonlari=new Button[4];
    private int[] islemIdleri ={R.id.bTopla,R.id.bCikar,R.id.bCarp,R.id.bBol};


    private char islem;
    private double sayi1,sayi2,sonuc;

    private Button bEsittir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonucTV=findViewById(R.id.sonucTV);


        for (int i= 0; i < rakamIdleri.length;i ++) {
            rakamButonlari[i]=findViewById(rakamIdleri[i]);
            rakamButonlari[i].setOnClickListener(this);

        }



        IslemDinleyici islemDinleyici=new IslemDinleyici();
        for(int i=0;i<islemIdleri.length;i++){
            islemButonlari[i]=findViewById(islemIdleri[i]);
            islemButonlari[i].setOnClickListener(islemDinleyici);
        }



        bEsittir=findViewById(R.id.bEsittir);
        bEsittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sayiStr=sonucTV.getText().toString();
                sayi2=Double.parseDouble(sayiStr);

                switch (islem){
                    case '+':
                        sonuc=sayi1+sayi2;
                        break;
                    case '-':
                        sonuc=sayi1-sayi2;
                        break;
                    case 'x':
                        sonuc=sayi1*sayi2;
                        break;
                    case '/':
                        sonuc=sayi1/sayi2;
                        break;
                }
                sonucTV.setText(""+sonuc);
            }
        });

    }


    @Override
    public void onClick(View v) {
        //hangi rakam butonunna tıklanırsa bu metod çalışıcak

        String onceki=sonucTV.getText().toString();
        sonucTV.setTextSize(36-sonucTV.length());

        for (int i= 0; i < rakamIdleri.length;i ++){
            if (v.getId()==rakamIdleri[i]){
                sonucTV.setText(onceki+i);

                break;
            }
        }


    }


    public void temizle(View view) {
        sonucTV.setText("");
    }


    public void nokta(View view) {

        sonucTV.setText(sonucTV.getText().toString()+".");
    }


    class IslemDinleyici implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.bTopla:
                    islem='+';
                    break;
                case R.id.bCikar:
                    islem='-';
                    break;
                case R.id.bCarp:
                    islem='x';
                    break;
                case R.id.bBol:
                    islem='/';
                    break;

            }
            String sayiStr=sonucTV.getText().toString();
            sayi1=Double.parseDouble(sayiStr);
            sonucTV.setText("");




        }
    }



}