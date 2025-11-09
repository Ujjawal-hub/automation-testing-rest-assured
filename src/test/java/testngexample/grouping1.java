package testngexample;

import org.testng.annotations.Test;



public class grouping1 {


    @Test (groups = {"reg"})
    public void testcase1(){
        System.out.println("test case 1");
    }

    @Test(groups = {"reg","sanity"})
    public void testcase2(){
        System.out.println("test case 2");
    }
    @Test(groups = {"reg","smoke"})
    public void testcase3(){
        System.out.println("test case 3");
    }





}
