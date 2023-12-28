package Java_OOP.S3;

public class Book implements Comparable<Book> {



    public Book(String title, String author, Integer publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }
   
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public Integer getPublishedYear() {
        return publishedYear;
    }
    private String title;
    private String author;
    private Integer publishedYear;
    
    @Override
    public int compareTo(Book book) {
    if(this.publishedYear > book.getPublishedYear()){
        return 1;
    }
    else if (this.publishedYear < book.getPublishedYear()){
        return -1;
    }
    else {
        return 0;}

        
    
    

}

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", publishedYear=" + publishedYear + "]";
    }
}
/*Класс Book:

Создайте класс Book с полями: title (название), author (автор) и publishedYear (год издания).
Реализуйте конструктор, геттеры для каждого поля и метод toString().
Реализуйте интерфейс Comparable<Book> для сравнения книг по названию.
Компараторы:

Создайте два компаратора для класса Book: один для сортировки по автору, другой - по году издания.
 */