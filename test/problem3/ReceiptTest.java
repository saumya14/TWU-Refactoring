package problem3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReceiptTest {
    /**
     * Fixed Charges - 50 Rs.
     * Minimum Total Charges - 150 Rs.
     * <p/>
     * Non AC - 15 Rs/Km. for first 10 Km., 12 Rs/Km. from there on.
     * AC - 20 Rs/Km. for first 10 Km., 17 Rs/Km. from there on.
     * 20 % extra for peak time
     * <p/>
     * Sales Tax - 10 % on total bill amount
     */
    @Test
    public void shouldCalculateChargesForACTaxiFor20Kms() {
        // ((20 * 10 + 17 * 20) + 50 ) * 1.1 = 649.0
        double cost = new Receipt(new Taxi(true, 30, false)).totalCost();
        assertEquals(590D, cost, 0.01D);
    }

    @Test
    public void shouldCalculateChargesForNonACTaxiFor20Kms() {
        // ((15 * 10 + 12 * 20) + 50 ) * 1.1 = 374.0
        double cost = new Receipt(new Taxi(false, 30, false)).totalCost();
        assertEquals(440D, cost, 0.01D);
    }

    @Test
    public void shouldCalculateForACChargesFor20KmsPeakTime() {
        // ((20 * 10 + 17 * 20) * 1.2 + 50 ) * 1.1 = 767.8
        double cost = new Receipt(new Taxi(true, 30, true)).totalCost();
        assertEquals(698.0D, cost, 0.01D);

    }

    @Test
    public void shouldCalculateChargesForNonACTaxiFor20KmsPeakTime() {
        // ((15 * 10 + 12 * 20) * 1.2 + 50 ) * 1.1 = 569.8
        double cost = new Receipt(new Taxi(false, 30, true)).totalCost();
        assertEquals(518.0D, cost, 0.01D);
    }
}