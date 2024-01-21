package Java_OOP.S5;
/*Создайте класс TeacherService (Модель), который будет отвечать за управление данными о преподавателях.
 Реализуйте функции для добавления, редактирования и отображения информации о преподавателях.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherServiceModel {
    ArrayList<Teacher> list  = new ArrayList<>();
    Teacher th;

    public TeacherServiceModel() {
       
        th = new Teaacher();
    }

    public ArrayList<Teacher> getList() {
        return list;
    }

    

    public void addTecher(Teacher teacher) {

        list.add(teacher);

    }

    public void editTeacher(Teacher teacher,int id){
       // list.(id,teacher);
        
    }

    public void remove(Integer id) {

        list.remove(id);

    }

}
