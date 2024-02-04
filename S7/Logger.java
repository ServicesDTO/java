package S7;

import java.util.ArrayList;

public class Logger {

   static ArrayList<String> logArray = new ArrayList<>();

    public static void addLog(double a,double b,double r,String operation){

        String fullOperation = a + " " + operation + " " +  b + " =  " + r;

        logArray.add(fullOperation);

    }

    public static void printLog(){
        System.out.println("История операций:");
        for (String row: logArray){
            System.out.println(row);
            
        }

    }

    
    
}
