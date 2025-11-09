package parallel_testing.class_level;

import org.testng.annotations.Test;

public class parallelclass2 {

    @Test
 public void second_class(){

     System.out.println("second class is taken by thread " + Thread.currentThread().getId());

 }

}
