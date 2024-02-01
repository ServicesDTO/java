package S6;

public class Banana extends Fruit {

    

    public Banana(String colour,boolean chemicalHadled, Integer storeDay ){
        
        this.colour = colour;
        this.chemicalHadled = chemicalHadled;
        this.storeDay = storeDay;
        this.NEEDTOBECLEAN = true;
    }

    @Override
    public String getColour() {
        // TODO Auto-generated method stub
        return "Colour is: "+ colour;
    }

    

    @Override
    public String toString() {
        return "Banana";
    }

    @Override
    public boolean ableToEat() {
        return true;
    }


    @Override
    public  boolean prohibitedToEat() {
        // TODO Auto-generated method stub
        return false;

        
    }
}
