
package Java_OOP;

public class Square extends Shape {
    /*Квадрат (Square), который является подклассом прямоугольника:

Свойства: сторона (side).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно. 
И переопределите методы родительского класса, чтобы они соответствовали квадрату.
 */
       
 public Square(String name){
    super.shapeName = name;
}
public Square(String shapeName, double side ) {
    super(shapeName);
    this.side = side;
    
}

private double side ;


public void setLength(double side) {
    this.side = side;
}
public void setWidth(double side) {
    this.side = side;
}


@Override
public void calculateArea()
{
    System.out.println("Площадь фигуры "+ super.shapeName + ": " + Math.pow(this.side,2));
}
@Override
public void  calculatePerimeter()
{
    System.out.println("Периметр фигуры "+ super.shapeName + ": " + 4 * this.side );
}

}
