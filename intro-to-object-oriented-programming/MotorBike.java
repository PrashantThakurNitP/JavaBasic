
public class MotorBike {
    // state
    private int speed; // member variabe

    /*
     * encapsulation->
     * only MotorBike
     * 
     * class an acess/change state of
     * 
     * class other
     * class can
     * acess through
     * behavior of class
     * 
     * for encapsulating we make variabe private
     */

    // behaviour
    void setSpeed(int speed) {
        // speed is local variable which comes as arg
        this.speed = speed;
    }

    void start() {
        System.out.println("Bike started speed " + speed);
    }
}