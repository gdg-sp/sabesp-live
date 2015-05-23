package br.gdgsp.sabesp.android.rest;

import java.util.List;

import br.gdgsp.sabesp.android.model.HydricSystem;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by ubiratansoares on 5/22/15.
 */

public interface SabespApi {

    @GET("/v2") void fetchInfoForToday(Callback<List<HydricSystem>> callback);

}
