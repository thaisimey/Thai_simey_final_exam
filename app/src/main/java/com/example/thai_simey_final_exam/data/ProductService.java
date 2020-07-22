package com.example.thai_simey_final_exam.data;

import com.example.thai_simey_final_exam.model.Product;
import com.example.thai_simey_final_exam.model.ProductsResponse;
import com.example.thai_simey_final_exam.model.SlideshowResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductService {

    @GET("products.php")
    Call<ProductsResponse> getProducts();
}
