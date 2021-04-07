package com.example.moneyme;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class KeuanganAdapter extends RecyclerView.Adapter<KeuanganAdapter.KeuanganViewHolder> {

    private ArrayList<Keuangan> list_keuangan;


    public KeuanganAdapter(ArrayList<Keuangan> list_keuangan) {
        this.list_keuangan = list_keuangan;
    }

    @NonNull
    @Override
    public KeuanganAdapter.KeuanganViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keuangan, parent, false);
        return new KeuanganViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KeuanganAdapter.KeuanganViewHolder holder, int position) {


        holder.tvTanggal.setText(list_keuangan.get(position).getTanggal());
        holder.tvSumber.setText(list_keuangan.get(position).getSumber());
        holder.tvNominal.setText(list_keuangan.get(position).getNominal());
    }

    @Override
    public int getItemCount() {
        return (list_keuangan != null) ? list_keuangan.size() : 0;
    }

    public class KeuanganViewHolder extends RecyclerView.ViewHolder{
        private TextView tvSumber, tvTanggal, tvNominal;

        public KeuanganViewHolder (View view){
            super (view);
            tvSumber = view.findViewById(R.id.tv_sumber);
            tvTanggal = view.findViewById(R.id.tv_tanggal);
            tvNominal = view.findViewById(R.id.tv_nominal);
        }
    }
}
