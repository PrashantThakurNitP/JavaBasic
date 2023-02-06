
public class MotorBike {
    // state
    private String bikeName; // default value of string comes as nul if not defined
    private int speed; // member variable
    private String bikeBrand;

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
    void setBikeName(String bikeName) {
        this.bikeName = bikeName;

    }

    String getBikeName() {
        return this.bikeName;
    }

    void setSpeed(int speed) {
        // speed is local variable which comes as arg
        this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }

    String getBikeBrand() {
        return this.bikeBrand;
    }

    void start() {
        System.out.println("Bike started ");
    }
}