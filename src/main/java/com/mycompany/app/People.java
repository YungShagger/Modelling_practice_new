package com.mycompany.app;

import java.util.List;

public abstract class People implements java.io.Serializable {

    protected String name;


    public String getName() {
        return name;
    }

    public People(String name) {
        this.name = name;
    }
}
