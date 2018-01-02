package com.imarchuang.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * Created by marchuang on 2017-07-13.
 */
@ManagedBean(name="resultBean")
@RequestScoped   //You can use @ViewScope
public class ResultBean implements Serializable {

    private static final long serialVersionUID = 1L;

    public String result() {

        System.out.println("Inside Result Bean");
        return "success";

    }
}
