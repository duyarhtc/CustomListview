package com.example.hatice.ders2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Kisi> list=new ArrayList<Kisi>();
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.liste);


        list.add(new Kisi("hatice",true));
        list.add(new Kisi("ali",false));
        list.add(new Kisi("veli",false));
        list.add(new Kisi("ayse",true));

       ÖzelAdaptör adp=new ÖzelAdaptör(this,list);
        lv.setAdapter(adp);




    /*  lv.setOnItemClickListener(new AdapterView.OnItemLongClickListener() {//iteme tıklayınca toast üzerinde bilgilerini gösterecek
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "veri:", Toast.LENGTH_LONG).show();

        }  }
        )


*/





    }
}
