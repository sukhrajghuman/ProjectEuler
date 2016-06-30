import java.util.ArrayList;

/**
 * Created by sghuman on 30/06/2016.
 */
public class Problem1 {

    public static void main(String[] args) {
        start();
    }

    /**
     * sums up all the multiples of 3 or 5 between 1 and 1000 non inclusive.
     * @return
     */
    public static int start() {
        int result = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result = result + i;
            }
        }
        return result;
    }
}
