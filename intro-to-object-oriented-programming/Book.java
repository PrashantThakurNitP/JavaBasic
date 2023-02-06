public class Book {
    private String bookName;
    private int noOfCopies;

    void setNoOfCopies(int noOfCopies) {
        if (noOfCopies > 0)// benefit of encapsulation -> prevent bad code from other classes fro putting
                           // bad data in our object
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
