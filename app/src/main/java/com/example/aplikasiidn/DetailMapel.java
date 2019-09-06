package com.example.aplikasiidn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMapel extends AppCompatActivity {

    ImageView ivSenin, ivSelasa, ivRabu, ivKamis, ivJumat, ivSabtu, ivdaftarguru, ivBeda, ivdaftarpelajaran,
            waktusenin, waktuselasa, wakturabu, waktukamis, waktujumat;

    TextView tvJudulMapel;

    String idJadwal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mapel);
        idJadwal = getIntent().getStringExtra("KEY 3");
        tvJudulMapel = findViewById(R.id.tvJudulMapel);
        ivBeda = findViewById(R.id.ivBeda);
        ivdaftarguru = findViewById(R.id.ivdaftarguru);
        ivdaftarpelajaran = findViewById(R.id.ivdaftarpelajaran);
        ivSenin = findViewById(R.id.ivSenin);
        ivSelasa = findViewById(R.id.ivSelasa);
        ivRabu = findViewById(R.id.ivRabu);
        ivKamis= findViewById(R.id.ivKamis);
        ivJumat = findViewById(R.id.ivJumat);
        ivSabtu = findViewById(R.id.ivSabtu);
        waktusenin = findViewById(R.id.waktusenin);
        waktuselasa = findViewById(R.id.waktuselasa);
        wakturabu = findViewById(R.id.wakturabu);
        waktukamis= findViewById(R.id.waktukamis);
        waktujumat = findViewById(R.id.waktujumat);

        if (idJadwal.equals("jadwal7")){
            tvJudulMapel.setText("Jadwal Kelas 7");
            waktusenin.setImageResource(R.drawable.waktu8);
            waktuselasa.setImageResource(R.drawable.waktu8);
            wakturabu.setImageResource(R.drawable.waktu8);
            waktukamis.setImageResource(R.drawable.waktu8);
            waktujumat.setImageResource(R.drawable.waktu8);
            ivSenin.setImageResource(R.drawable.senin7);
            ivSelasa.setImageResource(R.drawable.selasa7);
            ivRabu.setImageResource(R.drawable.rabu7);
            ivKamis.setImageResource(R.drawable.kamis7);
            ivJumat.setImageResource(R.drawable.jumat7);
            ivSabtu.setImageResource(R.drawable.sabtu7);
            ivdaftarguru.setImageResource(R.drawable.guru7);
            ivBeda.setImageResource(R.drawable.waktusabtu8);
            ivdaftarpelajaran.setImageResource(R.drawable.daftarpelajaran);
        }else if (idJadwal.equals("jadwal8")){
            tvJudulMapel.setText("Jadwal Kelas 8");
            waktusenin.setImageResource(R.drawable.waktu8);
            waktuselasa.setImageResource(R.drawable.waktu8);
            wakturabu.setImageResource(R.drawable.waktu8);
            waktukamis.setImageResource(R.drawable.waktu8);
            waktujumat.setImageResource(R.drawable.waktu8);
            ivSenin.setImageResource(R.drawable.senin8);
            ivSelasa.setImageResource(R.drawable.selasa8);
            ivRabu.setImageResource(R.drawable.rabu8);
            ivKamis.setImageResource(R.drawable.kamis8);
            ivJumat.setImageResource(R.drawable.jumat8);
            ivSabtu.setImageResource(R.drawable.sabtu8);
            ivdaftarguru.setImageResource(R.drawable.guru8);
            ivBeda.setImageResource(R.drawable.waktusabtu8);
            ivdaftarpelajaran.setImageResource(R.drawable.daftarpelajaran);
        }else if (idJadwal.equals("jadwal9")){
            tvJudulMapel.setText("Jadwal Kelas 9");
            ivSenin.setImageResource(R.drawable.senin9);
            ivSelasa.setImageResource(R.drawable.selasa9);
            ivRabu.setImageResource(R.drawable.rabu9);
            ivKamis.setImageResource(R.drawable.kamis9);
            ivJumat.setImageResource(R.drawable.jumat9);
            ivSabtu.setImageResource(R.drawable.sabtu9);
            ivBeda.setImageResource(R.drawable.waktusabtu);
            waktusenin.setImageResource(R.drawable.waktu1);
            waktuselasa.setImageResource(R.drawable.waktu1);
            wakturabu.setImageResource(R.drawable.waktu1);
            waktukamis.setImageResource(R.drawable.waktu1);
            waktujumat.setImageResource(R.drawable.waktu1);
        }
    }
}
