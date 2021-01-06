package top.lenconda.design_pattern.task3.task3_3;

import java.util.*;

public class StudentIterator {
    List<Student> studentList = null;

    public StudentIterator() {
        Student[] students = new Student[5];
        studentList = new ArrayList<Student>() {{
            add(new Student("Ferdinand Porsche", 21));
            add(new Student("Ferruccio Lamborghini", 19));
            add(new Student("David Buick", 24));
            add(new Student("Karl Benz", 18));
            add(new Student("Enzo Ferrari", 22));
        }};
    }

    public void display() {
        Iterator<Student> i = studentList.iterator();
        System.out.println("Original data: ");

        while (i.hasNext()) {
            Student stu = i.next();
            System.out.println("name: " + stu.getName() + ", age: " + stu.getAge());
        }

        System.out.println();

        Collections.sort(studentList);
        Iterator<Student> t = studentList.iterator();
        System.out.println("DESC ordered data: ");

        while (t.hasNext()) {
            Student stu = t.next();
            System.out.println("name: " + stu.getName() + ", age: " + stu.getAge());
        }
    }
}
