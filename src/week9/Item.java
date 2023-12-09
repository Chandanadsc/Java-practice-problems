package week9;

class Item implements Comparable<Item> {
    private String name;
    private int id;
    private double cost;

    public Item(String name, int id, double cost) {
        this.name = name;
        this.id = id;
        this.cost = cost;
    }

    @Override
    public int compareTo(Item other) {
        // Compare items based on their cost
        return Double.compare( other.cost,this.cost);
    }

    @Override
    public String toString() {
        return "Item [Name: " + name + ", ID: " + id + ", Cost: $" + cost + "]";
    }
}

