package com.example.navbotmcaebangun.Bangunruang;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navbotmcaebangun.Modelbangun;
import com.example.navbotmcaebangun.R;

import java.util.ArrayList;


public class BangunruangFragment extends Fragment  implements BangunruangAdapter.ItemClickListener {
    ArrayList<Modelbangun> modelbangunruang = new ArrayList<>();
    Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootv = inflater.inflate(R.layout.fragment_bangunruang,container,false);
        RecyclerView rvBangunRuang = rootv.findViewById(R.id.rvBangunRuang);


        modelbangunruang.add(new Modelbangun("Kubus","https://i0.wp.com/mahirmatematika.com/wp-content/uploads/2018/08/kubus.jpg?fit=444%2C409&ssl=1"));
        modelbangunruang.add(new Modelbangun("Limas","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3t3bMzQ2eHn0P5YOajfzrBe9wQeycvut4MCF4FhWqJg&s"));
        modelbangunruang.add(new Modelbangun("Balok","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQVhkAg1eqNaain_8guR7PMIqGjsLXeLHAHoQdVo48sCw&s"));
        modelbangunruang.add(new Modelbangun("Cylinder","https://akupintar.id/documents/portlet_file_entry/20143/1+%288%29.png/78981bbc-9482-c8fe-17f8-d53578cd41c4?imagePreview=1"));
        
        // Inflate the layout for this fragment

        rvBangunRuang.setLayoutManager(new LinearLayoutManager(getActivity()));
        BangunruangAdapter adapter = new BangunruangAdapter(getContext(),modelbangunruang);
        rvBangunRuang.setAdapter(adapter);
        adapter.setClickListener(this);

        return rootv ;
    }

    @Override
    public void onItemClick(View view, int position) {
        String options = modelbangunruang.get(position).getName();
        if (options.equals("Kubus")){
            startActivity(new Intent(getActivity(), Kubus.class));
        } else if (options.equals("Cylinder")) {
            startActivity(new Intent(getActivity(), Cylinder.class));

        } else if (options.equals("Balok")) {
            startActivity(new Intent(getActivity(), Balok.class));
        } else if (options.equals("Limas")) {
            startActivity(new Intent(getActivity(), Limas.class));
        }
    }
}