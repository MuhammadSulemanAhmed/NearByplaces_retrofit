package com.example.suleman_pc.googleplaces.Remote;

import com.example.suleman_pc.googleplaces.Model.Myplaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by suleman-pc on 3/30/2018.
 */

public interface IGoogleAPIService {
    @GET
    Call<Myplaces> getNearByPlaces(@Url String url);
}
