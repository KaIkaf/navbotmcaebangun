package com.example.navbotmcaebangun.Bangundatar;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.navbotmcaebangun.R;

public class Square  extends AppCompatActivity {

    EditText textboxsisi;

    Button btnhitungsquare;
    Button btnresetsquare;
    TextView hasils;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square);

        textboxsisi = findViewById(R.id.textboxsisi);
        btnhitungsquare = findViewById(R.id.btnhitungsquare);
        btnresetsquare = findViewById(R.id.btnresetsquare);
        hasils = findViewById(R.id.hasil);

        btnresetsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasils.setText("");
                textboxsisi.setText("");
            }
        });

        btnhitungsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sisempty = textboxsisi.getText().toString().trim();
                if (sisempty.isEmpty()) {
                    textboxsisi.setError("Masukkan nilai sisi!");
                    return;
                }

                double sisi = Double.parseDouble(textboxsisi.getText().toString());
                double hasil = sisi * sisi;
                hasils.setText(String.valueOf(hasil));

            }
        });



    }
}
