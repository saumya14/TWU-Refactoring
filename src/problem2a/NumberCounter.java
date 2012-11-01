package problem2a;
//Understands the amount of different kinds of numbers
public class NumberCounter {
    private final int[] numberList;

    public NumberCounter(int... numbers) {
        this.numberList = numbers;
    }

    public int countEven() {
        int count = 0;
        for (int number : numberList) {
            if (isEven(number)) count++;
        }
        return count;
    }

    public int countOdd() {
        return numberList.length - countEven();
    }

    public int countPositive() {
        int count = 0;
        for (int number : numberList) {
            if (isPositive(number)) count++;
        }
        return count;
    }

    public int countNegative() {
        return numberList.length - countPositive();
    }

    private boolean isPositive(int number) {
        return number >= 0;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}