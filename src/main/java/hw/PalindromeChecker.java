package hw;

public class PalindromeChecker {

    private static final int RIGHT_OFFSET = 10;

    /*
     * Похоже, что самый простой и оптимальный вариант.
     * Создаем еще одно число, которое будет равно перевернотому исходному.
     * В случае с палиндромом исходное и новое перевернутое будут равны.
     * */
    public static boolean check(int num) {
        int originalNum = num;
        int numToCompare = 0;

        if (num < 0) {
            return false;
        }

        if (num > 0 && num < 10) {
            return true;
        }

        while (num > 9) {
            numToCompare += num%RIGHT_OFFSET;
            numToCompare *= RIGHT_OFFSET;
            num /= RIGHT_OFFSET;
        }

        numToCompare += num%RIGHT_OFFSET;

        return numToCompare == originalNum;
    }

    /*
    * Реккурсиваня реализация с использованием Math
    * */
    public static boolean recursiveCheck(int num) {
        if (num < 0) {
            return false;
        }

        if (num > 0 && num < 10) {
            return true;
        }

        int length = (int) (Math.log10(num) + 1);
        int leftOffsetDivider = (int) Math.pow(10, length - 1);

        return checkWithDivider(num, leftOffsetDivider);
    }

    private static boolean checkWithDivider(int num, int leftOffsetDivider) {

        if (num%RIGHT_OFFSET != num/leftOffsetDivider) {
            return false;
        }

        leftOffsetDivider /= 10;
        num = (num / RIGHT_OFFSET) % leftOffsetDivider;
        if (num > 9) {
            leftOffsetDivider /= 10;
            return checkWithDivider(num, leftOffsetDivider);
        }

        return true;
    }
}
