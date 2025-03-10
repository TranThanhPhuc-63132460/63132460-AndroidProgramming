package ntu.dtthiep.vidutaodatabase;

public class Book {
    int  BookId;
    String BookName;
    int Page;
    float Price;
    String Description;

    public Book(int bookId, String bookName, int page, float price, String description) {
        BookId = bookId;
        BookName = bookName;
        Page = page;
        Price = price;
        Description = description;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
