package com.example.kasirsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText etNama, etHarga, etJumlah;
Button btnTotal, btnClear;
TextView tvTot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama=(EditText) findViewById(R.id.etNamaBarang);
        etHarga=(EditText) findViewById(R.id.etHargaBarang);
        etJumlah=(EditText) findViewById(R.id.etJumlahBarang);
        btnTotal=(EditText) findViewById(R.id.btnTotal);
        btnClear=(EditText) findViewById(R.id.btnClear);
        tvTot=(EditText) findViewById(R.id.tvTotal);

        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jmlbarang, hrgbarang, total;
                jmlbarang=Double.valueOf(etJumlah.getText().toString().trim());
                hrgbarang=Double.valueOf(etHarga.getText().toString().trim());
                total=jmlbarang * hrgbarang;
                String totall=String.valueOf(totall);
                tvTot.setText(totall);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNama.setText("");
                etHarga.setText("");
                etJumlah.setText("");
                tvTot.setText("");
            }
        });
    }
}