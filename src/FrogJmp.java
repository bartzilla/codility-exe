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
    private static int jump2(int start, int end, int jump) {

        double result = ((double)end - (double)start) / (double) jump;

        if(result % 2 == 0)
            return (int) Math.floor(result);

        return (int) Math.ceil(result);
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
