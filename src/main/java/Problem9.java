/**
 * Created by sghuman on 1/07/2016.
 */
public class Problem9 {

    public static void main(String[] args) {
        System.out.println(start());
    }

    /**
     * Checks to see if a given set of triplets are a pythag triad.
     * @param a
     * @param b
     * @param c
     * @return true if pythag triad, false otherwise
     */
    public static boolean isItAPythagoreanTriplet(int a, int b, int c){
        boolean condition = false;
        int asquared = a*a;
        int bsquared = b*b;
        int csquared = c*c;

        if (asquared+bsquared==csquared){
            condition = true;
        }
        return condition;
    }

    public static int start(){
        int a =0;
        int b=0;
        int c = 0;
        int product = 0;

        for (int i =1; i<1000;i++){
            a=i;
            for (int j = 1; j<1000;j++){
                b=j;
                //since their sum is 1000, c will be 1000-a-b
                c=1000-b-a;
                if (c>a &&c>b) {
                    if (isItAPythagoreanTriplet(a, b, c))
                        product = a * b * c;
                }
            }
        }
        return product;
    }
}
