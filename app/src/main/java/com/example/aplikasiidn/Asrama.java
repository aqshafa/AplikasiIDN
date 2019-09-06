package com.example.aplikasiidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Asrama extends AppCompatActivity {
    Button btnumar, btnkhalid, btnutsman, btnali, btnthoriq, btnabdurrahaman, btnasrama9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asrama);
        btnumar = (Button) findViewById(R.id.btnumar);
        btnkhalid = (Button) findViewById(R.id.btnkhalid);
        btnutsman = (Button) findViewById(R.id.btnutsman);
        btnali = (Button) findViewById(R.id.btnali);
        btnthoriq = (Button) findViewById(R.id.btnthoriq);
        btnabdurrahaman = (Button) findViewById(R.id.btnabdurrahman);
        btnasrama9 = (Button) findViewById(R.id.btnasrama9);


        btnumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Asrama.this,DetailAsrama.class);
                intent.putExtra("KEY 1", "asramaumar");
                startActivity(intent);
            }
        });

        btnkhalid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Asrama.this,DetailAsrama.class);
                intent.putExtra("KEY 1", "asramakhalid");
                startActivity(intent);
            }
        });

        btnutsman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Asrama.this,DetailAsrama.class);
                intent.putExtra("KEY 1", "asramautsman");
                startActivity(intent);
            }
        });

        btnali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Asrama.this,DetailAsrama.class);
                intent.putExtra("KEY 1", "asramaali");
                startActivity(intent);
            }
        });

        btnthoriq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Asrama.this,DetailAsrama.class);
                intent.putExtra("KEY 1", "asramathoriq");
                startActivity(intent);
            }
        });

        btnabdurrahaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Asrama.this,DetailAsrama.class);
                intent.putExtra("KEY 1", "asramaabdurrahman");
                startActivity(intent);
            }
        });

        btnasrama9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Asrama.this,DetailAsrama.class);
                intent.putExtra("KEY 1", "asrama9");
                startActivity(intent);
            }
        });

    }
}
