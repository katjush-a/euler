package problem_one;

import org.junit.Test;

import static org.junit.Assert.*;


public class MultiplesOfThreeAndFiveTest {

    @Test
    public void zeroReturnsZero() throws Exception {
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive();
        int sum = multiples.sumBelow(0);
        assertEquals(sum,0);
    }

    @Test
    public void findNoMultiplesBelowThree() throws Exception {
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive();
        int sum = multiples.sumBelow(3);
        assertEquals(sum, 0);
    }

    @Test
    public void findsOneMultipleBelowFive() throws Exception {
        MultiplesOfThreeAndFive five = new MultiplesOfThreeAndFive();
        int sum = five.sumBelow(5);
        assertEquals(sum, 3);
    }

    @Test
    public void findMultOfFifteen() throws Exception {
        MultiplesOfThreeAndFive fifteen = new MultiplesOfThreeAndFive();
        int sum = fifteen.sumBelow(15);
        assertEquals(sum, 45);
    }

    @Test
    public void findMultOfThousand() throws Exception {
        MultiplesOfThreeAndFive thousand = new MultiplesOfThreeAndFive();
        int sum = thousand.sumBelow(1000);
        assertEquals(sum, 233168);
    }
}