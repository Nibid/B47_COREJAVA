package projectjunit5;

public class ArmstrongFunction {

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int originalNum = num;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
