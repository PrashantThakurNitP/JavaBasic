public class Book {
    private int noOfCopies;

    void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    void read() {
        System.out.println("No of copies " + noOfCopies);
    }

}
