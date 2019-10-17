package com.agasmochfauzan.listwisatajepang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    //Mendesklarasikan variabel dan membuat variabel
    private String [] datanama;
    private String [] datadeskripsi;
    private TypedArray dataPhoto;
    private AttractionAdapter adapter;
    private ArrayList <Attribut> places ;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Menambahkan tampilan listview ke Main Activity
        adapter = new AttractionAdapter(this);
        listView = findViewById(R.id.list_view);

        prepare();
        addItem();
    }
    //Mengisikan kedalam ArrayList kepada Attribut
    private void addItem() {
        places = new ArrayList<>();
        for (int i=0; i < datanama.length; i++){
            Attribut place = new Attribut();
            place.setImage(dataPhoto.getResourceId(i,-1));
            place.setNamawisata(datanama[i]);
            place.setDeskripsiwisata(datadeskripsi[i]);
            places.add(place);
        }
        adapter.setAttraction(places);
        listView.setAdapter(adapter);
    }
    private void prepare (){
        datanama = getResources()
                .getStringArray(R.array.namadata);
        datadeskripsi = getResources()
                .getStringArray(R.array.namadeskripsi);
        dataPhoto = getResources()
                .obtainTypedArray(R.array.image);
    }
}
