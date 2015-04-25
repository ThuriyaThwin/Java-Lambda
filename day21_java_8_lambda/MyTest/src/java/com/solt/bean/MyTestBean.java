/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solt.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author acer
 */
@ManagedBean
@RequestScoped
public class MyTestBean {
    private int firstNum;
    private int secondNum;
    private int result;
    public MyTestBean() {
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public int getResut() {
        return result;
    }

    public void setResut(int resut) {
        this.result = resut;
    }
    public String calculate(){
        result=firstNum+ secondNum;
        return null;
    }
}
