package com.example.navbotmcaebangun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.navbotmcaebangun.Bangundatar.BangundatarFragment;
import com.example.navbotmcaebangun.Bangunruang.BangunruangFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
     private BottomNavigationView bottomNavigationView;
     private  FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       bottomNavigationView = findViewById(R.id.bottomnavView);
       frameLayout = findViewById(R.id.frameLayout);

       bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               int itemId = item.getItemId();
               if (itemId == R.id.Bangundatar){
                   loadFragment(new BangundatarFragment(),false);

               } else if (itemId == R.id.BangunRuang) {
                   loadFragment(new BangunruangFragment(),false);
               }else {
                   loadFragment(new ProfileFragment(),false);
               }

               return true;
           }
       });

   loadFragment(new BangundatarFragment(),true);
    }
    private void loadFragment (Fragment fragment, boolean isAppInitialized){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (isAppInitialized){
            fragmentTransaction.add(R.id.frameLayout,fragment);
        }else {
            fragmentTransaction.replace(R.id.frameLayout,fragment);
        }
        fragmentTransaction.commit();
    }
}