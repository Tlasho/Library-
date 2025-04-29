import java.util.*;

public class Library { //library class where we can add,remove,check out and return books
      private Map<String,Book> library = new HashMap<>();
      private Map<String, Integer> mostCheckedOut = new HashMap<>();

      //adds book to library uniquely
      public void addBook(Book book){
          if (!library.containsKey(book.getIsbn()))
            library.put(book.getIsbn(),book);
          else
              System.out.println("The book with " + book.getIsbn() + " ISBN already exists");
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
      public List<Book> allAvailableBooks(){
          List<Book> allAvailables = new ArrayList<>();
          for (Book book : library.values()){
              if (!book.isCheckedOut()){
                  allAvailables.add(book);
              }
          }
          return allAvailables;
      }
      //lets you know which book is most checked out
      public int checkOutCount(String isbn){
        return mostCheckedOut.getOrDefault(isbn,0);
      }
      public int size(){
          return library.size();
      }
      //sorts a library by using book comperator class
      public Set<Book> getSortedLibrary(){
          Set<Book> sortedLibrary = new TreeSet<>(new BookComperator());
          sortedLibrary.addAll(library.values());
          return sortedLibrary;
      }
    //search by Author(case-nosensitively)
    public List<Book> searchAuthor(String author){
        List<Book> result = new ArrayList<>();
        for (Book book : library.values()){
            if (book.getAuthor().equalsIgnoreCase(author)){
                result.add(book);
            }
        }
        return result;
    }
    public String report(){
          StringBuilder st = new StringBuilder();
          st.append("Here is the report: ");
          for (Book book : library.values()){
              st.append(book.toString() + "checked out " + checkOutCount(book.getIsbn()) + " times,");
          }
          return st.toString();
    }




}
