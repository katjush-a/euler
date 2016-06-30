import static org.junit.Assert.*;

/**
 * Created by alex on 6/29/16.
 */
public class SumSquareTest {
    @org.junit.Test
    public void squareDifferenceOf2(){
        int difference = SumSquare.getDifference(2);
        assertEquals(4,difference);
    }

    @org.junit.Test
    public void squareDifferenceOf3(){
        int difference = SumSquare.getDifference(3);
        assertEquals(22,difference);
    }

    @org.junit.Test
    public void squareDifferenceOf10(){
        int difference = SumSquare.getDifference(10);
        assertEquals(2640,difference);
    }

    @org.junit.Test
    public void squareDifferenceOf100(){
        int difference = SumSquare.getDifference(100);
        assertEquals(25164150,difference);
    }
}