package com.example.aplikasiidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kelas extends AppCompatActivity {

    Button btn7a, btn7b, btn7c, btn7d, btn8a, btn8b, btn8c, btn8d, btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas);
        btn7a = (Button) findViewById(R.id.btn7a);
        btn7b = (Button) findViewById(R.id.btn7b);
        btn7c = (Button) findViewById(R.id.btn7c);
        btn7d = (Button) findViewById(R.id.btn7d);
        btn8a = (Button) findViewById(R.id.btn8a);
        btn8b = (Button) findViewById(R.id.btn8b);
        btn8c = (Button) findViewById(R.id.btn8c);
        btn8d = (Button) findViewById(R.id.btn8d);
        btn9 = (Button) findViewById(R.id.btn9);

        btn7a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kelas.this,DetailKelas.class);
                intent.putExtra("KEY", "7a");
                startActivity(intent);
            }
        });

        btn7b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kelas.this,DetailKelas.class);
                intent.putExtra("KEY", "7b");
                startActivity(intent);
            }
        });

        btn7c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kelas.this,DetailKelas.class);
                intent.putExtra("KEY", "7c");
                startActivity(intent);
            }
        });

        btn7d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kelas.this,DetailKelas.class);
                intent.putExtra("KEY", "7d");
                startActivity(intent);
            }
        });

        btn8a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kelas.this,DetailKelas.class);
                intent.putExtra("KEY", "8a");
                startActivity(intent);
            }
        });

        btn8b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kelas.this,DetailKelas.class);
                intent.putExtra("KEY", "8b");
                startActivity(intent);
            }
        });

        btn8c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kelas.this,DetailKelas.class);
                intent.putExtra("KEY", "8c");
                startActivity(intent);
            }
        });

        btn8d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kelas.this,DetailKelas.class);
                intent.putExtra("KEY", "8d");
                startActivity(intent);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kelas.this,DetailKelas.class);
                intent.putExtra("KEY", "9");
                startActivity(intent);
            }
        });

    }

}
