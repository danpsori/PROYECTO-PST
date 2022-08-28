package com.example.proyectopst.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectopst.R;
import com.example.proyectopst.models.CarritoModelo;

import java.util.List;

public class CarritoAdapter  extends RecyclerView.Adapter<CarritoAdapter.ViewHolder>{

    List<CarritoModelo> list;

    public CarritoAdapter(List<CarritoModelo> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView  imageView;
        TextView name, price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //imageView = itemView.findViewById(R.id .);
        }
    }
}
