package br.gdgsp.sabesp.android.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by ubiratansoares on 5/22/15.
 */

public class HydricSystem implements Serializable {

    @SerializedName("name") String reservoirName;
    @SerializedName("data") ReservoirInfo info;

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
