package com.example.listview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ItemHolder> {

    ArrayList<ModelClass> listItem;

    public AdapterClass(ArrayList<ModelClass> listItem){
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_style, parent, false);
        return new AdapterClass.ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {

        holder.binView(listItem.get(position));

    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {

        private TextView itemTxt;
        private TextView itemTxtSub;
        private ImageView itemImg;
        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            //Memanggil ID dari Layout List
            itemTxt = itemView.findViewById(R.id.txtItem);
            itemTxtSub = itemView.findViewById(R.id.txtSubItem);
            itemImg = itemView.findViewById(R.id.imgItem);
        }
        public void binView(ModelClass data){
            itemTxt.setText(data.getTxtList());
            itemTxtSub.setText(data.getTxtSubList());
            itemImg.setImageResource(data.getImgList());
            final String idLists = data.getIdList();
            //Set To Click
            // If You Don't Wan To Click The List, So Yo Don't Have To make Code From Line 58 until Line 67
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), DetailList.class)
                    .putExtra(DetailList.KEY_LIST, idLists));
                }
            });
        }
        
    }
}
