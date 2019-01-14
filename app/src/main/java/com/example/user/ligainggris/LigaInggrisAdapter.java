package com.example.user.ligainggris;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LigaInggrisAdapter extends RecyclerView.Adapter<LigaInggrisAdapter.ViewHolder> {

    ArrayList<LigaInggris> listligainggris;
    Context context;

    LigaInggrisAdapter(Context context){
        this.context = context;
    }

    public ArrayList<LigaInggris> getListligainggris(){
        return listligainggris;
    }
    public void setListligainggris(ArrayList<LigaInggris> listligainggris){
        this.listligainggris = listligainggris;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ligainggris_item, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvNamaTeam.setText(getListligainggris().get(i).getNamaTeam());
//        viewHolder.tvNamaPelatih.setText("Nama Pelatih : \n "+getListligainggris().get(i).getNamaPelatih());
//        viewHolder.tvNamaStadion.setText("Nama Stadion : "+getListligainggris().get(i).getNamaStadion());
        Glide.with(context)
                .load(getListligainggris().get(i).getGambarTeam())
                .into(viewHolder.imgTeam);

    }

    @Override
    public int getItemCount() {
        return getListligainggris().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_nama_team)
        TextView tvNamaTeam;
//        @BindView(R.id.tv_nama_pelatih)
//        TextView tvNamaPelatih;
//        @BindView(R.id.tv_nama_stadion)
//        TextView tvNamaStadion;
        @BindView(R.id.img_team)
        ImageView imgTeam;
        //@BindView(R.id.img_stadion)
        //ImageView gambarStadion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
