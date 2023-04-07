package bit.basic.obj1;

public class Book {
    private String author = "김가영";
    private int price;
    private String publisher;
    private String regdate;
    private String bookName;
    {
        author="성소진";
    }

    public Book(){
        this("");

    }
    public Book(String author) {
//        this.author = author;
        this(author,0);
    }

    public Book(String author, int price) {
//        this.author = author;
//        this.price = price;
        this(author,price,"");
    }

    public Book(String author, int price, String publisher) {
//        this.author = author;
//        this.price = price;
//        this.publisher = publisher;
        this(author,price,publisher,"");
    }

    public Book(String author, int price, String publisher, String regdate) {
//        this.author = author;
//        this.price = price;
//        this.publisher = publisher;
//        this.regdate = regdate;
        this(author, price, publisher,regdate,"");
    }

    public Book(String author, int price, String publisher, String regdate, String bookName) {
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.regdate = regdate;
        this.bookName = bookName;
    }

    public Book(Book obj) {
        this.author = obj.author;
        this.price = obj.price;
        this.publisher = obj.publisher;
        this.regdate = obj.regdate;
        this.bookName = obj.bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                ", regdate='" + regdate + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book1 = new Book("가영",8000,"비트출판","2023/03/23","가영처럼자바");
        Book book2 = new Book(book1);
        System.out.println(book2);

    }
}
