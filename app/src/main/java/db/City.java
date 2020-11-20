package db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int proinceId;

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProinceId() {
        return proinceId;
    }

    public void setProinceId(int proinceId) {
        this.proinceId = proinceId;
    }

    public void setId(int id) {
        this.id = id;

    }
}
