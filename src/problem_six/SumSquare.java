package problem_six;

public class SumSquare {

    public static int getDifference(int number){
        int sumOfSquares = 0;
        int squareOfSums = 0;
        for(int i = 0;i <= number;i++){
            sumOfSquares += i*i;
            squareOfSums += i;
        }
        squareOfSums *= squareOfSums;
        return squareOfSums - sumOfSquares;
    }
}