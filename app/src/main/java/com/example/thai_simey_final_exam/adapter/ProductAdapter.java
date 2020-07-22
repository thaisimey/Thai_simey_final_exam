package com.example.thai_simey_final_exam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.thai_simey_final_exam.R;
import com.example.thai_simey_final_exam.model.Product;

import java.util.List;

public class ProductAdapter  extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private Context context;
    private List<Product> data;

    public ProductAdapter(Context context, List<Product> data) {
        this.context = context;
        this.data = data;
    }

    public void setData(List<Product> data) {
        this.data = data;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_home_landspace,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
//        viewHolder.bookImage.setImageResource(data.get(i).getBookImage());
        viewHolder.bookTitle.setText(data.get(i).getName());
        viewHolder.bookRate.setText(String.valueOf(data.get(i).getAverageRate()));
        //viewHolder.bookView.setText(data.get(i).getView());

        if (data.get(i).getImageUrl() != null){
            Glide
                    .with(context)
                    .load(data.get(i).getImageUrl())
                    .centerCrop()
                    .error(R.drawable.ic_photo)
                    .placeholder(R.drawable.ic_photo)
                    .into(viewHolder.bookImage);
        } else {
            viewHolder.bookImage.setImageResource(R.drawable.ic_photo);
        }
        viewHolder.book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView bookImage;
        private TextView bookTitle;
        private TextView bookRate;
        private TextView bookView;
        private CardView book;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            bookImage = itemView.findViewById(R.id.imageView);
            bookTitle = itemView.findViewById(R.id.item_title);
            bookRate = itemView.findViewById(R.id.rating_view);
            bookView = itemView.findViewById(R.id.count_view);
            book = itemView.findViewById(R.id.body);
        }
    }
}
