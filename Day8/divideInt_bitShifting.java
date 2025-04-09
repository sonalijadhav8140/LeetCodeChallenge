public class divideInt_bitShifting {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long dividend1 = Math.abs((long) dividend);
        long divisor1 = Math.abs((long) divisor);

        int quetient = 0;
        while (divisor1 <= dividend1) {
            long temp = divisor1;
            int count = 1;

            while (dividend1 >= (temp << 1)) {
                temp <<= 1;
                count <<= 1;

            }
            dividend1 -= temp; 
            quetient = quetient + count; // add how many times we subtracted
        }
       // If signs are different, result is negative
        if ((dividend < 0) ^ (divisor < 0)) {
            quetient = -quetient;
        }

        return quetient;
    }
}
