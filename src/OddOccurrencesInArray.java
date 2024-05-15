import java.util.HashMap;
import java.util.Map;


/*
 *  Correctness: 100%
 *  Performance: 100%
 *  Task score: 100%
 */
public class OddOccurrencesInArray {

    public static void main(String[] args) {

        int[] elements = {9, 3, 9, 3, 9, 7, 9};

        System.out.println(findUnpaired(elements));

    }

    private static int findUnpaired(int[] A) {
        final HashMap<Integer, Integer> pair = new HashMap<>();

        for (int i : A) {
            if (!pair.containsKey(i)) {
                pair.put(i, 1);
            } else {
                pair.put(i, pair.get(i) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : pair.entrySet()) {
            if(entry.getValue() % 2 != 0)  {
                return entry.getKey();
            }
        }

        return 0;

    }
}
