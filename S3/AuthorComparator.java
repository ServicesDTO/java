package Java_OOP.S3;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book arg0, Book arg1) {
        return arg0.getAuthor().compareTo(arg1.getAuthor());
    }
    
}
