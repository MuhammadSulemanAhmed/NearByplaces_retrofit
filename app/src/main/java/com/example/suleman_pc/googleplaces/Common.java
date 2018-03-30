package com.example.suleman_pc.googleplaces;

import com.example.suleman_pc.googleplaces.Remote.IGoogleAPIService;
import com.example.suleman_pc.googleplaces.Remote.RetrofitClient;

/**
 * Created by suleman-pc on 3/30/2018.
 */

public class Common {
    private static final String GOOGLE_API_URL="https://maps.googleapis.com/";
    public static IGoogleAPIService getGoogleAPIService(){

        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
