package com.example.aplikasiidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info extends AppCompatActivity {

    Button btnsejarah, btnstruktur, btnpembuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        btnsejarah = (Button) findViewById(R.id.btnsejarah);
        btnstruktur = (Button) findViewById(R.id.btnstruktur);
        btnpembuat = (Button) findViewById(R.id.btnpembuat);

        btnsejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Info.this,Sejarah.class);
                startActivity(intent);
            }
        });

        btnstruktur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Info.this,Struktur.class);
                startActivity(intent);
            }
        });

        btnpembuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Info.this,Pembuat.class);
                startActivity(intent);
            }
        });
    }
}
