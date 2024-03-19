package OOP.Book;

public class Books {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Books(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Books :\n" +
                "name= " + name + '\n' +
                "author=" + author.toString() +
                "\nprice=" + price +
                "\nqty=" + qty
                ;
    }
}
