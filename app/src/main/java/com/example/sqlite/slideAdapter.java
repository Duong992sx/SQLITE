package com.example.sqlite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class slideAdapter extends RecyclerView.Adapter<slideAdapter.SlideViewHolder> {
    public slideAdapter(List<SlideItem> slideitem, ViewPager2 viewpager2) {
        this.slideitem = slideitem;
        this.viewpager2 = viewpager2;
    }

    private List<SlideItem>  slideitem;
    private ViewPager2 viewpager2;
    @NonNull
    @Override
    public SlideViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       return new SlideViewHolder(
               LayoutInflater.from(parent.getContext()).inflate(
                       R.layout.slider_item,
                       parent,
                       false

               )
       );
    }

    @Override
    public void onBindViewHolder(@NonNull SlideViewHolder holder, int position) {
       holder.setImage(slideitem.get(position));
    }

    @Override
    public int getItemCount() {
        return slideitem.size();
    }




    class SlideViewHolder extends RecyclerView.ViewHolder
    {
        private RoundedImageView imageview;

        public SlideViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview=itemView.findViewById(R.id.imageslide);

        }
        void setImage(SlideItem slideitem)
        {
            imageview.setImageResource(slideitem.getImage());
        }


    }

}
