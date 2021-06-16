package com.demoblaze.qa.models;

public class PayOrderData {

    private final String name;
    private final String country;
    private final String city;
    private final String creditCard;
    private final String month;
    private final String year;

    public PayOrderData(String name, String country, String city, String creditCard, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditCard = creditCard;
        this.month = month;
        this.year = year;

    }

    public String getName() {
        return name;
    }
  //  public void setName(String name) {this.name = name;}

    public String getCountry() {return country; }
 //   public void setCountry(String country) {this.country = country;}

    public String getCity() {return city;}
   // public void setCity(String city) {this.city = city;}

    public String getCreditCard() {
        return creditCard;
    }
  //  public void setCreditCard(String creditCard) {this.creditCard = creditCard;}

    public String getMonth() {
        return month;
    }
  //  public void setMonth(String month) {this.month = month;}

    public String getYear() {return year; }
   // public void setYear(String year) {this.year = year;}
}