package Testassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assertion {

    @Test
    public void softassertion(){

        SoftAssert s = new SoftAssert();
        s.assertEquals("Virat","irat");
        System.out.println("end of it");
        s.assertAll();

    }
}
