package S5;

public class TeacherServiceController {
    private TeacherServiceModel isModel;
    private TeacherServiceView isView;

    public TeacherServiceController(TeacherServiceModel isModel, TeacherServiceView isView) {
        this.isModel = isModel;
        this.isView = isView;
    }

    public void run() {
        
        boolean work = true;
        while (work) {
        Integer action = -1;
        isView.printMenu();
        action = isView.getNumInput("Введите номер действия: \n");

        switch (action) {
            case 1:
                isView.displayList(isModel.getList());
                break;
                case 2:
                //2.Редактировать запись.
                isModel.editTeacher(isView.getNumInput("Введите номер записи: ")-1,(new Teacher(isView.getStringInput("Введите фамилию"),
                isView.getStringInput("Введите имя"),
                isView.getStringInput("Введите отчество"),
                isView.getStringInput("Введите название предмета"))));
                break;
                case 3:
                if(isModel.getList().size() > 0 )
                {isModel.remove(isView.getNumInput("Введите номер записи: ")-1);}
                else 
                {System.out.println("Список пуст.\n");}
                      //3.Удалить запись.
                break;
                case 4:
                //4.Добавить запись.
                isModel.addTecher(new Teacher(isView.getStringInput("Введите фамилию"),
                    isView.getStringInput("Введите имя"),
                    isView.getStringInput("Введите отчество"),
                    isView.getStringInput("Введите название предмета")));
                break;
                case 0:
                work = false;
                System.out.println("Выход!");
                break;
        
            default:
                isView.printMenu();
                break;
        }
    }
}   
}


