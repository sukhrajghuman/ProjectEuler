import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sghuman on 30/06/2016.
 */
public class Problem4 {

    public static void main(String[] args) {
        System.out.println(start());
    }

    /**
     * Finds the largest palindrome when multipling by two 3 digit numbers.
     * @return the largest palindrome
     */
    public static int start() {
        int palindrome = 0;
        //I'm basically multiplying from j starting at i to avoid redundant multiplications
        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                int num = i * j;
                if (isNumberPalindrome(num) && num > palindrome) {
                    palindrome = num;
                }
            }
        }
        return palindrome;
    }


    /**
     * Returns whether any given number is a palindrome
     * @param a is the input number
     * @return true if the number is a palindrome, false otherwise.
     */
    public static boolean isNumberPalindrome(int a){
        boolean condition = false;
            ArrayList<Integer> result = new ArrayList<Integer>();
            while (a> 0){
                int digit = a%10;
                a = a/10;
                result.add(digit);
            }

        ArrayList<Integer> reversed = new ArrayList<Integer>();
        reversed.addAll(result);
        Collections.reverse(reversed);

        if(result.equals(reversed)){
            condition = true;
        }
        return condition;
}

    }
