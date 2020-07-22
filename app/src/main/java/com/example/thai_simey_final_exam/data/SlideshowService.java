package com.example.thai_simey_final_exam.data;

import com.example.thai_simey_final_exam.model.Slideshow;
import com.example.thai_simey_final_exam.model.SlideshowResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SlideshowService {

    @GET("slides.php")
    Call<SlideshowResponse> getSlideshow();
}
