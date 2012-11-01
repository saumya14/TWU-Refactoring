package problem0;


import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OrderTest {
    @Test
    public void shouldCalculateTotalSalesTaxForBillOne(){
        ArrayList<LineItem> listOfItems=new ArrayList<LineItem>() {{
            add(new LineItem("milk", 100.0, 2));
            add(new LineItem("biscuits", 50.0, 5));
            add(new LineItem("chocolate", 200.0, 1));
        }};

        Order order=new Order(listOfItems);

        double salesTax=order.totalSalesTax();

        assertThat(salesTax,is(65.00));
    }
    @Test
    public void shouldCalculateTotalSalesTaxForBillTwo(){
        ArrayList<LineItem> listOfItems=new ArrayList<LineItem>() {{
            add(new LineItem("milk", 10.0, 2));
            add(new LineItem("biscuits", 50.0, 5));
            add(new LineItem("chocolate", 20.0, 1));
        }};

        Order order=new Order(listOfItems);

        double salesTax=order.totalSalesTax();

        assertThat(salesTax,is(29.00));
    }

}
