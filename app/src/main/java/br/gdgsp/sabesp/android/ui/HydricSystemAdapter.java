package br.gdgsp.sabesp.android.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import br.gdgsp.sabesp.android.model.HydricSystem;

/**
 * Created by ubiratansoares on 5/22/15.
 */

public class HydricSystemAdapter extends FragmentPagerAdapter {

    List<HydricSystem> info;

    public HydricSystemAdapter(FragmentManager fm, List<HydricSystem> hydricSystems) {
        super(fm);
        info = hydricSystems;

    }

    @Override public Fragment getItem(int position) {
        HydricSystem hs = info.get(position);
        return HydricSystemFragment.with(hs);
    }

    @Override public int getCount() {
        return info.size();
    }
}
