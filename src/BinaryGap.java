import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  Correctness: 100%
 *  Performance: not assessed
 *  Task score: 100%
 */
public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(BinaryGap.findBinaryGap(32));
    }

    private static int findBinaryGap(int N) {
        char[] binaryCharArray = Integer.toBinaryString(N).toCharArray();

        int pairs = 0;
        int count = 0;
        List<Integer> gaps = new ArrayList<>();

        for (char c : binaryCharArray) {
            if (c == '1') {
                pairs++;
            }

            if (c == '0') {
                count++;
            }

            if (pairs == 2) {
                pairs = 1;
                gaps.add(count);
                count = 0;
            }
        }

        return gaps.isEmpty() ? 0 : Collections.max(gaps);
    }
}