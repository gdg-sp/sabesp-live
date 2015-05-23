package br.gdgsp.sabesp.android.rest;

import java.util.List;

import br.gdgsp.sabesp.android.model.HydricSystem;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

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
        api.fetchInfoForToday(new Callback<List<HydricSystem>>() {
            @Override public void success(List<HydricSystem> hydricSystems, Response response) {

            }

            @Override public void failure(RetrofitError error) {

            }
        });
    }
}
