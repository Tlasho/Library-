public class Book {
    // represents a book with title, author, ISBN, and checkout status.
    private String tittle;
    private String author;
    private String isbn;
    private boolean isCheckedOut;

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public void setCheckedOut(boolean is){
        isCheckedOut = is;
    }
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public Book(String tittle, String author, String isbn){
        this.tittle =tittle;
        this.author = author;
        this.isbn = isbn;
        isCheckedOut = false;
    }
    @Override
    public String  toString(){
        return "[" + author + "-" + tittle + "-" + isbn + "]";
    }
}
