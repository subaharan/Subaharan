package com.subaharan.subimaptest.utils;


import android.content.ClipData;
import android.media.MediaCodec;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by krazybee on 11/9/17.
 */

public interface RestApi {


    @GET("/maps/api/directions/json?")
    Call<RoutPoints> MapApiCall(@Query("parameters") String parameters/*,Call<RoutPoints> call*/);


    @GET("/json_data.json")
    Call<PointsCordinates> getMyJSON();


  /*  @POST("/api/v3/otpCheck.php")
    void OtpCheck(@Query("gcm_id") String gcm_id, @Query("otp") String otp,
                  @Query("imei") String imei, @Query("dealers") String dealer,
                  @Query("module_type") String module_type, Callback<MultiUserResponse> callback);

    @Multipart
    @POST("/{dealer_name}/api/syncCDR.php")
    void SyncCDR(@Path("dealer_name") String dealer_name ,*//*@Query("dealer") String dealer, *//*@Part("data") String data,
                 Callback<SyncDbResponse> callback);

    @POST("/api/v3/gcm/updateRegistrationID.php")
    void updateGCM_ID(@Query("imei") String imei, @Query("gcm_id") String gcm_id,
                      @Query("dealers") String dealers,Callback<GcmUpdate> callback)*/
}
