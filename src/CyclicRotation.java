import java.util.Arrays;

/*
 *  Correctness: 100%
 *  Performance: not assessed
 *  Task score: 100%
 */

public class CyclicRotation {

    public static void main(String[] args) {

        int[] elements = {1, 1, 2, 3, 5};
        int times = 42;

        int[] rotated = rotate(elements, times);

        for (int i : rotated) {
            System.out.println(i);
        }
    }

    private static int[] rotate(int[] A, int K) {

        int[] rotated = Arrays.copyOf(A, A.length);

        for (int i = 0; i < A.length; i++)
            if ((K % A.length) + i < A.length) {
                rotated[(K % A.length) + i] = A[i];
            } else {
                rotated[((K % A.length) + i) - A.length] = A[i];
            }

        return rotated;
    }
}
