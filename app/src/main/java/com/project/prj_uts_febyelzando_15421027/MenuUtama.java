package com.project.prj_uts_febyelzando_15421027;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuUtama extends AppCompatActivity {

    private EditText nama , npm , tgs , quiz , uts , uas;
    private  Button proses;

    String stnama, stnpm , stgrade , stketerangan;
    Double nilaiakhir , dbtgs, dbquiz, dbuts, dbuas ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        nama = (EditText) findViewById(R.id.nmmhs);
        npm = (EditText) findViewById(R.id.npm);
        tgs = (EditText) findViewById(R.id.tgs);
        quiz = (EditText) findViewById(R.id.quiz);
        uts = (EditText) findViewById(R.id.uts);
        uas = (EditText) findViewById(R.id.uas);
        proses = (Button) findViewById(R.id.proses);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stnama = nama.getText().toString();
                stnpm = npm.getText().toString();
                dbtgs = Double.parseDouble(tgs.getText().toString());
                dbquiz = Double.parseDouble(quiz.getText().toString());
                dbuts = Double.parseDouble(uts.getText().toString());
                dbuas = Double.parseDouble(uas.getText().toString());

                nilaiakhir = (0.15 * dbtgs)+(0.20 * dbquiz)+(0.30 * dbuts)+(0.35 * dbuas);
                if (nilaiakhir >=85 && nilaiakhir <=100){
                    stgrade = "A";
                    stketerangan = "Lulus";
                }else if (nilaiakhir >75){
                    stgrade = "B";
                    stketerangan = "Lulus";
                }else if (nilaiakhir >65){
                    stgrade = "C";
                    stketerangan = "Lulus";
                }else if (nilaiakhir >50){
                    stgrade = "D";
                    stketerangan = "Tidak Lulus";
                }else{
                    stgrade = "E";
                    stketerangan = "Tidak Lulus";
                }



                Intent kirim = new Intent(MenuUtama.this,Hasil.class);
                kirim.putExtra("Nama",stnama);
                kirim.putExtra("Npm",stnpm);
                kirim.putExtra("NilaiAkhir",String.valueOf(nilaiakhir));
                kirim.putExtra("Grade",stgrade);
                kirim.putExtra("Keterangan",stketerangan);
                startActivity(kirim);
                finish();

            }
        });

    }
}
