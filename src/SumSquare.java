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

    public static void main(String args[]){
        SumSquare output = new SumSquare();
        System.out.println(output.getDifference(10));
    }

    public int difference(int i) {
        return SumSquare.getDifference(i);
    }
}