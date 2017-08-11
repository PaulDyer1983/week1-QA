package TestingSoftware;
import Software.Calculation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith (Parameterized.class)
public class TestCalculation {

    private int expected;
    private int num1;
    private int num2;
    private int num3;

    @Parameterized.Parameters
    public static Collection<Object[]> testMultiples(){
        return Arrays.asList (new Object[][]{
                {10, 1, 1, 10},{6, 1, 2, 3},{10, 2, 2, 10}
        } );
    }

    public TestCalculation(int expected, int num1, int num2, int num3){
        this.expected = expected;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Test
    public void testCalculation(){
        Calculation c = new Calculation (num1,num2,num3);
        assertEquals(this.expected, c.uniqueNumber ());
    }
}
