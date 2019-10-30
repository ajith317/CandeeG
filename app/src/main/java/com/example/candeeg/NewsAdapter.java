package com.example.candeeg;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    Context mContext;
    List<NewsViewHolder> mData;

    @NonNull
    @Override
    public NewsAdapter.NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.NewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{


        TextView textView, dosai_catogory,dosai_description;
        ImageView imageView;


        public NewsViewHolder(@NonNull View itemView){

            super(itemView);
            textView= itemView.findViewById(R.id.textview);
            dosai_catogory=itemView.findViewById(R.id.dosai_catogory);
            dosai_description=itemView.findViewById(R.id.dosai_description);

        }
    }
}
