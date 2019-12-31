package greatestcommondivisor;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(12, 30);
        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(81, 153);
        getGreatestCommonDivisor(1010, 10);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int divisor = 1;
        int maxDivisor = 0;

        if ((first < 10) || (second < 10)) {
            System.out.println("-1");
            return -1;
        } else {
            while ((divisor <= first) && (divisor <= second)) {
                if ((first % divisor == 0) && (second % divisor == 0)) {
                    maxDivisor = divisor;
                }
                divisor++;
            }
            System.out.println(maxDivisor);
        }
        return maxDivisor;
    }
}
