package com.alexanderpavlovets.app.classwork.lesson13linecreation;

/**
 * Created by olpav on 06/08/2017.
 */
public class Student extends Person {
    private String university;

    public Student(String name, String university){
        super(name);
        this.university = university;
    }

    @Override
    public String getResponse(String question){
        return "Do not forget to do a home work";
    }
}
