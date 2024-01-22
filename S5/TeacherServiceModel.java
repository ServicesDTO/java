package S5;
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
       
        th = new Teacher();
    }

    public ArrayList<Teacher> getList() {
        return list;
    }

    

    public void addTecher(Teacher teacher) {

        list.add(teacher);

    }

    public void editTeacher(int id,Teacher teacher){
        list.set(id,teacher);
    }

    public void remove(int id) {

        list.remove(id-1);

    }

}
