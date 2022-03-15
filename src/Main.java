public class Main {
    public static void main(String[] args) {
        System.out.println("----------------Animal class----------------");
        Animal animal = new Animal("Some animal", 4, true, false);
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        System.out.println("Is vaccinated: " + animal.isVaccinated());
        System.out.println("Is adopted: " + animal.isAdopted());
        animal.adopt();
        animal.feed();
        animal.vaccinate();

        System.out.println("------------------Cat class------------------");
        Cat cat = new Cat("Cat", 5, true, true, "Chicken");
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Vaccinated: " + cat.isVaccinated());
        System.out.println("Adopted: " + cat.isAdopted());
        System.out.println("Has been played with: " + cat.isHasPlayedWith());
        System.out.println("Fav Cat food: " + cat.getFavCatFood());
        cat.adopt();
        cat.feed();
        cat.vaccinate();
        cat.play();
        cat.meow();

        System.out.println("------------------Dog class------------------");
        Dog dog = new Dog("Dog", 7, false, true, "Fish");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Vaccinated: " + dog.isVaccinated());
        System.out.println("Adopted: " + dog.isAdopted());
        System.out.println("Has been walked: " + dog.isHasBeenWalked());
        System.out.println("Fav Dog food: " + dog.getFavDogFood());
        dog.adopt();
        dog.feed();
        dog.vaccinate();
        dog.walk();
        dog.bark();
    }
}
