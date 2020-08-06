package com.example.bilp210_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buton;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buton=findViewById(R.id.buton);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);

        buton.setOnClickListener(this);//bizden onlicklistener arayüzü uygulayan bir sınıf ait nesene (sınıf )bekliyor

    }


    @Override
    public void onClick(View v) {

        String mesaj=editText.getText().toString();
        textView.setText(mesaj);
        editText.setText("");

    }
}