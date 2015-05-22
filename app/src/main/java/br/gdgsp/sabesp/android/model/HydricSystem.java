package br.gdgsp.sabesp.android.model;

import java.io.Serializable;

/**
 * Created by ubiratansoares on 5/22/15.
 */

public class HydricSystem implements Serializable {

    String reservoirName;
    ReservoirInfo info;

    public HydricSystem(String reservoirName, ReservoirInfo info) {
        this.reservoirName = reservoirName;
        this.info = info;
    }

    public String getReservoirName() {
        return reservoirName;
    }

    public ReservoirInfo getInfo() {
        return info;
    }
}
