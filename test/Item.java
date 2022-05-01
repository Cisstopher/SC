import java.text.*;

public class Item {
    // You will need to add more instance variables
    private double price;
    private double bulkPrice;
    private NumberFormat formatter;
    private int bulkQuantity;
    private String name;

    public Item(String name, double price) {

    }

    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
        // this(/*WHAT SHOULD YOU PUT HERE?*/);

    }

    public double priceFor(int quantity) {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code

        return this.price;
    }

    public String toString() {
        String s = this.name + ":";
        s = s + this.bulkQuantity + "\n";
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return s;
    }
}
