public class Book {
    private String authorName;
    private String bookName;
    private int pages;

    public Book(String author, String bName, int pages){
        this.authorName = author;
        this.bookName = bName;
        this.pages = pages;
    }

    public String getAuthor(){
        return this.authorName;
    }

    public String getName(){
        return this.bookName;
    }

    public int getPages(){
        return this.pages;
    }

    public String toString(){
        return this.authorName + ", " + this.bookName + ", " + this.pages + " pages";
    }
}
