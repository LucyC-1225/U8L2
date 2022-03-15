public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean adopted;

    public Animal(String name, int age, boolean vaccinated, boolean adopted) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.adopted = adopted;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public boolean isAdopted(){
        return adopted;
    }

    public void adopt(){
        System.out.println("I am adopted!");
        adopted = true;
    }

    public void feed(){
        System.out.println("I am fed!");
    }

    public void vaccinate(){
        if (!vaccinated){
            System.out.println("I am vaccinated now!");
            vaccinated = true;
        } else {
            System.out.println("I am already vaccinated!");
        }

    }
}
