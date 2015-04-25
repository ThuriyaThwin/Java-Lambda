/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MyBean {
    private static final Logger LOG = Logger.getLogger(MyBean.class.getName());

    private int firstNum;
    private int secondNum;
    private int result;

    public MyBean() {
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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    public String plusMethod() {
        result = firstNum + secondNum;
        LOG.log(Level.INFO,"Result:" + result);
        return null;

    }

    public String multiplyMethod() {
        result = firstNum * secondNum;
        return null;
    }

    public String minusMethod() {
        result = firstNum - secondNum;
        return null;
    }

    public String divideMethod() {
        result = firstNum / secondNum;
        return null;
    }

}
