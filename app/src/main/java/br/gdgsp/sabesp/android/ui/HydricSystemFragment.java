package br.gdgsp.sabesp.android.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.gdgsp.sabesp.android.R;
import br.gdgsp.sabesp.android.model.HydricSystem;
import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by ubiratansoares on 5/22/15.
 */
public class HydricSystemFragment extends Fragment {

    @InjectView(R.id.label_reservoir_name) TextView labelReservoirName;
    @InjectView(R.id.label_reservoir_percentage) TextView labelReservoirPercentage;
    @InjectView(R.id.label_dailly_stats) TextView labelDaillyStats;
    @InjectView(R.id.label_monthly_stats) TextView labelMonthlyStats;
    @InjectView(R.id.label_monthly_average) TextView labelMonthlyAverage;

    HydricSystem hydricSystem;

    public static HydricSystemFragment with(HydricSystem hs) {
        HydricSystemFragment f = new HydricSystemFragment();
        Bundle b = new Bundle();
        b.putSerializable("key", hs);
        f.setArguments(b);
        return f;
    }

    public HydricSystemFragment() {
        // Only possible constructor for fragment
    }

    @Override public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hydricSystem = (HydricSystem) getArguments().getSerializable("key");
    }

    @Nullable @Override public View onCreateView(
            LayoutInflater inflater, ViewGroup container, Bundle inState) {
        View view = inflater.inflate(R.layout.fragment_hydric_system, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        labelReservoirName.setText(hydricSystem.getReservoirName());
        labelReservoirPercentage.setText(hydricSystem.getInfo().getPercentage());
        labelMonthlyAverage.setText("Média histórica do mês : " + hydricSystem.getInfo().getHistoricStats());
        labelDaillyStats.setText("Acumulado do dia : " + hydricSystem.getInfo().getDaillyStats());
        labelMonthlyStats.setText("Acumulado do mês : " + hydricSystem.getInfo().getMonthStats());
    }

    @Override public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

}
