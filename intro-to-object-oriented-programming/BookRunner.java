public class BookRunner {
    public static void main(String[] args) {
        Book cleanCode = new Book();
        cleanCode.setBookName("Clean Code");
        cleanCode.setNoOfCopies(20);
        cleanCode.read();
        System.out.println("Book Name" + cleanCode.getBookName());
        System.out.println("No of copies " + cleanCode.getNoOfCopies());
        cleanCode.read();

    }

}
