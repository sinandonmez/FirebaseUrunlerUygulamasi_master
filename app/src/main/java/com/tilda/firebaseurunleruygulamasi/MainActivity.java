package com.tilda.firebaseurunleruygulamasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Urun> urunArrayList;
    OzelAdapter ozelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urunArrayList = new ArrayList<>();
        urunArrayList.add(new Urun(null, "001","Deneme Ürün 1", 100));
        urunArrayList.add(new Urun(null, "002","Deneme Ürün 2", 200));
        urunArrayList.add(new Urun(null, "003","Deneme Ürün 3", 300));
        urunArrayList.add(new Urun(null, "004","Deneme Ürün 4", 400));


        listView = findViewById(R.id.listView);
        ozelAdapter = new OzelAdapter(this, urunArrayList);
        listView.setAdapter(ozelAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Urun secilenUrun = urunArrayList.get(position);
                Intent i = new Intent(MainActivity.this, EkleActivity.class);
                i.putExtra("urunNesnesi", secilenUrun);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.item_ekle){
            Intent i = new Intent(this, EkleActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
