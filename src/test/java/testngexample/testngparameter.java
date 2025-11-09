package testngexample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngparameter {


    @Parameters("browser")
    @Test
    public void running_browser(String browsername){
        System.out.println("processing");

        if(browsername.equalsIgnoreCase("chrome")){

            System.out.println("starting chrome");
        }

        if(browsername.equalsIgnoreCase("firefox")){

            System.out.println("running firefox");
        }
    }
}
