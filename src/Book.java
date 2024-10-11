public class Book {
    String title;
    String author;
    int[] yearsPublished;
    float price;
    String genre;

    public Book()
    {
        title = "Unknown";
        author = "Unknown";
    }

    public Book(String myTitle)
    {
        this();
        title = myTitle;
    }

    public Book(String myTitle, String myAuthor)
    {
        this(myTitle);
        author = myAuthor;
    }

    public Book(String myTitle, String myAuthor, int[] myYearsPublished)
    {
        this(myTitle, myAuthor);
        for (int i : yearsPublished = myYearsPublished) {
            // Do I need to assign here?
        }
    }

    public static void main(String[] args)
    {
        Book book1 = new Book();
        System.out.println(book1.title + " " + book1.author);

        Book book2 = new Book("Tale of Genji");
        System.out.println(book2.title + " " + book2.author);

        Book book3 = new Book("The Divine Comedy", "Dante Alighieri");
        System.out.println(book3.title + " " + book3.author);
    }
}
