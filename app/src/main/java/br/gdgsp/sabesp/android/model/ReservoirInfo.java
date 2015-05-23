package br.gdgsp.sabesp.android.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by ubiratansoares on 5/22/15.
 */

public class ReservoirInfo implements Serializable {

    @SerializedName("volume_armazenado") String percentage;
    @SerializedName("pluviometria_do_dia") String daillyStats;
    @SerializedName("pluviometria_acumulada_no_mes") String monthStats;
    @SerializedName("media_historica_do_mes") String historicStats;

    public String getPercentage() {
        return percentage;
    }

    public String getDaillyStats() {
        return daillyStats;
    }

    public String getMonthStats() {
        return monthStats;
    }

    public String getHistoricStats() {
        return historicStats;
    }
}
