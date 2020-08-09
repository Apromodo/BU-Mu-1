package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button takimA3,takimA2,takimA1;
    private Button takimB3,takimB2,takimB1;
    private Button sifirla;

    private TextView takimASC,takimBSC;

    int sonucA = 0;
    int sonucB = 0;
    int sifir = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gorselleriTanit();

        takimA1.setOnClickListener(this);
        takimA2.setOnClickListener(this);
        takimA3.setOnClickListener(this);

        takimB1.setOnClickListener(this);
        takimB2.setOnClickListener(this);
        takimB3.setOnClickListener(this);

        sifirla.setOnClickListener(this);




    }

    private void gorselleriTanit() {

        takimA3=findViewById(R.id.takimA3);
        takimA2=findViewById(R.id.takimA2);
        takimA1=findViewById(R.id.takimA1);

        takimB3=findViewById(R.id.takimB3);
        takimB2=findViewById(R.id.takimB2);
        takimB1=findViewById(R.id.takimB1);

        takimASC=findViewById(R.id.takimASC);
        takimBSC=findViewById(R.id.takimBSC);

        sifirla=findViewById(R.id.sifirla);



    }

    @Override
    public void onClick(View v) {


        if (v.getId()==takimA3.getId())
            sonucA=sonucA+3;
        else if (v.getId()==takimA2.getId())
            sonucA=sonucA+2;
        else if (v.getId()==takimA1.getId())
            sonucA=sonucA+1;

        takimASC.setText(""+sonucA);



        if (v.getId()==takimB3.getId())
            sonucB=sonucB+3;
        else if (v.getId()==takimB2.getId())
            sonucB=sonucB+2;
        else if (v.getId()==takimB1.getId())
            sonucB=sonucB+1;

        takimBSC.setText(""+sonucB);


        if (v.getId()==sifirla.getId())
            sonucA=0;
            takimASC.setText(""+sonucA);

        if (v.getId()==sifirla.getId())
            sonucB=0;
            takimBSC.setText(""+sonucB);

}


}