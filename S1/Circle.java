package Java_OOP;


/*Круг (Circle):

Свойства: радиус (radius).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно.

 */

public class Circle extends Shape{
   
public Circle(String name){
    super.shapeName = name;
}
public Circle(String shapeName, double radius) {
    super(shapeName);
    this.radius = radius;
}



private double radius ;
private static double PI = 3.14;


public void setRadius(double radius) {
    this.radius = radius;
}
public double getRadius() {
    return radius;
}
@Override
public void calculateArea()
{
    System.out.println("Площадь фигуры "+ super.shapeName + " : " + PI * Math.pow(radius,2));
}
@Override
public void  calculatePerimeter()
{
    System.out.println("Периметр фигуры "+ super.shapeName + ": " + 2* PI * radius);
}




}
