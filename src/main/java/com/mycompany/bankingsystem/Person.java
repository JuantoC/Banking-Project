/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

public class Person {

    private String name;
    private final String dateOfBirth;
    private String gender;
    private int creditScore;
    private final int document;

    // Constructor
    public Person(String name, String dateOfBirth, String gender, int creditScore, int document) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.creditScore = creditScore;
        this.document = document;
    }

    // Sets
    public void setName(String name) { this.name = name;}

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    // Gets
    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public int getDocument() {
        return document;
    }

}
