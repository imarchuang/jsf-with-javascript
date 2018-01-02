package com.imarchuang.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * Created by marchuang on 2017-07-13.
 */

@ManagedBean(name = "helloWorldBean")
@SessionScoped
public class HelloWorldBean implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;
    public String hello() {

        System.out.println("Calling hellworld.xhtml");

        return "success";

    }

    public String getCurrentTime() {

        return new SimpleDateFormat("dd MMM yyyy:HH:mm:SS").format(new java.util.Date().getTime()); // Older version, SimpleDateFormat is not thread safe
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
