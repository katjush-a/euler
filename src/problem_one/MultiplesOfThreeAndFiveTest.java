package problem_one;

import org.junit.Test;

import static org.junit.Assert.*;


public class MultiplesOfThreeAndFiveTest {

    @Test
    public void zeroReturnsZero() throws Exception {
        assertEquals(sumOfMultiplesBelow(0), 0);
    }

    @Test
    public void findNoMultiplesBelowThree() throws Exception {
        assertEquals(sumOfMultiplesBelow(3), 0);
    }

    @Test
    public void findsOneMultipleBelowFive() throws Exception {
        assertEquals(sumOfMultiplesBelow(5), 3);
    }

    @Test
    public void findMultOfFifteen() throws Exception {
        assertEquals(sumOfMultiplesBelow(15), 45);
    }

    @Test
    public void sixteenIncludesFifteen() throws Exception {
        assertEquals(sumOfMultiplesBelow(16), sumOfMultiplesBelow(15) + 15);
    }

    @Test
    public void findMultOfThousand() throws Exception {
        assertEquals(sumOfMultiplesBelow(1000), 233168);
    }

    private int sumOfMultiplesBelow(int number) {
        return new MultiplesOfThreeAndFive().sumBelow(number);
    }

}