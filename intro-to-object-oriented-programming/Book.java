public class Book {
    private String bookName;
    private int noOfCopies;

    void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    int getNoOfCopies() {
        return this.noOfCopies;
    }

    void setBookName(String bookName) {
        this.bookName = bookName;
    }

    String getBookName() {
        return this.bookName;
    }

    void read() {
        System.out.println("Read Book start");
    }

}
