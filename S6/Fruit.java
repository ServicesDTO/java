package S6;


abstract class Fruit implements Eatable{

   static boolean NEEDTOBECLEAN ;
    String colour;
    boolean chemicalHadled ; 
    Integer storeDay;

    //Принцип открытости и закрытости описываем поведение для наследуемых классов. 
    public String getColour() {
        return "Colour is:";
    }
       
    }

         
    
   
    


