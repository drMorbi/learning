package edu.javacours.studentorder.domain;

import java.time.LocalDate;

public abstract class Person {

    protected String surName;
    protected String giveName;
    private String patronymic;
    private LocalDate date;
    private Address address;

    public Person(){
    }

    public Person(String surName, String giveName, String patronymic, LocalDate date) {
        this.surName = surName;
        this.giveName = giveName;
        this.patronymic = patronymic;
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGiveName() {
        return giveName;
    }

    public void setGiveName(String giveName) {
        this.giveName = giveName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
