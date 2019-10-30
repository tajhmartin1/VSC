package VSC;
public class Zoo{
    public static void main(String[] args) {
        Animal animal = new Animal("cat");
        System.out.println(animal);
        animal.sleep();
        animal.eat();
        Cat cat = new Cat("jimmy");
        cat.speak();
        System.out.println(cat);

    }
  
}