package com.example.navbotmcaebangun.Bangundatar;

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


public class BangundatarFragment extends Fragment implements BangundatarAdapter.ItemClickListener {

    ArrayList<Modelbangun> modelbangundatar = new ArrayList<>();

    Context context;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_bangundatar,container,false);
        RecyclerView rvBangunDatar = rootview.findViewById(R.id.rvBangunDatar);

        modelbangundatar.add(new Modelbangun("Square","https://dictionary.cambridge.org/es/images/thumb/square_noun_002_35417.jpg?version=5.0.389"));
        modelbangundatar.add(new Modelbangun("Rectangle","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTDoVPEM8V69akoVavviZrI8Bz9lxROLGyTyFBhHNXlAA&s"));
        modelbangundatar.add(new Modelbangun("Triangle","https://img.freepik.com/free-vector/stroke-triangle-geometric-shape-vector_53876-175081.jpg"));
        modelbangundatar.add(new Modelbangun("Circle","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKiuLc-fbY9VjvQ3EvawHudE6y-S8kF-8ajKbG6EQyZg&s"));


        // Inflate the layout for this fragment
        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getActivity()));
        BangundatarAdapter adapter = new BangundatarAdapter(getContext(),modelbangundatar);
        rvBangunDatar.setAdapter(adapter);
        adapter.setClickListener(this);


        return rootview;
    }

    @Override
    public void onItemClick(View view, int position) {

        String pilihan = modelbangundatar.get(position).getName();

        if (pilihan.equals("Square")) {
            startActivity(new Intent(getActivity(), Square.class));
        } else if (pilihan.equals("Rectangle")) {
            startActivity(new Intent(getActivity(), Rectangle.class) );
        } else if (pilihan.equals("Triangle")) {
            startActivity(new Intent(getActivity(), Triangle.class));

        } else if (pilihan.equals("Circle")) {
            startActivity(new Intent(getActivity(), Circle.class));

        }
    }


    }
