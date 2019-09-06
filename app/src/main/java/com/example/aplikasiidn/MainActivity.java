package com.example.aplikasiidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnkelas, btnasrama, btnjadwal, btninfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnkelas = (Button) findViewById(R.id.btnkelas);
        btnasrama = (Button) findViewById(R.id.btnasrama);
        btnjadwal = (Button) findViewById(R.id.btnjadwal);
        btninfo = (Button) findViewById(R.id.btninfo);

        btnkelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Kelas.class);
                startActivity(intent);
            }
        });

        btnasrama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Asrama.class);
                startActivity(intent);
            }
        });

        btnjadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Jadwal.class);
                startActivity(intent);
            }
        });

        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Info.class);
                startActivity(intent);
            }
        });

    }

}
