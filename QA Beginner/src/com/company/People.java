package com.company;

import java.util.ArrayList;

public class People {
    public static void main(String[] args){
        enhancedLoop();
    }

    private static ArrayList<Person> person(){
        ArrayList<Person> p= new ArrayList<Person>();
        p.add(new Person("Paul",33,"Junior Dev"));
        p.add(new Person("Dave",44,"Dustman"));
        p.add(new Person("Julie",52,"Nurse"));
        p.add(new Person("Rebecca", 44,"Nail Technician"));
        p.add(new Person("Ray",31,"Tattoo Artist"));
        return p;
    }

    private static void enhancedLoop(){

        for (Person p: person() ){
            System.out.println(p);
        }
    }
}

