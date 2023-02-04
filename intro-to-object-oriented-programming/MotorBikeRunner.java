

public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike duaiti = new MotorBike();
        MotorBike honda = new MotorBike();
        honda.setSpeed(80);
        duaiti.setSpeed(100);
        duaiti.start();
        honda.start();
        
    }

}