public class Review {
    private int id;
    private String description;
    private int rating;

    public Review(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public String toString() {
        return String.format("Id = %d, Description = %s Rating = %d", id, description, rating);
    }

}
