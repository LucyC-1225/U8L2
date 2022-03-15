public class Cookie extends Bakery{
    private int numPerBatch;

    public Cookie(String name, double price, int numPerBatch) {
        super(name, price);
        this.numPerBatch = numPerBatch;
    }

    public int getNumPerBatch() {
        return numPerBatch;
    }
    public void addChocolate(){
        System.out.println("Chocolate added!");
    }
}
