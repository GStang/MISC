package Homework;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by DELL on 2016/11/5.
 */
public class IteratorTest {
    public static void main(String[] args) {
        LinkedList<Student> mylist = new LinkedList<Student>();

        Student stu1 = new Student("赵民",9012,80.0f);
        Student stu2 = new Student("钱青",9013,90.0f);
        Student stu3 = new Student("孙枚",9014,78.2f);
        Student stu4 = new Student("周右",9015,55.4f);
        mylist.add(stu1);
        mylist.add(stu2);
        mylist.add(stu3);
        mylist.add(stu4);
        Iterator<Student> iterator = mylist.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.name+" "+student.number+" "+student.score);
        }
    }

    private static class Student {
        String name;
        int number;
        float score;

        Student(String name, int number, float score) {
            this.name = name;
            this.number = number;
            this.score = score;
        }
    }
}

