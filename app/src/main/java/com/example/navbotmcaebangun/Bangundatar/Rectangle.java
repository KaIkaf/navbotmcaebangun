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

public class Rectangle  extends AppCompatActivity {

    EditText textboxpanjang;

    EditText textboxlebar;

    Button btnhitungrectangle;
    Button btnresetrectangle;

    TextView hasilrectangle;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangle);

        textboxpanjang = findViewById(R.id.textboxpanjang);
        textboxlebar = findViewById(R.id.textboxlebar);
        hasilrectangle = findViewById(R.id.hasilrectangle);
        btnresetrectangle = findViewById(R.id.btnresetrectangle);
        btnhitungrectangle = findViewById(R.id.btnhitungrectangle);

        btnresetrectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textboxlebar.setText("");
                textboxpanjang.setText("");
                hasilrectangle.setText("");
            }
        });

        btnhitungrectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pnjng = textboxpanjang.getText().toString().trim();
                String lbar = textboxlebar.getText().toString().trim();

                if (pnjng.isEmpty ()) {
                    textboxpanjang.setError("Masukkan nilai panjang!");
                    return ;
                }

                else if (lbar.isEmpty()) {
                    textboxlebar.setError("Masukkan nilai lebar!");
                    return;
                }


                double lebar = Double.parseDouble(textboxlebar.getText().toString());
                double panjang = Double.parseDouble(textboxpanjang.getText().toString());
                double hasilrec = panjang * lebar;
                hasilrectangle.setText(String.valueOf(hasilrec));
            }
        });


    }
}
