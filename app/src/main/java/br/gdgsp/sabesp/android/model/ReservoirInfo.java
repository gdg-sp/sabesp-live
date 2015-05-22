package br.gdgsp.sabesp.android.model;

import java.io.Serializable;

/**
 * Created by ubiratansoares on 5/22/15.
 */

public class ReservoirInfo implements Serializable {

    String percentage;
    String daillyStats;
    String monthStats;
    String historicStats;

    public ReservoirInfo(String percentage, String daillyStats, String monthStats, String historicStats) {
        this.percentage = percentage;
        this.daillyStats = daillyStats;
        this.monthStats = monthStats;
        this.historicStats = historicStats;
    }

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
