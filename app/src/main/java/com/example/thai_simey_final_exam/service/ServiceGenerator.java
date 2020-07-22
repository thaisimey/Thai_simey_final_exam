package com.example.thai_simey_final_exam.service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ServiceGenerator {

    public static final String BASE_URL = "http://ite-rupp.ap-southeast-1.elasticbeanstalk.com";

    public static Retrofit retrofit;
    static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> service) {
        return builder.build().create(service);
    }

    public static Retrofit getRetrofit() {
        return retrofit;
    }
}
