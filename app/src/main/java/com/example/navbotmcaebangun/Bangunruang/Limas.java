package com.example.navbotmcaebangun.Bangunruang;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.navbotmcaebangun.R;

public class Limas extends AppCompatActivity {

    EditText textboxalas ;
    EditText textboxsisitegak ;

    Button btnhitunglimas;
    Button btnresetlimas;
    TextView hasillimas;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.limas);

        textboxalas = findViewById(R.id.textboxalas);
        textboxsisitegak = findViewById(R.id.textboxsisitegak);
        btnhitunglimas = findViewById(R.id.btnhitunglimas);
        btnresetlimas = findViewById(R.id.btnresetlimas);
        hasillimas = findViewById(R.id.hasillimas);

        btnresetlimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textboxsisitegak.setText("");
                textboxalas.setText("");
                hasillimas.setText("");
            }
        });

        btnhitunglimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tbalas = textboxalas.getText().toString().trim();
                String tbstegak = textboxsisitegak.getText().toString().trim();

                if (tbalas.isEmpty ()) {
                    textboxalas.setError("Masukkan nilai Alas!");
                    return ;
                }

                else if (tbstegak.isEmpty()) {
                    textboxsisitegak.setError("Masukkan nilai Sisi!");
                    return;
                }

                double alas = Double.parseDouble(textboxalas.getText().toString());
                double sisitegak = Double.parseDouble(textboxsisitegak.getText().toString());
                double hasil = alas + sisitegak;
                hasillimas.setText(String.valueOf(hasil));
            }
        });


    }
}
