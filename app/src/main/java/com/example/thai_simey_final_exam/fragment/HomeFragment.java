package com.example.thai_simey_final_exam.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Retrofit;

import com.example.thai_simey_final_exam.R;
import com.example.thai_simey_final_exam.adapter.ProductAdapter;
import com.example.thai_simey_final_exam.data.ProductService;
import com.example.thai_simey_final_exam.model.Product;
import com.example.thai_simey_final_exam.model.ProductsResponse;
import com.example.thai_simey_final_exam.service.ServiceGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment implements View.OnClickListener{

    private Context context;
    private List<Product> data = new ArrayList<>();

    ProductService productService;

    ProductAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.home_recycler_view);
        adapter = new ProductAdapter(context,data);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                if (parent.getChildAdapterPosition(view) != Objects.requireNonNull(parent.getAdapter()).getItemCount() ||
                        parent.getChildAdapterPosition(view) != 0) {
                    outRect.left = 40;
                }
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        productService = ServiceGenerator.createService(ProductService.class);
        setDataTop();
    }

    private void setDataTop() {
        getProducts();

    }

    private void getProducts(){
        productService.getProducts().enqueue(new Callback<ProductsResponse>() {

            @Override
            public void onResponse(Call<ProductsResponse> call, Response<ProductsResponse> response) {

                Log.d(TAG, "onResponse: "+ response);
                Log.e(TAG,"data >>>>" + response.body().getProducts().size());
                if(response.body() != null) {
                    if (!response.body().getProducts().isEmpty()) {
                        data = response.body().getProducts();
                        adapter.setData(data);
                    }
                }

            }

            @Override
            public void onFailure(Call<ProductsResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: "+ t.toString() );
            }
        });



    }


    private static final String TAG = "HomeFragment";


    @Override
    public void onClick(View view) {

    }
}
