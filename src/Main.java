public class Main {
    public static void main(String[] args) {
        //this class demonstrates adding,sorting checking out and returning books and
        //lets you know which book is most checked out
        Book book = new Book("Grosmaisteri","tlashadze","12");
        Book wigni = new Book("didostati","gamsaxurdia","22");
        Library library = new Library();
        library.addBook(book);
        library.addBook(wigni);
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

        System.out.println(library.checkOutCount("12"));

    }
}