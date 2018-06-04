package com.example.anudeep.actionbar;

/**
 * Created by anudeep on 25/06/17.
 */

public class Datamodel {

     String name;

    String url;

    public Datamodel(String name, String url) {

        this.name = name;
        this.url = url;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
