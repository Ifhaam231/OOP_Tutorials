public class Book implements Comparable<Book>{
    private String title;
    private double price;
    private int year;
    private String author;

    public Book(String title, double price, int year, String author) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "The requested book title is " + title + ", the price is $" + price + ", the year it was published is " + year + " and it was written by " + author;
    }

    //Ex5
    @Override
    public int compareTo(Book b) {
        // compare here the book based on the year
        if (this.year > b.year) {
            return 1;
        } else if (this.year < b.year) {
            return -1;
        } else {
            return 0;
        }
    }
}
