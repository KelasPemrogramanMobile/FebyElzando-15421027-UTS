package com.project.prj_uts_febyelzando_15421027;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    Intent nama, npm, nilaiakhir, grade , keterangan;
    TextView txnama, txnpm, txtna, txtgrade, txtketerangan;
    String stnm,stnpm,stna,stgrade,stketerangan;
    Button btnkmbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        nama=getIntent();
        npm=getIntent();
        nilaiakhir=getIntent();
        grade=getIntent();
        keterangan=getIntent();

        txnama = (TextView) findViewById(R.id.nama);
        txnpm = (TextView) findViewById(R.id.npm);
        txtna = (TextView) findViewById(R.id.nilaiakhir);
        txtgrade = (TextView) findViewById(R.id.grade);
        txtketerangan = (TextView) findViewById(R.id.keterangan);

        stnm=nama.getStringExtra("Nama");
        stnpm=npm.getStringExtra("Npm");
        stna=nilaiakhir.getStringExtra("NilaiAkhir");
        stgrade=grade.getStringExtra("Grade");
        stketerangan=keterangan.getStringExtra("Keterangan");

        txnama.setText(stnm);
        txnpm.setText(stnpm);
        txtna.setText(stna);
        txtgrade.setText(stgrade);
        txtketerangan.setText(stketerangan);

        btnkmbl= (Button) findViewById(R.id.btn);

        btnkmbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(Hasil.this,MenuUtama.class);
                startActivity(kembali);
                finish();
            }
        });


    }
}
