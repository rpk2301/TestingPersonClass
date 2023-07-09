package com.zipcodewilmington.person;

import java.util.PrimitiveIterator;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public String getNationality() {
        return nationality;
    }

    private String nationality;

    public int getWealth() {
        return wealth;
    }

    public double getSsn() {
        return ssn;
    }

    public double getGpa() {
        return gpa;
    }

    public char getFirstinitial() {
        return firstinitial;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public void setSsn(double ssn) {
        this.ssn = ssn;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setFirstinitial(char firstinitial) {
        this.firstinitial = firstinitial;
    }

    private int wealth;

    private double ssn;

    private double gpa;

    private char firstinitial;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(char firstinitial){
        this.firstinitial = firstinitial;
    }

    public Person(int wealth, double gpa)
    {
        this.wealth=wealth;
        this.gpa=gpa;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String nationality)
    {
        this.name = name;
        this.nationality=nationality;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
