import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Library { //library class where we can add,remove,check out and return books
      private Map<String,Book> library = new HashMap<>();
      private Map<String, Integer> mostCheckedOut = new HashMap<>();

      //adds book to library
      public void addBook(Book book){
          library.put(book.getIsbn(),book);
      }
      //removes book in library
      public void removeBook(String isbn){
          library.remove(isbn);
      }
      //lets you check out book using isbn, first making sure it is available
      public Book checkOut(String isbn){
          Book book = library.get(isbn);
           if (book != null && !book.isCheckedOut()){
               book.setCheckedOut(true);
               return library.get(isbn);
           }
           return null;
      }
      //lets you return the book you have checked out previously by isbn,firt making sure it is checked out
      public void returnBook(String isbn){
          Book book = library.get(isbn);
          if (book != null && book.isCheckedOut()){
              library.get(isbn).setCheckedOut(false);
              mostCheckedOut.put(isbn,mostCheckedOut.getOrDefault(isbn,0) + 1);
          }
      }
      //lets you know which book is most checked out
      public int checkOutCount(String isbn){
        return mostCheckedOut.getOrDefault(isbn,0);
      }
      public int size(){
          return library.size();
      }
      //sorts an library by using book comperator class
      public Set<Book> getSortedLibrary(){
          Set<Book> sortedLibrary = new TreeSet<>(new BookComperator());
          sortedLibrary.addAll(library.values());
          return sortedLibrary;
      }


}
