package com.alexanderpavlovets.app.classwork.lesson13linecreation;

/**
 * Created by olpav on 06/08/2017.
 */
public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getResponse(String question) {
        return "My answer is" + question;
    }
}
