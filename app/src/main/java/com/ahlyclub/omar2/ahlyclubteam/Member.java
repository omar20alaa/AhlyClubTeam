package com.ahlyclub.omar2.ahlyclubteam;

import java.io.Serializable;

public class Member implements Serializable
{
    int id;
    String name;
    String heigth;
    String tishert_number;
    String profile_image;
    String nationality;
    String age;
    String position;

    public Member(int id, String name, String heigth, String tishert_number, String profile_image, String nationality, String age, String position) {
        this.id = id;
        this.name = name;
        this.heigth = heigth;
        this.tishert_number = tishert_number;
        this.profile_image = profile_image;
        this.nationality = nationality;
        this.age = age;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHeigth() {
        return heigth;
    }

    public String getTishert_number() {
        return tishert_number;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public String getNationality() {
        return nationality;
    }

    public String getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }
}
