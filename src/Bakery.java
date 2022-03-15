public class Bakery {
    private String name;
    private double price;

    public Bakery(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void sell(){
        System.out.println("Sold for " + price + " dollars");
    }
}
