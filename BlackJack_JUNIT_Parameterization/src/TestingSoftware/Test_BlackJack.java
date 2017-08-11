package TestingSoftware;
import Software.Calculation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Test_BlackJack {

    private int expected;
    private int card1;
    private int card2;
    private int cards;

    @Parameterized.Parameters
    public static Collection<Object[]> testMultiples(){
        return Arrays.asList (new Object[][]{
                {11, 11, 11, 22},{20, 10, 10, 20},{14, 7, 7, 14}
        });
    }
    public Test_BlackJack(int expected, int card1, int card2, int cards) {
        this.expected = expected;
        this.card1 = card1;
        this.card2 = card2;
        this.cards = cards;
    }

    @Test
    public void testBlackJackNumber() {
        Calculation c = new Calculation (card1,card2, cards);
        assertEquals (this.expected, c.blackJackNumber (card1, card2));
    }
}
