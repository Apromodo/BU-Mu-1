package com.example.bilp210_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Ulke> ulkeler;
    private ListView listView;
    private ArrayAdapter<Ulke> adaptor;
    private TextView dogruTV,yanlisTV;
    private int dogru=0,yanlis=0;
    private TextView baskentTV;
    private Random random;
    private int rastgele;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ulkeler=new ArrayList<Ulke>();                                                               //ulkeler=new Ulke[5];

        ulkeler.add(new Ulke("Türkiye","Ankara","Asya avrupa"));                  //ulkeler[0] =new Ulke("türkiye","ankara","asya,avrupa")
        ulkeler.add(new Ulke("Almanya","Berlin","avrupa"));
        ulkeler.add(new Ulke("Arjantin","Buenos aires","güney amerika"));
        ulkeler.add(new Ulke("kanada","Ottawa","Kuzey amerika"));
        ulkeler.add(new Ulke("Japonya","Tokyo","Asya"));


        baskentTV=findViewById(R.id.baskentTV);
        dogruTV=findViewById(R.id.dogruTV);
        yanlisTV=findViewById(R.id.yanlisTV);

        listView=findViewById(R.id.listView);
        adaptor=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ulkeler);
        listView.setAdapter(adaptor);


        random=new Random();
        rastgele=random.nextInt(ulkeler.size());                                                     //(int) (Math.random()*5)
        baskentTV.setText(ulkeler.get(rastgele).getBaskent());


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int sira, long id) {


                if (sira==rastgele)
                {
                    dogru++;
                    dogruTV.setText(""+dogru);
                } else {
                    yanlis++;
                    yanlisTV.setText(""+yanlis);
                }
                rastgele=random.nextInt(ulkeler.size()); //(int) (Math.random()*5)
                baskentTV.setText(ulkeler.get(rastgele).getBaskent());
            }
        });


    }
}