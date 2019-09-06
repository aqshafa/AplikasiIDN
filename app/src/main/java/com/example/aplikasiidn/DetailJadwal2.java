package com.example.aplikasiidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailJadwal2 extends AppCompatActivity {

        Button btnjadwal7, btnjadwal8, btnjadwal9;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail_jadwal2);
            btnjadwal7 = (Button) findViewById(R.id.btnjadwal7);
            btnjadwal8 = (Button) findViewById(R.id.btnjadwal8);
            btnjadwal9 = (Button) findViewById(R.id.btnjadwal9);

            btnjadwal7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DetailJadwal2.this, DetailMapel.class);
                    intent.putExtra("KEY 3", "jadwal7");
                    startActivity(intent);
                }
            });

            btnjadwal8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DetailJadwal2.this, DetailMapel.class);
                    intent.putExtra("KEY 3", "jadwal8");
                    startActivity(intent);
                }
            });

            btnjadwal9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DetailJadwal2.this, DetailMapel.class);
                    intent.putExtra("KEY 3", "jadwal9");
                    startActivity(intent);
                }
            });

        }

    }
