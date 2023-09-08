public class Animal {
    protected String Name;
    protected Integer Age;
    protected String Sound; 

    public Animal () {
        super();
    }

    public Animal(String Name, Integer Age, String Sound) {

        this.Name = Name;
        this.Age = Age; 
        this.Sound = Sound; 
    }

    public void eat() {
        System.out.println("Eat");
    }

    public String makeSound() {
        return this.Sound;
    }
}
