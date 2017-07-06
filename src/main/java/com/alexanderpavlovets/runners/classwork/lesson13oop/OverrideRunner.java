package com.alexanderpavlovets.runners.classwork.lesson13oop;

import com.alexanderpavlovets.app.classwork.lesson13linecreation.Person;
import com.alexanderpavlovets.app.classwork.lesson13linecreation.Student;
import com.alexanderpavlovets.app.classwork.lesson13linecreation.Teacher;

/**
 * Created by olpav on 06/08/2017.
 */
public class OverrideRunner {
    public static void main(String[] args) {
        Student student = new Student("Egor", "Kit center");
        System.out.println(student.getResponse("What is class?"));

        Teacher teacher = new Teacher("Ivan", "Kit Center");
        System.out.println(teacher.getResponse("What time is now"));

        Person person = new Student("Ilya", "What is class?");
        System.out.println(person.getResponse("What is class?"));

        person = new Teacher("Evgeniy", "Kit Center");
        System.out.println(person.getResponse("What time is now"));
    }
}
