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

public class Circle extends AppCompatActivity {

    EditText textboxradius;

    Button btnhitungcircle;
    Button btnresetcircle;

    TextView hasilcircle;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle);
        textboxradius = findViewById(R.id.textboxradius);
        btnhitungcircle = findViewById(R.id.btnhitungcircle);
        btnresetcircle = findViewById(R.id.btnresetcircle);
        hasilcircle =findViewById(R.id.hasilcircle);

        btnresetcircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textboxradius.setText("");
                hasilcircle.setText("");
            }
        });

        btnhitungcircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radiuss = textboxradius.getText().toString().trim();
                if (radiuss.isEmpty()) {
                    textboxradius.setError("Masukkan nilai radius!");
                    return;
                }

                double radius = Double.parseDouble(textboxradius.getText().toString());
                double hasilcir = 3.14 * radius * radius;
                hasilcircle.setText(String.valueOf(hasilcir));

            }





        });


    }



}
