public class Customer {

    /*
     * in object oriented programming we first decide classes and then we decide
     * composition
     */
    // state
    private String name;
    private Address homeAddress; // object compostion object inside object
    private Address workAddress;

    // creating

    public Customer(String name, Address homAddress) {
        this.name = name;
        this.homeAddress = homAddress;
    }

    // operation

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString() {
        return String.format("name -> %s, homeAddress -> [%s], workAddress -> [%s]", name, homeAddress,
                workAddress);
    }

}
