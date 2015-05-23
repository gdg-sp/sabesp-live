package br.gdgsp.sabesp.android.rest;

import java.util.List;

import br.gdgsp.sabesp.android.model.HydricSystem;
import de.greenrobot.event.EventBus;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by ubiratansoares on 5/22/15.
 */

public class RequestListener implements Callback<List<HydricSystem>> {

    @Override public void success(List<HydricSystem> hydricSystems, Response response) {
        EventBus.getDefault().post(hydricSystems);
    }

    @Override public void failure(RetrofitError error) {
        EventBus.getDefault().post(error);
    }
}
