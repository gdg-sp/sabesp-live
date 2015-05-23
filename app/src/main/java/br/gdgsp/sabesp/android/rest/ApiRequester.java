package br.gdgsp.sabesp.android.rest;

import retrofit.RestAdapter;

/**
 * Created by ubiratansoares on 5/22/15.
 */

public class ApiRequester {

    RestAdapter restAdapter;

    public ApiRequester(){
        restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://sabesp-api.herokuapp.com")
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
    }

    public void requestInfoForToday(){
        SabespApi api = restAdapter.create(SabespApi.class);
        api.fetchInfoForToday(new RequestListener());
    }
}
