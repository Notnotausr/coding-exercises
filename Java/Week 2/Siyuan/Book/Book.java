public class Book {
    String title;
    String author;
    int pages;

    public Book(String bookTitle, String bookAuthor, int numPages) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.pages = numPages;
    }
    public void read() {
        System.out.println("You are reading: " + title + " by " + author);
    }
    public void bookmarkPage(int page) {
        if (page > 0 && page <= pages) {
            System.out.println("You have bookmarked page " + page + " of " + title);
        } else {
            System.out.println("Invalid page number. This book has " + pages + " pages.");
        }
    }
    public static void main(String[] args) {
        Book myBook = new Book("harry potter", "jk rowling", 500);
        Book myBook2 = new Book("lord of the rings", "tolkien", 400);
        myBook.read();
        myBook.bookmarkPage(45);
    }
}