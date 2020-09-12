package com.mehmetaltindal.oopproject;

public class SuperMusicians extends Musicians {


    public SuperMusicians(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    public String sing() {
        return "Nothing Else Matter";
    }

}
