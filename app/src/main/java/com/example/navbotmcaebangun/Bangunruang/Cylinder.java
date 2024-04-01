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

public class Cylinder  extends AppCompatActivity {
    EditText textboxtinggicylinder;

    EditText textboxradiuscylinder;

    Button btnhitungcylinder;
    Button btnresetcylinder;

    TextView hasilcylinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cylinder);

        textboxtinggicylinder = findViewById(R.id.textboxtinggicylinder);
        textboxradiuscylinder = findViewById(R.id.textboxradiuscylinder);
        hasilcylinder = findViewById(R.id.hasilcylinder);
        btnresetcylinder = findViewById(R.id.btnresetcylinder);
        btnhitungcylinder = findViewById(R.id.btnhitungcylinder);

        btnresetcylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilcylinder.setText("");
                textboxtinggicylinder.setText("");
                textboxradiuscylinder.setText("");
            }
        });
        btnhitungcylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radiuscyl = textboxradiuscylinder.getText().toString().trim();
                String tinggicyl = textboxtinggicylinder.getText().toString().trim();

                if (tinggicyl.isEmpty ()) {
                    textboxtinggicylinder.setError("Masukkan nilai Tinggi!");
                    return ;
                }

                else if (radiuscyl.isEmpty()) {
                    textboxradiuscylinder.setError("Masukkan nilai Radius!");
                    return;
                }

                double radiuscylinder = Double.parseDouble(textboxradiuscylinder.getText().toString());
                double tinggicylinder = Double.parseDouble(textboxtinggicylinder.getText().toString());
                double hasilcyl = 2 * 3.14 * radiuscylinder * (radiuscylinder + tinggicylinder);
                hasilcylinder.setText(String.valueOf(hasilcyl));
            }
        });


    }
}
