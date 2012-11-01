package problem2a;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
//Ensures counting of different amounts of numbers.
public class NumberCounterTest {
    @Test
    public void shouldCountEvenNumbers() {
        int evens = new NumberCounter(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).countEven();
        assertThat(evens, is(5));
    }

    @Test
    public void shouldCountOddNumbers() {
        int odds = new NumberCounter(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).countOdd();
        assertThat(odds, is(6));
    }

    @Test
    public void shouldCountPositiveNumbers() {
        int positives = new NumberCounter(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4).countPositive();
        assertThat(positives, is(5));
    }

    @Test
    public void shouldCountNegativeNumbers() {
        int negatives = new NumberCounter(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4).countNegative();
        assertThat(negatives, is(5));
    }
}

