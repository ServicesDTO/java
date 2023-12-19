package Java_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        

         int shapeCount = 10;
        Random rand = new Random();
        int circleCount = 0;
        int rectangleCount = 0;
        int squareCount = 0;
        int rndCount = 0;
 

        List<Shape> shapes = new ArrayList<>();
        
        for (int i = 0; i < shapeCount; i++) {
            rndCount = rand.nextInt(3);
            if ( rndCount== 0) {
                shapes.add(new Circle("circle_"+i,rand.nextInt(10,20)));
                circleCount++;
            }
            else if (rndCount == 1){
                shapes.add(new Square("square_"+i,rand.nextInt(10,20)));
                squareCount++;
            }
            else
            {
                shapes.add(new Rectangle("rectangle_"+i,rand.nextInt(10,20),rand.nextInt(5,10)));
                rectangleCount++;
            }

           // System.out.println(shapes.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("squareCount: %d circleCount: %d rectangleCount: %d \n\n", squareCount, circleCount, rectangleCount);
    
        for (Shape shape:shapes){


           System.out.println(shape.toString());
            shape.calculateArea();
            shape.calculatePerimeter();
        }
    
    }
}
