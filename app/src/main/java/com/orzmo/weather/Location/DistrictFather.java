package com.orzmo.weather.Location;

import java.util.List;

public class DistrictFather {
    private int length;
    private List<District> districts;

    public DistrictFather() {
    }

    public DistrictFather(int length, List<District> districts) {
        this.length = length;
        this.districts = districts;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}
