package br.gdgsp.sabesp.android.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import br.gdgsp.sabesp.android.model.HydricSystem;
import br.gdgsp.sabesp.android.model.ReservoirInfo;

/**
 * Created by ubiratansoares on 5/22/15.
 */

public class HydricSystemAdapter extends FragmentPagerAdapter {

    public HydricSystemAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override public Fragment getItem(int position) {
        ReservoirInfo info = new ReservoirInfo("20%", "2mm", "80mm", "75mm");
        HydricSystem hs = new HydricSystem("Cantareira", info);
        return HydricSystemFragment.with(hs);
    }

    @Override public int getCount() {
        return 3;
    }
}
