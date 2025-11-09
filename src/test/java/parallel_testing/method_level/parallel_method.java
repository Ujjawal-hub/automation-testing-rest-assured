package parallel_testing.method_level;

import org.testng.annotations.Test;

public class parallel_method {

 @Test
 void valid_test(){

     System.out.println("valid test " + Thread.currentThread().getId());
 }


 @Test
 void invalid_test(){

     System.out.println("invalid test " + Thread.currentThread().getId());
 }

}
