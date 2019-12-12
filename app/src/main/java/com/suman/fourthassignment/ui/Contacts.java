package com.suman.fourthassignment.ui;

public class Contacts {
    private String name;
    private String address;
    private String gender;
    private String age;
    private int imageID;
    private String delimgID;

    //constructor
    public Contacts(String name, String address, String gender, String age, int imageID, String delimgID){
        this.name= name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.imageID = imageID;
        this.delimgID = delimgID;
    }

    //Getter and Setter
    public String getName()
    {
        return name;

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;

    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(){
        this.gender = gender;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age){
        this.age = age;
    }

    public int getImageID()
    {
        return imageID;
    }

    public void setImageID(int imageID)
    {
        this.imageID = imageID;

    }

    public String getDelimgID()
    {
        return delimgID;
    }
    public void setDelimgID(String delimgID)
    {
        this.delimgID =delimgID;
    }
}
