package com.example.qin.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Qin on 2017/5/16.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weather_id;
    private int cityId;

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeather_id(String weather_id) {
        this.weather_id = weather_id;
    }

    public int getCityId() {
        return cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getWeather_id() {
        return weather_id;
    }
}
