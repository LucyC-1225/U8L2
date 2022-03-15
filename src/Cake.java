public class Cake extends Bakery{
    private boolean forBirthday;


    public Cake(String name, double price, boolean forBirthday) {
        super(name, price);
        this.forBirthday = forBirthday;
    }

    public boolean isForBirthday() {
        return forBirthday;
    }
    public void addFrosting(){
        System.out.println("Frosting added!");
    }
}
