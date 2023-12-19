package Java_OOP;
public class Shape {
/*    
    Создайте иерархию классов для представления различных геометрических фигур. 
    Каждая фигура должна иметь метод для вычисления площади (calculateArea) и
     метод для вычисления периметра (calculatePerimeter). 
 */

public Shape(String shapeName) {
    this.shapeName = shapeName;
}

public Shape() {
    
}
protected String shapeName;

public void setShapeName(String shapeName) {
    this.shapeName = shapeName;
}

public String getShapeName() {
    return shapeName;
}

public void calculateArea()
{
    System.out.println("Площадь фигуры: ");
}
public void  calculatePerimeter()
{
    System.out.println("Периметр фигуры: ");
}



@Override
public String toString() {
    return "Название фигуры: " + shapeName ;
}

}
