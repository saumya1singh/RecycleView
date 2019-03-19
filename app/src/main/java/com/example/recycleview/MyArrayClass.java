package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;

public class MyArrayClass extends AppCompatActivity {

    String thry, tm , clr;

    public MyArrayClass(String thry, String tm ,String clr) {
        this.thry = thry;
        this.tm = tm;
        this.clr=clr;
    }

    public String getThry() {
        return thry;
    }

    public String getTm() {
        return tm;
    }

    public  String getClr(){
        return clr;
    }

    public void setThry(String thry) {
        this.thry = thry;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public void setClr(String clr) {
        this.clr = clr;
    }
}
