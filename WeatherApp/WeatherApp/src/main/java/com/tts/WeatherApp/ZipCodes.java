package com.tts.WeatherApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ZipCodes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int code;

    public ZipCodes() {

    }

    public long getId() {
        return id;
    }

    // public void setId(long id) {
    //     this.id = id;
    // }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
