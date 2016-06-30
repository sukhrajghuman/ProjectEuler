/**
 * Created by sghuman on 30/06/2016.
 */
public class Problem6 {

    public static void main(String[] args) {
        System.out.println(start());
    }

    /**
     * This was fairly basic problem and didn't take much time.
     * @return
     */
    public static int start(){
        int sumOfSquare=0;
        int a =0;
        for(int i=1;i<=100;i++){
            sumOfSquare = sumOfSquare+ i*i;
            a = a +i;
        }
        int squareOfSum = a*a;

        int result = squareOfSum - sumOfSquare;
        return result;
    }
}
