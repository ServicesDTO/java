package Java_OOP.S5;

public class TeacherServiceController {
    private TeacherServiceModel isModel;
    private TeacherServiceView isView;

    public TeacherServiceController(TeacherServiceModel isModel, TeacherServiceView isView) {
        this.isModel = isModel;
        this.isView = isView;
    }

    public void run() {
        while (work) {
        boolean work = true;
        Integer action = -1;
        isView.printMenu();
        action = isView.getNumInput("Введите номер действия: ");

        switch (isView) {
            case 1:
                isView.displayList(isModel.getList());
                break;
                case 2:
                isView.displayList(isModel.getList());
                //4.Удалить запись.
                isModel.remove(isView.getNumInput("Введите номер записи: "));
                break;
                case 3:
                isView.displayList(isModel.getList());
                //4.Редактировать запись.
                break;
                case 4:
                //4.Добавить запись.
                isView.getInput("Введите имя");
                isModel.addTecher(new Teacher(isView.getInput("Введите фамилию"),
                    isView.getInput("Введите имя"),
                    isView.getInput("Введите отчество"),
                    isView.getInput("Введите название предмета")));
                break;
                case 0:
                isView.displayList(isModel.getList());
                work = false;
                System.out.println("Выход!");
                break;
        
            default:
                isView.printMenu();
                break;
        }
    }
       /*  int exitflag = 0;
        
            isView.displayList(isModel.getList());
        //isView.userInput("ВВедите номер операции");
        if(Integer.parseInt(isView.userInput("ВВедите номер операции")) == 1){
            work = false;
        } */

        }
    
}


