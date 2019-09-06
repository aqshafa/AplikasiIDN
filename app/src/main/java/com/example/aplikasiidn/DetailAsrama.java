package com.example.aplikasiidn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailAsrama extends AppCompatActivity {

    String[] namaumar = {"ASRAMA ATAS",
            "1. Ahmad ihsan maulana",
            "2. Althaaf ridha muhammad zaydaan batubara",
            "3. Daffa arya sofwan",
            "4. Faaris dzaki candra",
            "5. Farrel fathin nugraha",
            "6. Irsyad sholahuddin",
            "7. Khairiansyah hafidz",
            "8. Lalhuda fathin jafsyada",
            "9. Muhammad rasya hamdi syahkuan za",
            "10. Nabiih firdaus alauddin",
            "11. Wildan artha sheehan",
            "",
            "ASRAMA BAWAH",
            "1. Abdullah agna alfayad",
            "2. Abdullah zidane",
            "3. Abdurrahman raqi",
            "4. Abdurrazzaq",
            "5. Abiyyu adiyarto sulaeman",
            "6. Ahmad dzakki",
            "7. Ahmad fachry saputro",
            "8. Ahmad fathir",
            "9. Aiyyub al anshori",
            "10. Ajriel rizqy maulana"};

    String[] namakhalid = {"ASRAMA ATAS",
            "1. Agbi awan asyifa",
            "2. Ali akbar al amin",
            "3. Hugo kayana PR",
            "4. Muhammad Attar Hafidz",
            "5. Muhammad ficrie",
            "6. Reyhan mohhamad",
            "7. Rizaldi kurnia",
            "8. Satria hanestyo",
            "9. Sulaiman al hisyam",
            "",
            "ASRAMA BAWAH",
            "1. M umar alfatih",
            "2. M aaubindaffa arya y",
            "3. M dzakiyy aliyy kanz",
            "4. M fajri lazuardi",
            "5. M naufal suyja kurniawan",
            "6. Mohamad alif",
            "7. Muhamad azka",
            "8. Muhammad abqari nasution",
            "9. Muhammad fachri razali",
            "10. Muhammad fajri anwar",
            };

    String[] namautsman = {"ASRAMA ATAS",
            "1. Arinal kian r",
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
            "12. Safaraz afma affandi",
            "",
            "ASRAMA BAWAH",
            "1. Giats thamami",
            "2. Habibie muhaymin ihsan",
            "3. Hauzan nabil musyafa",
            "4. Ichwan ahmadi thoriq",
            "5. Ikhsan alfharizi",
            "6. Irham abdirrohman a",
            "7. Jagat alif katulistiwa",
            "8. Khairi azzam rieffant",
            "9. M nabil",
            "10. M rasya nur bayhaqqi"};

    String[] namaali = {"ASRAMA ATAS",
            "1. Abdurrahman wafi",
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
            "12. Rifqi hafidh suryana",
            "",
            "ASRAMA BAWAH",
            "1. Akma zaki alfari",
            "2. Akmal pratama irsyad n",
            "3. Allvin angga putra",
            "4. Aly zakki yaza",
            "5. Banyureksa ghaisan",
            "6. Bryan pradika",
            "7. Daffa fathur rahman",
            "8. Daffa muhammad r",
            "9. Danish olfan alif d"};

    String[] namathoriq = {"ASRAMA ATAS",
            "1. Fadhil zaki",
            "2. Farrel muhammad hafidz e",
            "3. Farrel ahmad ghazali",
            "4. Fatih ahmad muzakki",
            "5. Fatih rizki akbar",
            "6. Fawwaz abdul ghani",
            "7. Fihryal faqiy",
            "8. Ghatan naufarrel a",
            "9. Ghaisan raziq syams",
            "",
            "ASRAMA BAWAH",
            "1. Muhammad faris f",
            "2. Muhammad hanif sulyanto",
            "3. Muhammad myko adityo",
            "4. Muhammad naufal ilham",
            "5. Muhammad putra raditya",
            "6. Muhammad rafi al zakwan",
            "7. Muhammad yazid nur r",
            "8. Muhammad zaidan firrizq",
            "9. Munawar zaki ramadhan"};

    String[] namaabdurrahman = {"ASRAMA ATAS",
            "1. Murtaza ahsan",
            "2. Musthafa dzaki nugraha",
            "3. Naufal daffa alaika",
            "4. Nawfal althaf budiman",
            "5. Nayaka arvin difandi",
            "6. Noah alif sjamhudi",
            "7. Panggih bagaskoro",
            "8. Rafa satya rabbani",
            "9. Raffa zahran arraziq",
            "10. Rafi zaki al rizqi",
            "",
            "ASRAMA BAWAH",
            "1. Raiyan abizar",
            "2. Rakha sapta fabian",
            "3. Ronald edsa pratama",
            "4. Taufik ilhami",
            "5. Thoriq izzuddin ramadhan",
            "6. Wildan hanif ihfazhirrahman",
            "7. Wildan sabiq abdurrahman",
            "8. Yahya abdurrahman",
            "9. Zirjy zakwan fayyadhiya"};

    String[] namaasrama9 = {
            "1. Abdullah sulam",
            "2. Ali zainal abidin",
            "3. Furqon afuwwu h",
            "4. Muhammad afiq a",
            "5. Muhammad azhar n",
            "6. Muhammad said",
            "7. Muhammad zein",
            "8. Sidqi athallah a",
            "9. Thalhah s",
            "10. Ziljidan ramadhan s"};

    String idasrama;

    TextView  tvNama, tvAsal, tvEmail, tvTelepon, tvJudul;

    ImageView ivMusyrif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_asrama);
        idasrama = getIntent().getStringExtra("KEY 1");
        ivMusyrif = findViewById(R.id.ivMusyrif);
        tvJudul = findViewById(R.id.tvJudul);
        tvNama = findViewById(R.id.tvNama);
        tvAsal = findViewById(R.id.tvAsal);
        tvEmail = findViewById(R.id.tvEmail);
        tvTelepon = findViewById(R.id.tvTelepon);

        if (idasrama.equals("asramaumar")){
            ivMusyrif.setImageResource(R.drawable.iqbal);
            tvJudul.setText("Asrama Umar bin Khattab");
            tvNama.setText(getResources().getText(R.string.namamusyrifumar));
            tvAsal.setText(getResources().getText(R.string.asalmusyrifumar));
            tvEmail.setText(getResources().getText(R.string.emailmusyrifumar));
            tvTelepon.setText(getResources().getText(R.string.teleponmusyrifumar));
        }else if (idasrama.equals("asramakhalid")){
            tvJudul.setText("Asrama Khalid bin Walid");
            ivMusyrif.setImageResource(R.drawable.hanif);
            tvNama.setText(getResources().getText(R.string.namamusyrifkhalid));
            tvAsal.setText(getResources().getText(R.string.asalmusyrifkhalid));
            tvEmail.setText(getResources().getText(R.string.emailmusyrifkhalid));
            tvTelepon.setText(getResources().getText(R.string.teleponmusyrifkhalid));
        }else if (idasrama.equals("asramautsman")) {
            tvJudul.setText("Asrama Utsman bin Affan");
            ivMusyrif.setImageResource(R.drawable.doni);
            tvNama.setText(getResources().getText(R.string.namamusyrifutsman));
            tvAsal.setText(getResources().getText(R.string.asalmusyrifutsman));
            tvEmail.setText(getResources().getText(R.string.emailmusyrifutsman));
            tvTelepon.setText(getResources().getText(R.string.teleponmusyrifutsman));
        }else if (idasrama.equals("asramaali")) {
            tvJudul.setText("Asrama Ali bin Abi Thalib");
            ivMusyrif.setImageResource(R.drawable.agus);
            tvNama.setText(getResources().getText(R.string.namamusyrifali));
            tvAsal.setText(getResources().getText(R.string.asalmusyrifali));
            tvEmail.setText(getResources().getText(R.string.emailmusyrifali));
            tvTelepon.setText(getResources().getText(R.string.teleponmusyrifali));
        }else if (idasrama.equals("asramathoriq")){
            tvJudul.setText("Asrama Thoriq bin Ziyad");
            ivMusyrif.setImageResource(R.drawable.husen);
            tvNama.setText(getResources().getText(R.string.namamusyrifthoriq));
            tvAsal.setText(getResources().getText(R.string.asalmusyrifthoriq));
            tvEmail.setText(getResources().getText(R.string.emailmusyrifthoriq));
            tvTelepon.setText(getResources().getText(R.string.teleponmusyrifthoriq));
        }else if (idasrama.equals("asramaabdurrahman")){
            tvJudul.setText("Asrama Abdurrahman bin Auf");
            ivMusyrif.setImageResource(R.drawable.ic_person_black_24dp);
            tvNama.setText(getResources().getText(R.string.namamusyrifabdurrahman));
            tvAsal.setText(getResources().getText(R.string.asalmusyrifabdurrahman));
            tvEmail.setText(getResources().getText(R.string.emailmusyrifabdurrahman));
            tvTelepon.setText(getResources().getText(R.string.teleponmusyrifabdurrahman));
        }else if (idasrama.equals("asrama9")){
            tvJudul.setText("Asrama Kelas 9");
            ivMusyrif.setImageResource(R.drawable.yudi);
            tvNama.setText(getResources().getText(R.string.namamusyrif9));
            tvAsal.setText(getResources().getText(R.string.asalmusyrif9));
            tvEmail.setText(getResources().getText(R.string.emailmusyrif9));
            tvTelepon.setText(getResources().getText(R.string.teleponmusyrif9));
        }

        ListView listView = findViewById(R.id.detailList);
        Adapterasrama adapterasrama = new Adapterasrama();
        listView.setAdapter(adapterasrama);


    }


    class Adapterasrama extends BaseAdapter {

        @Override
        public int getCount() {
            if (idasrama.equals("asramaumar")) {
                return namaumar.length;

            } else if (idasrama.equals("asramakhalid")) {
                return namakhalid.length;

            } else if (idasrama.equals("asramautsman")) {
                return namautsman.length;

            } else if (idasrama.equals("asramaali")) {
                return namaali.length;

            } else if (idasrama.equals("asramathoriq")) {
                return namathoriq.length;

            } else if (idasrama.equals("asramaabdurrahman")) {
                return namaabdurrahman.length;

            } else {
                return namaasrama9.length;

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
            if (idasrama.equals("asramaumar")) {
                textView.setText(namaumar[position]);

            }else if (idasrama.equals("asramakhalid")){
                textView.setText(namakhalid[position]);

            }else if (idasrama.equals("asramautsman")){
                textView.setText(namautsman[position]);

            }else if (idasrama.equals("asramaali")){
                textView.setText(namaali[position]);

            }else if (idasrama.equals("asramathoriq")){
                textView.setText(namathoriq[position]);

            }else if (idasrama.equals("asramaabdurrahman")){
                textView.setText(namaabdurrahman[position]);

            }else if (idasrama.equals("asrama9")){
                textView.setText(namaasrama9[position]);

            }

            return convertView;
        }
    }
}
