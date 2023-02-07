public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("Civil Line", "Delhi", "10005");
        Customer customer = new Customer("Prashant", homeAddress);
        Address workAddress = new Address("Dlf", "Gurgaon", "10006");
        customer.setWorkAddress(workAddress);
        System.out.println(customer.toString());
    }

}
