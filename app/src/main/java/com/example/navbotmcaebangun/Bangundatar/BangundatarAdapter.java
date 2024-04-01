package com.example.navbotmcaebangun.Bangundatar;

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

public class BangundatarAdapter extends RecyclerView.Adapter<BangundatarAdapter.MyViewHolder> {

    Context context;
    ArrayList<Modelbangun> modelbangundatar = new ArrayList<>();

    ItemClickListener mClickListener;

    public BangundatarAdapter(Context context, ArrayList<Modelbangun> modelbangundatar) {
        this.context = context;
        this.modelbangundatar = modelbangundatar;
    }

    @NonNull
    @Override
    public BangundatarAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_lay_bangundatar, parent, false);
        return new BangundatarAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BangundatarAdapter.MyViewHolder holder, int position) {
        holder.tvnamebangdatar.setText(modelbangundatar.get(position).getName());
        Glide.with(context).load(modelbangundatar.get(position).getImg()).into(holder.imagesbangundatar);
    }

    @Override
    public int getItemCount() {
        return modelbangundatar.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imagesbangundatar;

        TextView tvnamebangdatar;

        public MyViewHolder(View ItemView) {
            super(ItemView);
            imagesbangundatar = itemView.findViewById(R.id.imagesbangundatar);
            tvnamebangdatar = itemView.findViewById(R.id.tvnamebangdatar);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());
                }
            });
        }
    }
    Modelbangun getItem(int id) {return modelbangundatar.get(id);
    }

    void setClickListener(ItemClickListener itemClickListener){
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener{
        void onItemClick(View view,int position);
    }
}
