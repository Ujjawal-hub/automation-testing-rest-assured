package org.example;

public class nonbuilderpattern {

    void step1(){

        System.out.println("this is step 1");

    }


    void step2(){

        System.out.println("this is step 2");
    }

    void step3(){


        System.out.println("this is step 3");
    }


    public static void main(String[] args) {

        nonbuilderpattern t = new nonbuilderpattern();

        t.step1();
        t.step2();
        t.step3();
    }

}

