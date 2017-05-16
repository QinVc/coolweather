package com.example.qin.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Qin on 2017/5/16.
 */

public class City extends DataSupport {
    private int cityId;
    private String cityName;
    private int code;
    private int provinceID;

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public int getCityId() {
        return cityId;
    }

    public int getCode() {
        return code;
    }

    public int getProvinceID() {
        return provinceID;
    }

    public String getCityName() {
        return cityName;
    }
}
