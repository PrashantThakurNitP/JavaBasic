
public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike ducaiti = new MotorBike("Ducaiti", 30);
        MotorBike honda = new MotorBike("Honda", 20);
        MotorBike hunter = new MotorBike();

        ducaiti.setBikeName("Ducaiti R1");
        honda.setBikeName("Hero Honda ");
        hunter.setBikeName("Hunter 350");
        // honda.setSpeed(80); //made private
        // ducaiti.setSpeed(100);
        ducaiti.start();
        honda.start();
        hunter.start();
        System.out.println(ducaiti.toString());
        System.out.println(honda.toString());
        System.out.println(hunter.toString());

        ducaiti.increaseSpeed(100);
        honda.increaseSpeed(100);
        System.out.println(ducaiti.toString());
        System.out.println(honda.toString());

        ducaiti.decreaseSpeed(100);
        honda.decreaseSpeed(100);
        System.out.println(ducaiti.toString());
        System.out.println(honda.toString());

    }

}