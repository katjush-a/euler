import static org.junit.Assert.*;

/**
 * Created by alex on 6/29/16.
 */

public class OneTest {

    @org.junit.Test
    public void zeroReturnsZero() throws Exception {
        One one = new One();
        int sum = one.findMult(0);
        assertEquals(sum,0);
    }

    @org.junit.Test
    public void findMultOfThree() throws Exception {
        One three = new One();
        int sum = three.findMult(3);
        assertEquals(sum, 0);
    }

    @org.junit.Test
    public void findMultOfFive() throws Exception {
        One five = new One();
        int sum = five.findMult(5);
        assertEquals(sum, 3);
    }

    @org.junit.Test
    public void findMultOfFifteen() throws Exception {
        One fifteen = new One();
        int sum = fifteen.findMult(15);
        assertEquals(sum, 45);
    }

    @org.junit.Test
    public void findMultOfThousand() throws Exception {
        One thousand = new One();
        int sum = thousand.findMult(1000);
        assertEquals(sum, 233168);
    }
}