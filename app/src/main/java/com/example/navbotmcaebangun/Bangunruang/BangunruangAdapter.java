package com.example.navbotmcaebangun.Bangunruang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.navbotmcaebangun.Modelbangun;
import com.example.navbotmcaebangun.R;

import java.util.ArrayList;

public class BangunruangAdapter extends RecyclerView.Adapter<BangunruangAdapter.MyViewHolder> {
    Context context;
    ArrayList<Modelbangun> modelbangunruang = new ArrayList<>();


    ItemClickListener mClickListener;


    public BangunruangAdapter(Context context, ArrayList<Modelbangun> modelbangunruang) {
        this.context = context;
        this.modelbangunruang = modelbangunruang;
    }

    @NonNull
    @Override
    public BangunruangAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      LayoutInflater inflater = LayoutInflater.from(context);
     View view = inflater.inflate(R.layout.item_lay_bangunruang,parent,false);
        return new BangunruangAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BangunruangAdapter.MyViewHolder holder, int position) {
      holder.tvnamebangruang.setText(modelbangunruang.get(position).getName());
        Glide.with(context).load(modelbangunruang.get(position).getImg()).into(holder.imagesbangunruang);
    }

    @Override
    public int getItemCount() {
        return modelbangunruang.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {

        ImageView imagesbangunruang;

        TextView tvnamebangruang;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imagesbangunruang = itemView.findViewById(R.id.imagesbangunruang);
            tvnamebangruang = itemView.findViewById(R.id.tvnamebangruang);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());
                }
            });


        }


    }

    Modelbangun getItem(int id) {
        return modelbangunruang.get(id);
    }

    void setClickListener(ItemClickListener itemClickListener){
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener{
        void onItemClick(View view,int position);
    }
}
