public class Fan {
    // state
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed; // 0 to 5

    // creation
    // while creation of fan make, radius, color is required
    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        // we donot do unnecessary string conatanation as it create unnecessay objects
        return String.format("make -> %s, color -> %s, radius -> %s, isOn -> %s, speed -> %s", this.make, this.color,
                this.radius, this.isOn, this.speed);
    }

    public void switchOn() { // abstraction
        this.isOn = true;
        setSpeed((byte) 5);
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    public void switchOffs() {
        this.isOn = false;
        setSpeed((byte) 0);
    }
}
