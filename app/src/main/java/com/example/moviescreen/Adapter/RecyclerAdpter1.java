package com.example.moviescreen.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moviescreen.Model.Model1;
import com.example.moviescreen.R;

import java.util.List;

public class RecyclerAdpter1 extends RecyclerView.Adapter<RecyclerAdpter1.ViewHolder> {
    List<Model1> model1List;

    public RecyclerAdpter1(List<Model1> model1List) {
        this.model1List = model1List;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(model1List.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return model1List.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}
