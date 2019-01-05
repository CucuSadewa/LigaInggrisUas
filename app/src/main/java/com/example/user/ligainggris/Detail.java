package com.example.user.ligainggris;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {


    ImageView imgTeam, imgStadion, imgLogo;
    TextView tvNamaTeam, tvNamaPelatih, tvNamaStadion, tvKapasitas, tvDescTeam, tvDescStadion, tvTahun;
    Context context;
    Activity activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_team);

        imgTeam = findViewById(R.id.img_team_dt);
        imgStadion = findViewById(R.id.img_stadion_dt);
        tvNamaTeam = findViewById(R.id.tv_nama_team_dt);
        tvNamaPelatih = findViewById(R.id.tv_nama_pelatih_dt);
        tvNamaStadion = findViewById(R.id.tv_nama_stadion_dt);
        tvKapasitas = findViewById(R.id.tv_kasitas_stadion_dt);


       LigaInggris pojo  = getIntent().getParcelableExtra("data");


        tvNamaTeam.setText("Nama Team : "+pojo.getNamaTeam());
        Glide.with(this).load(pojo.getGambarTeam()).into(imgTeam);
        tvKapasitas.setText("Kapasitas Stadion : "+pojo.getKapsitasStadion());
        tvNamaStadion.setText("Nama Stadion : "+pojo.getNamaStadion());
        tvNamaPelatih.setText("Nama Pelatih : "+pojo.getNamaPelatih());


//        Glide.with(this).load(getIntent().getStringExtra(EXTRA_IMG_TEAM)).into(imgTeam);
//        Glide.with(this).load(getIntent().getStringExtra(EXTRA_IMG_STADION)).into(imgStadion);
//        tvNamaTeam.setText(getIntent().getStringExtra(EXTRA_NAMA_TEAM));
//        tvNamaPelatih.setText(getIntent().getStringExtra(EXTRA_NAMA_PELATIH));
//        tvNamaStadion.setText(getIntent().getStringExtra(EXTRA_NAMA_STADION));
//        tvKapasitas.setText(getIntent().getStringExtra(EXTRA_KAPASITAS));
    }
}
