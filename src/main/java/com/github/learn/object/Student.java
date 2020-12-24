package com.github.learn.object;

public class Student {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Student() {
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
