import java.util.Comparator;
//class to compare two book names and after sort it by tittle
public class BookComperator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTittle().compareTo(o2.getTittle());
    }
}
