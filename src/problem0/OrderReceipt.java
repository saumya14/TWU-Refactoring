package problem0;

//Understands the components of an order.
public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
	}

	public String printReceipt() {
        double totalSalesTax = order.totalSalesTax();
        double totalBill = order.totalBill(totalSalesTax);
        StringBuilder output = new StringBuilder();

        printHeader(output);
        printAllItems(output);
        printFooter(output, totalSalesTax, totalBill);

		return output.toString();
	}

    private void printFooter(StringBuilder output, double totalSalesTax, double totalBill) {
        output.append("Sales Tax").append('\t').append(totalSalesTax);

        output.append("Total Amount").append('\t').append(totalBill);
    }

    private void printHeader(StringBuilder output) {
        output.append("======Printing Orders======\n");

        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());
    }

    private void printAllItems(StringBuilder output) {
        for (LineItem lineItem : order.getLineItems()) {
            printItemInfo(output, lineItem);
        }
    }

    private void printItemInfo(StringBuilder output, LineItem lineItem) {
        output.append(lineItem.getDescription());
        output.append('\t');
        output.append(lineItem.getPrice());
        output.append('\t');
        output.append(lineItem.getQuantity());
        output.append('\t');
        output.append(lineItem.totalAmount());
        output.append('\n');
    }
}