package com.example.aplikasiidn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailKelas extends AppCompatActivity {

    String[] nama7a = {"1. Abdullah agna alfayad",
            "2. Abdullah zidane",
            "3. Abdurrahman raqi",
            "4. Abdurrazzaq",
            "5. Abiyyu adiyarto sulaeman",
            "6. Ahmad dzakki",
            "7. Ahmad fachry saputro",
            "8. Ahmad fathir",
            "9. Aiyyub al anshori",
            "10. Ajriel rizqy maulana",
            "11. Akma zaki alfari",
            "12. Akmal pratama irsyad n",
            "13. Allvin angga putra",
            "14. Aly zakki yaza",
            "15. Banyureksa ghaisan",
            "16. Bryan pradika",
            "17. Daffa fathur rahman",
            "18. Daffa muhammad r",
            "19. Danish olfan alif d",
            "20. Fachry fauzan f"};

    String[] nama7b = {
            "1. Fadhil zaki",
            "2. Farrel muhammad hafidz e",
            "3. Farrel ahmad ghazali",
            "4. Fatih ahmad muzakki",
            "5. Fatih rizki akbar",
            "6. Fawwaz abdul ghani",
            "7. Fihryal faqiy",
            "8. Ghatan naufarrel a",
            "9. Ghaisan raziq syams",
            "10. Giats thamami",
            "11. Habibie muhaymin ihsan",
            "12. Hauzan nabil musyafa",
            "13. Ichwan ahmadi thoriq",
            "14. Ikhsan alfharizi",
            "15. Irham abdirrohman a",
            "16. Jagat alif katulistiwa",
            "17. Khairi azzam rieffant",
            "18. M nabil",
            "19. M rasya nur bayhaqqi"};

    String[] nama7c = {"1. M umar alfatih",
            "2. M aaubindaffa arya y",
            "3. M dzakiyy aliyy kanz",
            "4. M fajri lazuardi",
            "5. M naufal suyja kurniawan",
            "6. Mohamad alif",
            "7. Muhamad azka",
            "8. Muhammad abqari nasution",
            "9. Muhammad fachri razali",
            "10. Muhammad fajri anwar",
            "11. Muhammad faris f",
            "12. Muhammad hanif sulyanto",
            "13. Muhammad myko adityo",
            "14. Muhammad naufal ilham",
            "15. Muhammad putra raditya",
            "16. Muhammad rafi al zakwan",
            "17. Muhammad yazid nur r",
            "18. Muhammad zaidan firrizq",
            "19. Munawar zaki ramadhan"};

    String[] nama7d = {"1. Murtaza ahsan",
            "2. Musthafa dzaki nugraha",
            "3. Naufal daffa alaika",
            "4. Nawfal althaf budiman",
            "5. Nayaka arvin difandi",
            "6. Noah alif sjamhudi",
            "7. Panggih bagaskoro",
            "8. Rafa satya rabbani",
            "9. Raffa zahran arraziq",
            "10. Rafi zaki al rizqi",
            "11. Raiyan abizar",
            "12. Rakha sapta fabian",
            "13. Raqin aladar syarief hakim",
            "14. Ronald edsa pratama",
            "15. Taufik ilhami",
            "16. Thoriq izzuddin ramadhan",
            "17. Wildan hanif ihfazhirrahman",
            "18. Wildan sabiq abdurrahman",
            "19. Yahya abdurrahman",
            "20. Zirjy zakwan fayyadhiya"};

    String[] nama8a = {"1. Ahmad ihsan maulana",
            "2. Althaaf ridha muhammad zaydaan batubara",
            "3. Daffa arya sofwan",
            "4. Faaris dzaki candra",
            "5. Farrel fathin nugraha",
            "6. Irsyad sholahuddin",
            "7. Khairiansyah hafidz",
            "8. Lalhuda fathin jafsyada",
            "9. Muhammad rasya hamdi syahkuan za",
            "10. Nabiih firdaus alauddin",
            "11. Wildan artha sheehan"};

    String[] nama8b = {"1. Agbi awan asyifa",
            "2. Ali akbar al amin",
            "3. Hugo kayana PR",
            "4. Muhammad Attar Hafidz",
            "5. Muhammad ficrie",
            "6. Reyhan mohhamad",
            "7. Rizaldi kurnia",
            "8. Satria hanestyo",
            "9. Sulaiman al hisyam"};

    String[] nama8c = {"1. Arinal kian r",
            "2. Azka maulana zikri",
            "3. Darrel rafa alamsyah",
            "4. Haekal syahefiran",
            "5. Ikhsan aydin zahid",
            "6. Muhammad daffa a",
            "7. Muhammad daffa d",
            "8. M nur ahsan r",
            "9. M syauqi darvastama",
            "10. Rafi nazwan m",
            "11. Saami sualaiman",
            "12. Safaraz afma affandi"};

    String[] nama8d = {"1. Abdurrahman wafi",
            "2. Ahmad miqdad",
            "3. Ananda gharyn s",
            "4. Harits",
            "5. Hilmi raditya r",
            "6. Misbah bagaskara",
            "7. Muhammad abiyyu r",
            "8. Muhammad adil mutaqin",
            "9. Muhammad akmal ahsan",
            "10. Muhammad Aqsha Munggaran",
            "11. Muhammad fadhlan wahyudi",
            "12. Rifqi hafidh suryana"};

    String[] nama9 = {"1. Abdullah sulam",
            "2. Ali zainal abidin",
            "3. Furqon afuwwu h",
            "4. Muhammad afiq a",
            "5. Muhammad azhar n",
            "6. Muhammad said",
            "7. Muhammad zein",
            "8. Sidqi athallah a",
            "9. Thalhah s",
            "10. Ziljidan ramadhan s"};

    String idKelas;

    TextView  tvNama, tvAsal, tvEmail, tvTelepon,tvJudul;

    ImageView ivGuru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kelas);
        idKelas = getIntent().getStringExtra("KEY");
        ivGuru = findViewById(R.id.ivGuru);
        tvJudul = findViewById(R.id.tvJudul);
        tvNama = findViewById(R.id.tvNama);
        tvAsal = findViewById(R.id.tvAsal);
        tvEmail = findViewById(R.id.tvEmail);
        tvTelepon = findViewById(R.id.tvTelepon);

        if (idKelas.equals("7a")){
            tvJudul.setText("Kelas 7A");
            ivGuru.setImageResource(R.drawable.aziz);
            tvNama.setText(getResources().getText(R.string.namaguru7a));
            tvAsal.setText(getResources().getText(R.string.asalguru7a));
            tvEmail.setText(getResources().getText(R.string.emailguru7a));
            tvTelepon.setText(getResources().getText(R.string.teleponguru7a));
        }else if (idKelas.equals("7b")){
            tvJudul.setText("Kelas 7B");
            ivGuru.setImageResource(R.drawable.suut);
            tvNama.setText(getResources().getText(R.string.namaguru7b));
            tvAsal.setText(getResources().getText(R.string.asalguru7b));
            tvEmail.setText(getResources().getText(R.string.emailguru7b));
            tvTelepon.setText(getResources().getText(R.string.teleponguru7b));
        }else if (idKelas.equals("7c")) {
            tvJudul.setText("Kelas 7C");
            ivGuru.setImageResource(R.drawable.ulum);
            tvNama.setText(getResources().getText(R.string.namaguru7c));
            tvAsal.setText(getResources().getText(R.string.asalguru7c));
            tvEmail.setText(getResources().getText(R.string.emailguru7c));
            tvTelepon.setText(getResources().getText(R.string.teleponguru7c));
        }else if (idKelas.equals("7d")) {
            tvJudul.setText("Kelas 7D");
            ivGuru.setImageResource(R.drawable.lucas);
            tvNama.setText(getResources().getText(R.string.namaguru7d));
            tvAsal.setText(getResources().getText(R.string.asalguru7d));
            tvEmail.setText(getResources().getText(R.string.emailguru7d));
            tvTelepon.setText(getResources().getText(R.string.teleponguru7d));
        }else if (idKelas.equals("8a")){
            tvJudul.setText("Kelas 8A");
            ivGuru.setImageResource(R.drawable.daffa);
            tvNama.setText(getResources().getText(R.string.namaguru8a));
            tvAsal.setText(getResources().getText(R.string.asalguru8a));
            tvEmail.setText(getResources().getText(R.string.emailguru8a));
            tvTelepon.setText(getResources().getText(R.string.teleponguru8a));
        }else if (idKelas.equals("8b")){
            tvJudul.setText("Kelas 8B");
            ivGuru.setImageResource(R.drawable.haidar);
            tvNama.setText(getResources().getText(R.string.namaguru8b));
            tvAsal.setText(getResources().getText(R.string.asalguru8b));
            tvEmail.setText(getResources().getText(R.string.emailguru8b));
            tvTelepon.setText(getResources().getText(R.string.teleponguru8b));
        }else if (idKelas.equals("8c")) {
            tvJudul.setText("Kelas 8C");
            ivGuru.setImageResource(R.drawable.zafraan);
            tvNama.setText(getResources().getText(R.string.namaguru8c));
            tvAsal.setText(getResources().getText(R.string.asalguru8c));
            tvEmail.setText(getResources().getText(R.string.emailguru8c));
            tvTelepon.setText(getResources().getText(R.string.teleponguru8c));
        }else if (idKelas.equals("8d")) {
            tvJudul.setText("Kelas 8D");
            ivGuru.setImageResource(R.drawable.salim);
            tvNama.setText(getResources().getText(R.string.namaguru8d));
            tvAsal.setText(getResources().getText(R.string.asalguru8d));
            tvEmail.setText(getResources().getText(R.string.emailguru8d));
            tvTelepon.setText(getResources().getText(R.string.teleponguru8d));
        }else if (idKelas.equals("9")) {
            tvJudul.setText("Kelas 9");
            ivGuru.setImageResource(R.drawable.aji);
            tvNama.setText(getResources().getText(R.string.namaguru9));
            tvAsal.setText(getResources().getText(R.string.asalguru9));
            tvEmail.setText(getResources().getText(R.string.emailguru9));
            tvTelepon.setText(getResources().getText(R.string.teleponguru9));
        }

        ListView listView = findViewById(R.id.detailList);
        AdapterKelas adapterKelas = new AdapterKelas();
        listView.setAdapter(adapterKelas);


    }


    class AdapterKelas extends BaseAdapter {

        @Override
        public int getCount() {
            if (idKelas.equals("7a")) {
                return nama7a.length;

            } else if (idKelas.equals("7b")) {
                return nama7b.length;

            } else if (idKelas.equals("7c")) {
                return nama7c.length;

            } else if (idKelas.equals("7d")) {
                return nama7d.length;

            } else if (idKelas.equals("8a")) {
                return nama8a.length;

            } else if (idKelas.equals("8b")) {
                return nama8b.length;

            } else if (idKelas.equals("8c")) {
                return nama8c.length;

            } else if (idKelas.equals("8d")) {
                return nama8d.length;

            } else{
                return nama9.length;

            }
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.raw_list, null);

            TextView textView = convertView.findViewById(R.id.tvListNama);
            if (idKelas.equals("7a")) {
                textView.setText(nama7a[position]);

            }else if (idKelas.equals("7b")){
                textView.setText(nama7b[position]);

            }else if (idKelas.equals("7c")){
                textView.setText(nama7c[position]);

            }else if (idKelas.equals("7d")){
                textView.setText(nama7d[position]);

            }else if (idKelas.equals("8a")){
                textView.setText(nama8a[position]);

            }else if (idKelas.equals("8b")){
                textView.setText(nama8b[position]);

            }else if (idKelas.equals("8c")){
                textView.setText(nama8c[position]);

            }else if (idKelas.equals("8d")){
                textView.setText(nama8d[position]);

            }else if (idKelas.equals("9")) {
                textView.setText(nama9[position]);
            }

            return convertView;
        }
    }
}
