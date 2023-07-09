package com.zipcodewilmington.person;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest extends TestCase {
    @Test
    public void testGetNationality() {

        //GIVEN
        String expected = "American";
        String expectedName="Ralph";


        //When
        Person ralph = new Person(expectedName,expected);

        //Then
        String accname = ralph.getName();
        String accnat = ralph.getNationality();

        Assert.assertEquals(accname,expectedName);
        Assert.assertEquals(accnat,expected);

    }

    public void testGetWealthandGPA() {
        //Given
        int w = 4000;
        double gpa=3.13;

        //When
        Person ricky = new Person(w,gpa);

        //Then

        int accw = ricky.getWealth();
        double accg = ricky.getGpa();

        Assert.assertEquals(accg,gpa,0.1);
        Assert.assertEquals(accw,w);

    }

    public void testGetSsn() {
    }

    public void testGetGpa() {
    }

    public void testGetFirstinitial() {

        //given
        char expectedchar = 'C';

        //When
        Person person = new Person('C');

        //Then
        char actual = person.getFirstinitial();
        Assert.assertEquals(actual,expectedchar);

    }

    public void testSetNationality() {
    }

    public void testSetWealth() {
    }

    public void testSetSsn() {
    }

    public void testSetGpa() {
    }

    public void testSetFirstinitial() {
    }
}