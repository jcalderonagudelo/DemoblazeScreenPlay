package com.demoblaze.qa.models;


public class LogInData {

    private final String userName;
    private final String passWord;

    public LogInData(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }
    public String getUserName(){return userName;}

    public String getPassWord(){return passWord;}

}
