public class Cat extends Animal {
    private boolean hasPlayedWith;
    private String favCatFood;

    public Cat(String name, int age, boolean vacinnated, boolean adopted, String favCatFood){
        super(name, age, vacinnated, adopted);
        hasPlayedWith = false;
        this.favCatFood = favCatFood;
    }

    public boolean isHasPlayedWith() {
        return hasPlayedWith;
    }
    public String getFavCatFood(){
        return favCatFood;
    }
    public void play(){
        System.out.println("I am playing! This is fun!");
        hasPlayedWith = true;
    }
    public void meow(){
        System.out.println("Meowww");
    }
}
