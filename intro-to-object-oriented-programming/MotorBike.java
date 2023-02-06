
public class MotorBike {
    // state
    private String bikeName; // default value of string comes as nul if not defined
    private int speed; // member variable default vale of int is 0
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
     * 
     * encapslation helps to expose method and and not data directy
     * it prevent bad operation on data
     */

    // behaviour
    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;

    }

    public String getBikeName() {
        return this.bikeName;
    }

    public void setSpeed(int speed) {
        // speed is local variable which comes as arg
        if (speed > 0)
            this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    String getBikeBrand() {
        return this.bikeBrand;
    }

    public void increaseSpeed(int howMuch) { // increase speed encapsuation
        if (howMuch > 0)
            this.speed += howMuch;
    }

    void start() {
        System.out.println("Bike started ");
    }
}