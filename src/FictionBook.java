public class FictionBook extends Book {
    private String Category;

    public FictionBook() {
    }

    public FictionBook(String category, double price) {
        super(price);
        this.Category = category;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public double getPrice() {
        return super.getPrice() * 93 / 100;
    }
}
