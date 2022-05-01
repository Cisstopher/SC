import java.util.*;

public class Catalog {

    private ArrayList<Item> items;

    public Catalog(String name) {

    }

    public void add(Item next) {
    }

    public int size() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return items.size();
    }

    public Item get(int index) {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code

        return get(index);
    }

    public String getName() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return "Catalog";
    }
}
