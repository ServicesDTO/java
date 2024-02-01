package S6;

public class Apple extends Fruit implements StoredPeriod,Soft {



    public Apple(String colour,boolean chemicalHadled, Integer storeDay ){
        
        this.colour = colour;
        this.chemicalHadled = chemicalHadled;
        this.storeDay = storeDay;
        this.NEEDTOBECLEAN = false; 
    }

    
    @Override
    public String getColour() {
        // TODO Auto-generated method stub
        return "Colour is: "+ colour;
    }




    

    @Override
    public String toString() {
        return "Apple";
    }


    @Override
    public Integer getStorePeriod() {
        if(chemicalHadled){
            return storeDay*2;
        }
        else return storeDay;
    }


    @Override
    public void handleByChemicals(boolean handle) {
        this.chemicalHadled = handle;
        
    }


    @Override
    public String estimateSoftPeriod() {
        // TODO Auto-generated method stub
        return "Время сушки яблок 15 дней!";
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
