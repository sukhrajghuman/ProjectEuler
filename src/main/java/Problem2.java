import java.util.ArrayList;

/**
 * Created by sghuman on 30/06/2016.
 */
public class Problem2 {

    public static void main(String[] args) {
        System.out.println(start());
    }

    public static int start() {
        int currentFib = 1;
        int nextFib = 2;
        int sum = 0;
        while (currentFib <= 4000000) {
            if (currentFib % 2 == 0)
                sum = sum + currentFib;
            int nextFibonacci = currentFib+nextFib;
            currentFib = nextFib;
            nextFib = nextFibonacci;
        }
        return sum;
    }
}
