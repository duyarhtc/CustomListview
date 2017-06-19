package com.example.hatice.ders2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hatice on 11.06.2017.
 */

public class ÖzelAdaptör extends BaseAdapter {//4 ana methodu var count,ıtem,ıtemıd,getview


    private LayoutInflater Inflater;
    private List<Kisi> liste = new ArrayList<Kisi>();


    public ÖzelAdaptör(Activity activity, List<Kisi> liste) {

        Inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.liste = liste;
    }

    @Override
    public int getCount() {
        return liste.size();
    }

    @Override
    public Object getItem(int position) {
        return liste.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;

        satirView = Inflater.inflate(R.layout.satir_layout, null);
        TextView textView = (TextView) satirView.findViewById(R.id.isimSoyisim);
        ImageView imageView = (ImageView) satirView.findViewById(R.id.simge);

        Kisi kisi = liste.get(position);
        textView.setText(kisi.getIsim());

        if (kisi.isKadinMi()) {
            imageView.setImageResource(R.mipmap.ic_female);
        }
        else {
            imageView.setImageResource(R.mipmap.ic_male);
        }
        return satirView;


    }

}
