package com.phonelist.phonelist.domain;

public class User {
    private Adress adress;
    private String name;
    private int age;
    private String sex;

    public User(Adress adress, String name, int age, String sex) {
        this.adress = adress;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
