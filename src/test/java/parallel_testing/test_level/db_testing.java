package parallel_testing.test_level;

import org.testng.annotations.Test;

public class db_testing {

    @Test
    public void dbtestcase(){

        System.out.println("db test case is take by thraed " + Thread.currentThread().getId());
    }
}

