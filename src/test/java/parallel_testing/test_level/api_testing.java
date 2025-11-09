package parallel_testing.test_level;

import org.testng.annotations.Test;

public class api_testing {

    @Test
    public void apitestcase(){

        System.out.println("api test case is take by thraed " + Thread.currentThread().getId());
    }
}
