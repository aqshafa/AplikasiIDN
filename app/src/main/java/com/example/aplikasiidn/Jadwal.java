package com.example.aplikasiidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jadwal extends AppCompatActivity {

    Button btnjadwalmapel, btnjadwalekskul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);
        btnjadwalmapel = (Button) findViewById(R.id.btnjadwalmapel);
        btnjadwalekskul = (Button) findViewById(R.id.btnjadwalekskul);

        btnjadwalmapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jadwal.this,DetailJadwal2.class);
                startActivity(intent);
            }
        });

        btnjadwalekskul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jadwal.this,DetailJadwal.class);
                startActivity(intent);
            }
        });
    }
}
