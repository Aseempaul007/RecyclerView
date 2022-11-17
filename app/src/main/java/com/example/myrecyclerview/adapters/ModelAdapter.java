package com.example.myrecyclerview.adapters;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecyclerview.R;
import com.example.myrecyclerview.modelClass.ModelClass;

import java.util.ArrayList;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.viewHolder>{

    ArrayList<ModelClass> list ;
    Context context;

    public ModelAdapter(ArrayList<ModelClass> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.custom_list,parent,false);
        viewHolder vh = new viewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImageViewOne());
        holder.textView.setText(list.get(position).getTextViewOne());

        switch(position){
            case 0 :
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context,"Image 1 is clicked!",Toast.LENGTH_SHORT).show();
                    }
                });

                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context,"Text 1 is clicked!",Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 1 :
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context,"Image 2 is clicked!",Toast.LENGTH_SHORT).show();
                    }
                });

                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context,"Text 2 is clicked!",Toast.LENGTH_SHORT).show();
                    }
                });
                break;

        }





    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image1);
            textView = itemView.findViewById(R.id.text1);
        }
    }
}
