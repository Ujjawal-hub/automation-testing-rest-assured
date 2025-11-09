package parallel_testing.class_level;

import org.testng.annotations.Test;

public class parallel_class {
@Test
   public void fristclass(){

       System.out.println("class number one taken by thread  " + Thread.currentThread().getId());

   }


}
