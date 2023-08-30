package com.example.student_handbook.doanthanhnien;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student_handbook.R;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolderClass> {
    private ArrayList<DataClass> dataList;
    private OnItemClickListener onItemClick;

    public AdapterClass(ArrayList<DataClass> dataList) {
        this.dataList = dataList;
    }


    public void setOnItemClick(OnItemClickListener onItemClick) {
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_doan_thanh_nien, parent, false);
        return new ViewHolderClass(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        DataClass currentItem = dataList.get(position);
        holder.rvImage.setImageResource(currentItem.getDataImage());
        holder.rvTitle.setText(currentItem.getDataTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClick != null) {
                    onItemClick.onItemClick(currentItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public interface OnItemClickListener {
        void onItemClick(DataClass item);
    }

    public static class ViewHolderClass extends RecyclerView.ViewHolder {
        public ImageView rvImage;
        public TextView rvTitle;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            rvImage = itemView.findViewById(R.id.image);
            rvTitle = itemView.findViewById(R.id.title);
        }
    }
}