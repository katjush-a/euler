package problem_six;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumSquareTest {
    @Test
    public void squareDifferenceOf2(){
        SumSquare sum = new SumSquare();
        assertEquals(4,sum.getDifference(2));
    }

    @Test
    public void squareDifferenceOf3(){
        int difference = SumSquare.getDifference(3);
        assertEquals(22,difference);
    }

    @Test
    public void squareDifferenceOf10(){
        int difference = SumSquare.getDifference(10);
        assertEquals(2640,difference);
    }

    @Test
    public void squareDifferenceOf100(){
        int difference = SumSquare.getDifference(100);
        assertEquals(25164150,difference);
    }
}