package com.example.thai_simey_final_exam.adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.thai_simey_final_exam.R;

public class SlideShowAdapter extends PagerAdapter {

    private int[] imgPaths;

    public SlideShowAdapter(int[] imgPaths) {
        this.imgPaths = imgPaths;
    }

    @Override
    public int getCount() {
        return imgPaths.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//        ImageView imgSlide = new ImageView(container.getContext());
////        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
////        int imagePath = imgPaths[position];
////        imgSlide.setImageResource(imagePath);
////
////        return imgSlide;

        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View itemView = inflater.inflate(R.layout.view_slideshow_item, container, false);

        // Reference to the ImageView and set the image
        ImageView imgSlide = itemView.findViewById(R.id.img_slide);
        int imagePath = imgPaths[position];
        imgSlide.setImageResource(imagePath);

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
