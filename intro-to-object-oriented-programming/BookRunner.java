public class BookRunner {
    public static void main(String[] args) {
        Book cleanCode = new Book(123, "Clean Code", "Prashant");

        cleanCode.addReview(new Review(1, "Good Book", 4));
        cleanCode.addReview(new Review(2, "Helpful for beginners", 5));
        // cleanCode.setBookName("Clean Code");
        // cleanCode.setNoOfCopies(20);
        // cleanCode.read();
        // System.out.println("Book Name" + cleanCode.getBookName());
        // System.out.println("No of copies " + cleanCode.getNoOfCopies());

        cleanCode.read();
        System.out.println(cleanCode.toString());

    }

}
