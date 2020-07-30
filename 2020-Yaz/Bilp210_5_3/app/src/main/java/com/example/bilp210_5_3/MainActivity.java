package com.example.bilp210_5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText adET;
    private EditText soyAdET;
    private EditText noET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adET=findViewById(R.id.adET);
        soyAdET=findViewById(R.id.soyAdET);
        noET=findViewById(R.id.noET);
    }





    public void kaydet(View view) {
        String ad=adET.getText().toString();
        String soyad=soyAdET.getText().toString();
        int numara= Integer.parseInt(noET.getText().toString());

        Toast.makeText(this,"bilgileriniz alınmıştır",Toast.LENGTH_LONG).show();

    }
}