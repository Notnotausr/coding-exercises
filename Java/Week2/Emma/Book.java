public class Book {
    String title;
    String author;
    int pages;

    //constructor
    public Book(String bookTitle, String bookAuthor, int numPages) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.pages = numPages;
    }
    // describe method
    public void describe() {
        System.out.println(title + " by " + author + " has " + pages + " pages.");
    }

    public static void main(String[] args) {
        // Create two Book objects without constructor
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);

        book1.describe();
        book2.describe();

        // Modify page count (new edition)
        book2.pages = 336;
        System.out.println("Updated page count for " + book2.title + ": " + book2.pages);

        // Third book using the constructor
        Book book3 = new Book("1984", "George Orwell", 328);
        book3.describe();
    }
}
