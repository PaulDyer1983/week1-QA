package TestPackage;
import ProgramPackage.Temperature;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class Testing {

    private boolean expected;
    private int temperature;
    private boolean isSummer;


    @Parameterized.Parameters
    public static Collection<Object[]>  testMultipleTime(){
        return Arrays.asList (new Object[][]{
            {true,false,60},{true,true,71},{true,true,99}
        });

    }

    public Testing(boolean expected, boolean isSummer, int temperature){
        this.expected = expected;
        this.isSummer = isSummer;
        this.temperature = temperature;
    }
    @Test
    public void testTemperature(){
        Temperature t = new Temperature ();
        assertEquals(this.expected, t.temperature(this.temperature,this.isSummer));
    }
}
