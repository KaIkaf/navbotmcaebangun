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

public class Triangle  extends AppCompatActivity {

    EditText textboxalas;

    EditText textboxtinggi;

    Button btnhitungtriangle;
    Button btnresettriangle;

    TextView hasiltriangle;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle);

        textboxalas = findViewById(R.id.textboxalas);
        textboxtinggi = findViewById(R.id.textboxtinggi);
        hasiltriangle = findViewById(R.id.hasiltriangle);
        btnhitungtriangle = findViewById(R.id.btnhitungtriangle);
        btnresettriangle = findViewById(R.id.btnresettriangle);

        btnresettriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasiltriangle.setText("");
                textboxtinggi.setText("");
                textboxalas.setText("");
            }
        });

        btnhitungtriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String alasempty = textboxalas.getText().toString().trim();
                String tinggiempty = textboxtinggi.getText().toString().trim();

                if (alasempty.isEmpty()) {
                    textboxalas.setError("Masukkan nilai alas!");
                    return;
                }

                else if (tinggiempty.isEmpty()) {
                    textboxtinggi.setError("Masukkan nilai tinggi!");
                    return;
                }


                double alas = Double.parseDouble(textboxalas.getText().toString());
                double tinggi = Double.parseDouble(textboxtinggi.getText().toString());

                double hasilstriangle =  0.5 * alas * tinggi;

                hasiltriangle.setText(String.valueOf(hasilstriangle));


            }
        });

    }
}
