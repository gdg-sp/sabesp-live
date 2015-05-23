package br.gdgsp.sabesp.android.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import br.gdgsp.sabesp.android.R;
import br.gdgsp.sabesp.android.model.HydricSystem;
import br.gdgsp.sabesp.android.rest.ApiRequester;
import butterknife.ButterKnife;
import butterknife.InjectView;
import de.greenrobot.event.EventBus;
import retrofit.RetrofitError;


public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.pager) ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        EventBus.getDefault().register(this);
        new ApiRequester().requestInfoForToday();
    }

    @Override protected void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public void onEvent(List<HydricSystem> hydricSystems) {
        fillCrisisInfo(hydricSystems);
    }

    public void onEvent(RetrofitError error) {
        Log.v("FRACASSO", "Perdeu");
    }

    private void fillCrisisInfo(List<HydricSystem> hydricSystems) {
        FragmentManager fm = getSupportFragmentManager();
        pager.setAdapter(new HydricSystemAdapter(fm, hydricSystems));
    }


}
