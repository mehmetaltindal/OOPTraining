package com.mehmetaltindal.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*User myUser = new User();
        myUser.name = "Mehmet";
        myUser.job = "Android Developer";

        User newUser = new User();
        newUser.name = "Picard";
        newUser.job = "Captain of USS Enterprise";*/

        User myUser = new User("Mehmet","Android Developer");
        System.out.println(myUser.information());
        System.out.println("name : " + myUser.name+"job : "+ myUser.job);

        //Encapsulation
        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.getAge());
        james.setAge(60,"Mehmet");
        System.out.println(james.getAge());

        // Inheritance
        SuperMusicians lars = new SuperMusicians("Lars","Drums",55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());


        //Polymorphism

        //Static Polymorphism

        Math math = new Math();
        System.out.println(math.sum());
        System.out.println(math.sum(5,6));
        System.out.println(math.sum(3,5,9));

        //Dynamic Polymorphism

        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();


        //Abstract and Interface
        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();

    }
}