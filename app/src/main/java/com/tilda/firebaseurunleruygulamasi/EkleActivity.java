package com.tilda.firebaseurunleruygulamasi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EkleActivity extends AppCompatActivity {
    TextView txt_key;
    EditText edt_urun_kodu;
    EditText edt_urun_adi;
    EditText edt_fiyat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekle);

        txt_key = findViewById(R.id.textView);
        edt_urun_kodu = findViewById(R.id.editText);
        edt_urun_adi = findViewById(R.id.editText2);
        edt_fiyat = findViewById(R.id.editText3);

        Urun gelenUrun = (Urun) getIntent().getSerializableExtra("urunNesnesi");
        if(gelenUrun!=null){
            txt_key.setText(gelenUrun.getKey());
            edt_urun_kodu.setText(gelenUrun.getUrunKodu());
            edt_urun_adi.setText(gelenUrun.getUrunAdi());
            edt_fiyat.setText(String.valueOf(gelenUrun.getFiyat()));
        }

    }

    public void btnEkle(View v){

        String urunKodu = edt_urun_kodu.getText().toString();
        String urunAdi = edt_urun_adi.getText().toString();
        double fiyat = Double.parseDouble(edt_fiyat.getText().toString());

        Urun yeniUrun = new Urun(null, urunKodu, urunAdi, fiyat);

        //Firebase-ekleme kodları
    }
    public void btnDuzelt(View v){
        String key = txt_key.getText().toString();
        String urunKodu = edt_urun_kodu.getText().toString();
        String urunAdi = edt_urun_adi.getText().toString();
        double fiyat = Double.parseDouble(edt_fiyat.getText().toString());

        Urun degistirilenUrun = new Urun(key, urunKodu, urunAdi, fiyat);

        //Firebase-düzeltme kodları
    }
    public void btnSil(View v){

        String key = txt_key.getText().toString();

        //Firebase-silme kodları
    }
}
