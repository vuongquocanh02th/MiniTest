public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String language, String framework, double price) {
        super(price);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public double getPrice() {
        return super.getPrice() * 95 / 100;
    }
}
