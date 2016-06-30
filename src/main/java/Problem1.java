import java.util.ArrayList;

/**
 * Created by sghuman on 30/06/2016.
 */
public class Problem1 {

    public static void main(String[] args) {
        run();
    }

    public static int run() {

        int result = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result = result + i;
            }
        }
        return result;
    }
}
