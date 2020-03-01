package pl.sda.ksiegarnia;

public class Book {

    private String name;
    private Author author;
    private Category category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Book(String name, Author author, Category category) {
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public Book(String name) {
        this.name = name;
    }
}
