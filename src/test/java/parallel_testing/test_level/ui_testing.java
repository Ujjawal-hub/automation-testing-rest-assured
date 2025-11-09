package parallel_testing.test_level;

import org.testng.annotations.Test;

public class ui_testing {

    @Test
    public void uitestcase(){

        System.out.println("ui test case is take by thraed " + Thread.currentThread().getId());
    }
}

