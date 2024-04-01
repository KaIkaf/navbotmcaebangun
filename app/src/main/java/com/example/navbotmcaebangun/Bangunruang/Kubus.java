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

public class Kubus extends AppCompatActivity {
EditText textboxradiuskubus;

Button btnhitungkubus;
Button btnresetkubus;

TextView hasilkubus ;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kubus);
        textboxradiuskubus = findViewById(R.id.textboxradiuskubus);
        btnhitungkubus = findViewById(R.id.btnhitungkubus);
        btnresetkubus = findViewById(R.id.btnresetkubus);
        hasilkubus = findViewById(R.id.hasilkubus);

        btnresetkubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilkubus.setText("");
                textboxradiuskubus.setText("");
            }
        });

        btnhitungkubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String radiuskubus = textboxradiuskubus.getText().toString().trim();

                if (radiuskubus.isEmpty ()) {
                    textboxradiuskubus.setError("Masukkan nilai Radius!");
                    return ;
                }


                double radius = Double.parseDouble(textboxradiuskubus.getText().toString());
                double hslkubus = 6 * radius * radius;
                hasilkubus.setText(String.valueOf(hslkubus));

            }
        });

    }
}
