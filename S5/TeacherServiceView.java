package Java_OOP.S5;

import java.util.List;
import java.util.Scanner;

public class TeacherServiceView {

    Scanner scanner;

    public TeacherServiceView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayList(List<Teacher> list) {
        System.out.println("Фамилия Имя Отчество Наименование предмета");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public Integer getNumInput(String text) {
        System.out.println(text);
        return Integer.parseInt(scanner.nextLine());
    }

    public String getStringInput(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }

    public void printMenu(){
        System.out.print(
        "Cписок доступных действий:" +
            "1.Вывести список" +
            "2 Редактировать запись." +
            "3.Удалить запись." +
            "4.Добавить запись." +
            "0. Выйти.");
    }

}
