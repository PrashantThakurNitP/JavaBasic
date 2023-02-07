import java.util.ArrayList;

public class Book {
    private int id;
    private String bookName;
    private String author;
    private ArrayList<Review> reviews = new ArrayList<>();
    private int noOfCopies;

    public Book(int id, String bookName, String author) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
    }

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

    public void addReview(Review review) {
        this.reviews.add(review); // REATIONSHIP BETWEEN BOOK AND AUTHOR IS ONE TO MANY
    }

    void read() {
        System.out.println("Read Book start");
    }

    public String toString() {
        return String.format("id = %d, BookName = %s, Autor= %s, Reviews = [%s]", id, bookName, author, reviews);
    }

}
