package com.mehmetaltindal.oopproject;

public class User extends People {

    // Property

    String name;
    String job;


    //Constructer


    public User(String nameInput, String jobInput) {
        this.name = nameInput;
        this.job = jobInput;


        System.out.println("User Created");
    }
}
