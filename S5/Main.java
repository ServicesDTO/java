package S5;
/*"Создайте приложение, реализующее архитектуру MVC (Model-View-Controller)
 для управления данными о преподавателях в системе. Необходимо выполнить следующие шаги:

Создайте класс TeacherService (Модель), который будет отвечать за управление данными о преподавателях.
 Реализуйте функции для добавления, редактирования и отображения информации о преподавателях.

Создайте класс TeacherView (Представление), который будет отвечать за отображение данных о преподавателях на экране.


Создайте класс TeacherController (Контроллер), который связывает модель и представление. 
Реализуйте возможность создания, редактирования конкретного преподавателя и отображения списка всех преподавателей.


Создайте GitHub проект, загрузите туда ваш код и предоставьте ссылку на него в качестве результата выполнения задачи." */
public class Main {

    public static void main(String[] args) {
        
       TeacherServiceModel model = new TeacherServiceModel();
                TeacherServiceView view = new TeacherServiceView();
        TeacherServiceController presenter = new TeacherServiceController(model, view);

        presenter.run();
    
    }
    
}
