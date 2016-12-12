/**
 * Created by Praktika on 9.12.2016.
 */

import java.util.Random;
import java.util.Arrays;

public class chapter8proov {
    public static void main(String[] args) {
        int numValues = 8;
        int[] array = randomArray(numValues);
        int[] scores = randomArray(30);
        int a = inRange(scores, 90, 100);
        int b = inRange(scores, 80, 90);
        int c = inRange(scores, 70, 80);
        int d = inRange(scores, 60, 70);
        int f = inRange(scores, 0, 60);

        System.out.println(Arrays.toString(randomArray(array[0])));
        System.out.println(inRange(scores, 90, 100));
    }
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }

}