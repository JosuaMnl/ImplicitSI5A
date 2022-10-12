package com.yosha10.implicitsi5a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Deklarasi
    EditText etUrl, etLokasi, etText;
    Button btnBukaWebsite, btnBukaLokasi, btnBagikanTeks;
    String getUrl, getLokasi, getText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menyambungkan id edit text di layout
        etUrl = findViewById(R.id.et_url);
        etLokasi = findViewById(R.id.et_lokasi);
        etText = findViewById(R.id.et_teks);

        // Menyambungkan id button di layout
        btnBukaWebsite = findViewById(R.id.btn_buka_website);
        btnBukaLokasi = findViewById(R.id.btn_buka_lokasi);
        btnBagikanTeks = findViewById(R.id.btn_bagikan_teks);

        // OnClick Listener button buka wesbite
        btnBukaWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUrl = etUrl.getText().toString();
                // Menguraikan text menjadi sebuah alamat URL
                Uri uriUrlWebsite = Uri.parse(getUrl);

                // Parameter pertama ACTION_VIEW dan yang parameter kedua adalah link website
                Intent intentWebsite = new Intent(Intent.ACTION_VIEW, uriUrlWebsite);

                // Handle Error jika link yang di input salah dan belum diisi
                try {
                    startActivity(intentWebsite);
                } catch (Exception e){
                    etUrl.setError("URL Tidak Sesuai!");
                }
            }
        });

        // OnClick Listener button buka lokasi
        btnBukaLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // OnClick Listener button bagikan teks
        btnBagikanTeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}