package problem0;

import java.util.ArrayList;
import java.util.List;
//Understands the information for every receipt.
public class Order {
    public static final double SALES_TAX_RATE = 0.10;
    String customerName;
    String customerAddress;
    List<LineItem> goodsList;

    public Order(String customerName, String customerAddress, List<LineItem> goodsList) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.goodsList = goodsList;
    }

    public Order(ArrayList<LineItem> listOfItems) {
        this.goodsList = listOfItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<LineItem> getLineItems() {
        return goodsList;
    }

    public double totalSalesTax() {
        double totalSalesTax = 0.0;
        for (LineItem lineItem : goodsList) {
            totalSalesTax += lineItem.totalAmount() * SALES_TAX_RATE;
        }
        return totalSalesTax;
    }

    private double calculateSubtotal() {
        double subtotal=0;
        for (LineItem lineItem : getLineItems()) {

            subtotal += lineItem.totalAmount();
        }
        return subtotal;
    }

    public double totalBill(double totalSalesTax) {

        double subtotal = calculateSubtotal();

        return subtotal + totalSalesTax;
    }

}
