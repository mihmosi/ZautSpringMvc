package com.mosi.springMvc.model;

import java.util.Date;

public class User {
    private long id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private String profession;

    private boolean merried;

    private Date birthday;
public User() {
    }

//    public User(String name, String email, String password, String gender, String note, String profession, boolean merried, Date birthday) {
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.gender = gender;
//        this.note = note;
//        this.profession = profession;
//        this.merried = merried;
//        this.birthday = birthday;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public boolean isMerried() {
        return merried;
    }

    public void setMerried(boolean merried) {
        this.merried = merried;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        String sb = "User{" + "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", note='" + note + '\'' +
                ", profession='" + profession + '\'' +
                ", merried=" + merried +
                ", birthday=" + birthday +
                '}';
        return sb;
    }
}
