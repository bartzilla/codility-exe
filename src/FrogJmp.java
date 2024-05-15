public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(jump2(10, 85, 30));
    }

    /*
     *  Correctness: 100%
     *  Performance: 100%
     *  Task score: 100%
     *
     *  Complexity: O(N)
     */
    private static int jump2(int X, int Y, int D) {
        return (int) Math.ceil(((double)Y - (double)X) / (double) D);
    }

    private static int jump(int start, int end, int jump) {

        int position = start;
        int count = 0;
        while (position < end) {
            position += jump;
            count++;
        }

        return count;
    }
}
