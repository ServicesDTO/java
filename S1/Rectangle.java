package Java_OOP;

public class Rectangle extends Shape{
    /*Прямоугольник (Rectangle):
     * Свойства: длина (length) и ширина (width).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно.
     */
       
public Rectangle(String name){
    super.shapeName = name;
}
public Rectangle(String shapeName, double length,double width ) {
    super(shapeName);
    this.length = length;
    this.width = width;
}

private double length ;
private double width ;


public void setLength(double length) {
    this.length = length;
}
public void setWidth(double width) {
    this.width = width;
}


public double getLength() {
    return length;
}
public double getWidth() {
    return width;
}


@Override
public void calculateArea()
{
    System.out.println("Площадь фигуры "+ super.shapeName + ":  " + this.length * this.width);
}
@Override
public void  calculatePerimeter()
{
    System.out.println("Периметр фигуры "+ super.shapeName + ": " + 2* this.length +  2 * this.width);
}



}
