package br.gdgsp.sabesp.android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ubiratansoares on 5/22/15.
 */
public class HydricSystemFragment extends Fragment {

    @Nullable @Override public View onCreateView(
            LayoutInflater inflater, ViewGroup container, Bundle inState) {
        return inflater.inflate(R.layout.fragment_hydric_system, container, false);
    }
}
