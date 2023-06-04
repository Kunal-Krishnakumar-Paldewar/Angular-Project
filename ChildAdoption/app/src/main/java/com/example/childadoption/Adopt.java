package com.example.childadoption;

public class Adopt {
    String adoptid,childname,childage,gender;

    public Adopt(String id, String name, String age, String gen) {
        this.adoptid=id;
        this.childname=name;
        this.childage=age;
        this.gender=gen;
    }

    public String getAdoptid() {
        return adoptid;
    }

    public String getChildname() {
        return childname;
    }

    public String getChildage() {
        return childage;
    }
    public String getGender(){
        return gender;
    }
}
