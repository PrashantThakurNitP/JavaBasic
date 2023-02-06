
public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike ducaiti = new MotorBike();
        MotorBike honda = new MotorBike();
        ducaiti.setBikeName("Ducaiti");
        honda.setBikeName("Honda");
        honda.setSpeed(80);
        ducaiti.setSpeed(100);
        ducaiti.start();
        System.out.println("Speed of " + ducaiti.getBikeName() + " is " + ducaiti.getSpeed());

        System.out.println("Speed of " + honda.getBikeName() + " is " + honda.getSpeed());

        ducaiti.increaseSpeed(100);
        honda.increaseSpeed(100);
        System.out.println("Speed of " + ducaiti.getBikeName() + " is " + ducaiti.getSpeed());

        System.out.println("Speed of " + honda.getBikeName() + " is " + honda.getSpeed());

        ducaiti.decreaseSpeed(100);
        honda.decreaseSpeed(100);
        System.out.println("Speed of " + ducaiti.getBikeName() + " is " + ducaiti.getSpeed());

        System.out.println("Speed of " + honda.getBikeName() + " is " + honda.getSpeed());

    }

}