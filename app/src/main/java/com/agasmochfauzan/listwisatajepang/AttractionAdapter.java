package com.agasmochfauzan.listwisatajepang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Attribut> places;

    public void setAttraction(ArrayList<Attribut>places){
        this.places= places;
    }

    public AttractionAdapter(Context context) {
        this.context = context;

    }

    @Override
    public int getCount() //Mengembalikan deretan data di Attribut
    {
        return places.size();
    }

    @Override
    public Object getItem(int i) {
        return places.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null)//Menmanggil layout(itemwisata.xml) yang akan tampil di context (default:MainActivity) tapi ini masih kosong
        {
            view = LayoutInflater.from(context)
                    .inflate(R.layout.itemwisata,viewGroup,false);
        }
        //Mengisi layout pada class diatas
        ViewHolder viewHolder = new ViewHolder(view);
        Attribut place= (Attribut) getItem(i);
        viewHolder.bind(place);
        return view;
    }
    private class ViewHolder{
        private TextView txtname;
        private TextView txtdescription;
        private ImageView imgPhoto;

        //Melakukan Pemisalan dan mengambil kepada itemwisata.xml
        ViewHolder (View view){
            txtname=view.findViewById(R.id.text_name);
            txtdescription=view.findViewById(R.id.textdeksripsi);
            imgPhoto=view.findViewById(R.id.img_photo);

        }

        //Variabel.setText ([tipe data] place Attraction.get())
        //Memasukan datanya kepada kelas attraction
        void bind (Attribut places){
            txtname.setText(places.getNamawisata());
            txtdescription.setText(places.getDeskripsiwisata());
            imgPhoto.setImageResource(places.getImage());
        }
    }



}
