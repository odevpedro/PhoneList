package com.phonelist.phonelist.domain;

public class Adress {
    private String streetAddresses;
    private String city;
    private String state;

    public Adress(String streetAddresses, String city, String state) {
        this.streetAddresses = streetAddresses;
        this.city = city;
        this.state = state;
    }

    public String getStreetAddresses() {
        return streetAddresses;
    }

    public void setStreetAddresses(String streetAddresses) {
        this.streetAddresses = streetAddresses;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
