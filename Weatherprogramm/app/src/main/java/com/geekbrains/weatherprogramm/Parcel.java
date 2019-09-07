package com.geekbrains.weatherprogramm;

import java.io.Serializable;

public class Parcel implements Serializable {
    private String text;
    private boolean speed;
    private boolean wet;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public boolean getSpeed() {
        return speed;
    }

    public boolean getWet() {
        return wet;
    }

    public void setSpeed(boolean speed) {
        this.speed = speed;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }
}
