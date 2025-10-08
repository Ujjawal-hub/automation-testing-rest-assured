package org.example;

public class buiderpattern {

    public buiderpattern step1(){

        System.out.println("step1");

        return this;
    }


    public buiderpattern step2(){

        System.out.println("step2");

        return this;

    }

    public buiderpattern step3(){

        System.out.println("step3");
return this;
    }

    public static void main(String[] args) {

        buiderpattern t = new buiderpattern();

        t.step1().step2().step3();

    }

}


