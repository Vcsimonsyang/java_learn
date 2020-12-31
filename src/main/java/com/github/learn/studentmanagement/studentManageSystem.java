package com.github.learn.studentmanagement;

import java.util.Scanner;
import java.util.ArrayList;

public class studentManageSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> students = new ArrayList<student>();
        String choice = "";
        do {
            System.out.println("-----Welcome to the student management system");
            System.out.println("1 Add student");
            System.out.println("2 Delete student");
            System.out.println("3 Modify student");
            System.out.println("4 Check all students");
            System.out.println("5 Exit");
            System.out.println("please enter your choice");

            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addStudent(students);
                    break;
                case "2":
                    delete(students);
                    System.out.println("Delete student success");
                    break;
                case "3":
                    modify(students);
                    break;
                case "4":
                    checkAllStudents(students);
                    break;
                case "5":
                    System.out.println("Thanks for your using");
                    break;
            }
        } while (!choice.equals("5"));
    }

    public static void addStudent(ArrayList<student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter student ID");
        String id = sc.nextLine();
        Boolean check = existCheck(array,id);
        if(check){
            System.out.println("Please enter student name");
            String name = sc.nextLine();

            System.out.println("Please enter student age");
            String age = sc.nextLine();

            System.out.println("Please enter student address");
            String address = sc.nextLine();

            student s1 = new student(id, name, age, address);
            array.add(s1);
            System.out.println("Add student successful");
        }else{
            System.out.println("Id exist, please check your info.");
        }
    }
    public static void checkAllStudents(ArrayList<student> array){
        System.out.println("ID\t\t\tName\t\tAge\t\tAddress");
        for(int i = 0; i < array.size(); i++){
            student s = array.get(i);
            System.out.println(s.getId() +"\t"+ s.getName() +"\t\t"+ s.getAge() +"\t"+ s.getAddress());
        }

    }
    public static Boolean existCheck(ArrayList<student> array, String id){
        Boolean check = true;
        for(int i = 0; i < array.size(); i++){
            student s = array.get(i);
            if (s.getId().equals(id)){
                check = false;
            }
        }
        return check;
    }
    public static void delete(ArrayList<student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the student Id");
        String id = sc.nextLine();
        for(int i = 0; i < array.size(); i++){
            student s = array.get(i);
            if(s.getId().equals(id)){
                array.remove(i);
            }else{
                System.out.println("Id not exist please check your info.");
            }
        }
    }
    public static void modify(ArrayList<student> array){
        
    }
}
