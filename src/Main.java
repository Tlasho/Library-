import java.util.List;

public class Main {
    public static void main(String[] args) {
        //this class demonstrates adding,sorting checking out and returning books and
        //lets you know which book is most checked out
        Book book = new Book("Grosmaisteri","tlashadze","12");
        Book sth = new Book("mze mtvare da purisyana","tlashadze","52");
        Book wigni = new Book("didostati","gamsaxurdia","22");
        Library library = new Library();
        library.addBook(book);
        library.addBook(wigni);
        library.addBook(sth);
        library.getSortedLibrary();
        library.checkOut("12");
        library.returnBook("12");
        library.checkOut("12");
        library.returnBook("12");
        library.checkOut("12");
        library.returnBook("12");
        library.checkOut("12");
        library.returnBook("12");
        library.checkOut("12");
        library.returnBook("12");
        System.out.println(library.checkOutCount("12"));
        List<Book> result = library.searchAuthor("tlashadze");
        for (Book b : result){
            System.out.println(b.toString());
        }
        List<Book> availables = library.allAvailableBooks();
        for (Book b : availables){
            System.out.println(b.toString());
        }
        System.out.println(library.report());




    }
}