package com.codegym.model;

public class Usd {
    private double usd;
    private double rate;


    public Usd() {
    }

    public Usd(double usd, double rate) {
        this.usd = usd;
        this.rate = rate;

    }



    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public boolean checkUsd(){
        if(this.usd>0&&this.rate>0){
            return true;
        }else {
            return false;
        }
    }
}
