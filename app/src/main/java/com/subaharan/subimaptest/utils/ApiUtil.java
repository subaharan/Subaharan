package com.subaharan.subimaptest.utils;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by krazybee on 11/9/17.
 */

public class ApiUtil {


    /**
     * Get Retrofit Instance
     */
    public static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl("https://maps.googleapis.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
   /* public static RestApi GetRestApi() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://maps.googleapis.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return restAdapter.create(RestApi.class);
    }*/

    /**
     * Get API Service
     *
     * @return API Service
     */
    public static RestApi getApiService() {
        return getRetrofitInstance().create(RestApi.class);
    }


}
