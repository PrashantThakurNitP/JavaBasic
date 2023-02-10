
interface Flyable {
    void fly();
}

class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird fly with wings");

    }

}

class Aeroplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Aeroplane fly with fuel");

    }

}

public class FlyableRunner {
    public static void main(String[] args) {

        // here we used inteface because they have nothing in commom
        Flyable[] flyingObject = { new Bird(), new Aeroplane() };
        // create array to type Flyable to store both bird and aeroplane

        for (Flyable object : flyingObject) {
            object.fly();
        }

    }

}
