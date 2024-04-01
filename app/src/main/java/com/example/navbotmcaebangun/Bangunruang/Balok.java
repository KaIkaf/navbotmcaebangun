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

public class Balok extends AppCompatActivity {
    EditText textboxpanjangbalok;

    EditText textboxlebarbalok;

    EditText textboxtinggibalok;

    Button btnhitungbalok ;
    Button btnresetbalok ;

    TextView hasilbalok;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balok);
        textboxpanjangbalok = findViewById(R.id.textboxpanjangbalok);
        textboxlebarbalok = findViewById(R.id.textboxlebarbalok);
        textboxtinggibalok = findViewById(R.id.textboxtinggibalok);
        btnhitungbalok= findViewById(R.id.btnhitungbalok);
        hasilbalok = findViewById( R.id.hasilbalok);
        btnresetbalok = findViewById(R.id.btnresetbalok);
        btnresetbalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textboxtinggibalok.setText("");
                textboxlebarbalok.setText("");
                textboxpanjangbalok.setText("");
                hasilbalok.setText("");
            }
        });

        btnhitungbalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tpbalok = textboxpanjangbalok.getText().toString().trim();
                String tlbalok = textboxlebarbalok.getText().toString().trim();
                String ttbalok = textboxtinggibalok.getText().toString().trim();

                if (tpbalok.isEmpty ()) {
                    textboxpanjangbalok.setError("Masukkan nilai panjang!");
                    return ;
                }

                else if (tlbalok.isEmpty()) {
                    textboxlebarbalok.setError("Masukkan nilai lebar!");
                    return;
                } else if (ttbalok.isEmpty()) {
                    textboxtinggibalok.setError("masukan tinggi");
                    return;

                }

                double panjangbalok = Double.parseDouble(textboxpanjangbalok.getText().toString());
                double lebarbalok = Double.parseDouble(textboxlebarbalok.getText().toString());
                double tinggibalok = Double.parseDouble(textboxtinggibalok.getText().toString());
                double hasil = 2 * (panjangbalok *lebarbalok + panjangbalok *tinggibalok + lebarbalok * tinggibalok);
                hasilbalok.setText(String.valueOf(hasil));
            }
        });

    }
}
