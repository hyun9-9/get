package com.example.get2;

/**
 * Created by Administrator on 2016-06-07.
 */
public class Person {
    private String name;
    private String country;
    private String twitter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", country=" + country + ", twitter="
                + twitter + "]";
    }
}
