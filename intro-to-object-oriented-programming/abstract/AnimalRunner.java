
class Cat extends AbstractAnimal {
    public void bark() {
        System.out.println("Meow");

    }

}

public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();

        // poymorphism throgh inheritance
        // through same reference variabe and same code , depending on type of object it
        // point we have
        // different behaviour

        AbstractAnimal[] animals = { new Dog(), new Cat() };
        for (AbstractAnimal animal : animals) {
            animal.bark();
        }
    }

}
