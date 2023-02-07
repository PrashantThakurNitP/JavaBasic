
public class MotorBike {
    /*
     * state -> value of member variable at that point of time. it an changes
     * 
     * 
     * through method we expose which are called behaviour of class
     */
    private String bikeName; // default value of string comes as nul if not defined

    private int speed; // member variable default vale of int is 0
    private String bikeBrand;
    private int mileage;

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
    /*
     * ENAPSUATION => HIDING DATA THAT BELONG TO OBJECT
     * ABSTRATION => HIDING COMPLEX DETAILS
     */

    /*
     * constructor is a special type of method for which return type is not needed
     * and its name is same as namee of class
     * 
     */
    MotorBike() {
        // if any constructor not provided java compiler provide constructor
        // no argument constructor to create object
        // this.mileage = 20;
        // this.bikeBrand = "Royal Enfield";
        // or
        this("Royal Enfield", 20);
    }

    MotorBike(String bikeBrand, int mileage) {
        this.bikeBrand = bikeBrand;
        this.mileage = mileage;
    }

    // behaviour
    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;

    }

    public String getBikeName() {
        return this.bikeName;
    }

    private void setSpeed(int speed) {
        // speed is local variable which comes as arg
        if (speed > 0)
            this.speed = speed; // vaidation at one place
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getMileage() {
        return this.mileage;
    }

    public String getBikeBrand() {
        return this.bikeBrand;
    }

    public void increaseSpeed(int howMuch) { // increase speed encapsuation

        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) { // increase speed encapsuation

        setSpeed(this.speed - howMuch);
    }

    public void start() {
        System.out.println("Bike started with speed 10");
        this.speed = 10;
    }

    public String toString() {
        return String.format("%s->%s, %s->%s, %s->%s, %s->%s", "Model", getBikeName(), "Brand", getBikeBrand(),
                "Mileage", getMileage(), "Current Speed", getSpeed());
    }
}