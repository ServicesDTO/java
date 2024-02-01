package S6;

public class Orange extends Fruit implements StoredPeriod{

    public Orange(String colour,boolean chemicalHadled, Integer storeDay ){
        
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
        return "Orange";
    }

    @Override
    public Integer getStorePeriod() {
        if(chemicalHadled){
            return storeDay*3;
        }
        else return storeDay;
    }

    @Override
    public void handleByChemicals(boolean handle) {
        this.chemicalHadled = handle;
        
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
