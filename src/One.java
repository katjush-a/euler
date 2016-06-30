/**
 * Created by alex on 6/29/16.
 */
public class One {

    public int findMult(int num){
        int sum = 0;
        for(int i = 3;i < num;i++){
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        //int CommandLineArgument1 = Integer.parseInt(args[0]);
        One myone = new One();
        System.out.println(myone.findMult(1000));
    }
}
