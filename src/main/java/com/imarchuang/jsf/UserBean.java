package com.imarchuang.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.Map;

/**
 * Created by marchuang on 2017-07-13.
 */
@ManagedBean
@RequestScoped
public class UserBean {
    private String userId;
    private String name;
    private String email;
    private String mobileNo;
    private String disp1;

    public String getDisp1() {
        return disp1;
    }

    public void setDisp1(String disp1) {
        this.disp1 = disp1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String verify() {

        FacesContext context = FacesContext.getCurrentInstance();

        //to retrieve additional parameter
        Map<String, String> params = context.getExternalContext()
                .getRequestParameterMap();
        String sendOtpFlag = params.get("OTP") != null ? params.get("OTP") : "";  // additional parameter to decide Verification by Email or Verification by Mobile

        if (sendOtpFlag.equals("true")) {
            System.out.println("OTP called");
            return "getotp";
        } else {
            // Code to send verification link through email
            System.out.println("Email Verification called");
            return "success";
        }

    }

    public void myBeanMethod() {
        System.out.println("My Bean Method Called when loading the JSF page");
    }
}
