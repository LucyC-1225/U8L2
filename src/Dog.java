public class Dog extends Animal{
    private boolean hasBeenWalked;
    private String favDogFood;

    public Dog(String name, int age, boolean vaccinated, boolean adopted, String favDogFood) {
        super(name, age, vaccinated, adopted);
        hasBeenWalked = false;
        this.favDogFood = favDogFood;
    }

    public boolean isHasBeenWalked() {
        return hasBeenWalked;
    }
    public String getFavDogFood(){
        return favDogFood;
    }
    public void walk(){
        System.out.println("I am being walked!");
    }
    public void bark(){
        System.out.println("Woof woof!");
    }
}
