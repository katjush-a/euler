/**
 * Created by alex on 6/29/16.
 */
public class SumSquare {

    public static int getDifference(int num){
        int sumOfSquares = 0;
        int squareOfSums = 0;
        for(int i = 0;i <= num;i++){
            sumOfSquares += i*i;
            squareOfSums += i;
        }
        squareOfSums *= squareOfSums;
        return squareOfSums - sumOfSquares;
    }

    public static void main(String args[]){
        SumSquare output = new SumSquare();
        System.out.println(output.getDifference(10));
    }
}