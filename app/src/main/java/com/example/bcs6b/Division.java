package com.example.bcs6b;

public class Division extends MainActivity {
    public int div;
    public int que;
    public String message;
    public String div(int a,int b){
        div=a/b;
        que=a%b;
        message=" "+div+"R: "+que;
        return message;


    }
}
