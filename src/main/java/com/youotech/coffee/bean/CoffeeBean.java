package com.youotech.coffee.bean;

import java.util.Date;

public class CoffeeBean {
    private Long id;
    private String message;
    private Date date;
    private Double latitude;
    private Double longitude;

    public CoffeeBean(String message,Date date){
        this(message,date,0d,0d);
    }
    public CoffeeBean(String message,Date date,Double longitude,Double latitude){
        this.id = null;
        this.message = message;
        this.date = date;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}
