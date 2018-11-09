package com.lzw;
import static java.lang.System.out;


public class Student {
    public String name;
    public String sex;
    public int age;

    public Student(){
        name = "unknow name";
        sex = "unknow sex";
        age = 0;
    }

    public Student(String name){
        this.name = name;
    }

    public Student(String name, String sex, int age){
        this(name);
        this.sex = sex;
        this.age = age;
    }

    public void sayMyInfo(){
        out.print("My name is " + name + ". ");
        out.print("Sex is " + sex + ". ");
        out.print("Age is " + age + ". ");
        out.println();
    }

    public static void main(String args[]){
        Student student1 = new Student();
        Student student2 = new Student("Zhang San");
        Student student3 = new Student("Li Si", "Male", 14);

        student1.sayMyInfo();
        student2.sayMyInfo();
        student3.sayMyInfo();
    }

}
