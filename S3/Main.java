package Java_OOP.S3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static <T> void main(String[] args) {
        List<Book> bk = new ArrayList<>();
        Library lb;

        bk.add(new Book("title1","buthor1",1990));
        bk.add(new Book("title2","cuthor2",1950));
        bk.add(new Book("title3","author3",1970));
        
        Collections.sort(bk);
        System.out.println(bk);
        bk.sort(new AuthorComparator());
         System.out.println(bk);

        lb  = new Library(bk);
        lb.addBook(new Book("title3","tathor4",1975));
        lb.addBook(new Book("title3","zathor4",1945));
        lb.sortPublishedAge();
        System.out.println(lb.getBooks());
        lb.sortAuthor(bk);
        System.out.println(lb.getBooks());
        System.out.println("-------------------------------------------");
        for (Book book : lb) {
            System.out.println(book);
            
        }
    }
}


/*Задание: "Библиотечная Система"
Цель:
Создать простую систему для управления книгами в библиотеке. Система должна позволять хранить книги, сортировать их по разным критериям, а также предоставлять функционал для перебора книг.

Шаги:
Класс Book:

Создайте класс Book с полями: title (название), author (автор) и publishedYear (год издания).
Реализуйте конструктор, геттеры для каждого поля и метод toString().
Реализуйте интерфейс Comparable<Book> для сравнения книг по названию.
Компараторы:

Создайте два компаратора для класса Book: один для сортировки по автору, другой - по году издания.

Тестирование функционала:

В методе main создайте экземпляр класса Library и добавьте в него несколько книг.
Продемонстрируйте сортировку книг по названию, автору и году издания.
Используйте цикл for-each для перебора и вывода всех книг из Library.
Дополнительные задачи (по желанию):
Добавьте функционал для удаления книг из библиотеки.
Реализуйте возможность фильтрации книг по определенным критериям (например, по автору или году издания).
Создайте пользовательский интерфейс (консольный или графический), чтобы упростить взаимодействие с вашей библиотечной системой.
Это задание поможет вам закрепить знания о создании и использовании классов, интерфейсов, компараторов и итераторов в Java, а также даст понимание, как эти элементы могут работать вместе в реальном приложении. */
