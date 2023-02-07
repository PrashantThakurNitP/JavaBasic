public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1", 0.34567, "Red");
        fan.switchOn();
        System.out.println(fan.toString());
    }

}
