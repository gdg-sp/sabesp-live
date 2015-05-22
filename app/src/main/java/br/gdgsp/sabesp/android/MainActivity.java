package br.gdgsp.sabesp.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.gdgsp.sabesp.android.model.HydricSystem;
import br.gdgsp.sabesp.android.model.ReservoirInfo;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReservoirInfo info = new ReservoirInfo("20%","2mm","80mm","75mm");
        HydricSystem hs = new HydricSystem("Cantareira", info);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, HydricSystemFragment.with(hs))
                .commit();
    }


}
