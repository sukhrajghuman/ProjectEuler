
/**
 * Created by sghuman on 30/06/2016.
 */
public class Problem5 {
    public static void main(String[] args) {
        System.out.println(start());
    }

    public static int start(){
        int a=1;
        //I'm not so happy with this. It works, but is very inefficient;
        while (!isNumberDivisibleby1to20(a)){
            a++;
        }
        return a;
    }

    /**
     * Checks to see if given number is divisible by everything from 1-20
     * @param a
     * @return
     */
    public static boolean isNumberDivisibleby1to20(int a){
        boolean condition = true;
        //We don't need to go from 1-20, because for example if a is divisible
        //by 20, then it is automatically divisible by 4,5,10 etc.
        for (int i=11;i<=20;i++){
            if (a%i !=0)
                condition = false;
        }
        return condition;
    }
}
