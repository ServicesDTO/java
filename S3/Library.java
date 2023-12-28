package Java_OOP.S3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Library implements Iterable<Book> {

    public Library(List<Book> books) {
        this.books = books;
    }

    public Library(Book bk) {
        addBook(bk);
    }

    private List<Book> books = new ArrayList<Book>();
    
    @Override
    public Iterator<Book> iterator() {

        Iterator<Book> it = new Iterator<Book>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < books.size();
            }

            @Override
            public Book next() {
                return books.get(index++);
            }

        };
        return it;

    }


    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book bk) {
        this.books.add(bk);
    }

    public void sortPublishedAge(){
        Collections.sort(books);

    }
    
    public void sortAuthor(List<Book> bk){
        bk.sort(new AuthorComparator());

    }

    
}


/*Класс Library:

Создайте класс Library, который реализует Iterable<Book>.
В классе Library должен быть список books, в котором хранятся объекты Book.
Реализуйте методы для добавления книг (addBook), получения списка всех книг (getBooks) и сортировки книг по разным критериям.
Реализуйте метод iterator() для обхода всех книг в библиотеке. */