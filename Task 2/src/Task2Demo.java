public class Task2Demo {
    public static void main(String[] args) {
        //Create instances for all the animals
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal duck = new Duck();

        //Output on the screen what each animal says
        System.out.println("Cat says\n" + cat.say());
        System.out.println("\nDog says\n" + dog.say());
        System.out.println("\nDuck says\n" + duck.say());
    }
}
