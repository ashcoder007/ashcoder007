import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int a[] = {1, 3, 2, 4, 6, 7, 8, 9};
        System.out.println("Integer array is " + Arrays.toString(a));
        int eve = 0;
        int od = 0;

        for (int num : a) {
            if (num % 2 == 0) {
                eve++;
            } else {
                od++;
            }
        }

        System.out.println("the sum of even numbers is " + eve);
        System.out.println("the sum of odd numbers is " + od);
    }
}
