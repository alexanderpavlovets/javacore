package com.alexanderpavlovets.app.classwork.lesson13linecreation;

/**
 * Created by olpav on 06/08/2017.
 */
public class Teacher extends Person {
    private String university;
    public Teacher(String name, String university){
        super(name);
        this.university = university;
    }

    public String lessonFinished(){
        return "Do not forget to make a home work";
    }
}
