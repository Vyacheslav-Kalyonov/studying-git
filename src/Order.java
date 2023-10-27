public class Order {

    private int count = 0;

    public Order {

    }

    public Order(int count) {
        this.count = count;
    }

    @Override
    public void toString() {
        return "Order has count: " + count;
    }

    public int getCount() {
        return this.count;
    }
}