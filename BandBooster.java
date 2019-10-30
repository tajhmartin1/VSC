package VSC;
public class BandBooster{
    private String name;
    private int boxesSold;
    public BandBooster(String name){
        this.name = name;
        boxesSold= 0;

    }
    public void updateSales(int amount){
        boxesSold += amount;


    }
    public String getName(){
        return name;
    }
    public int getBoxesSold(){
        return boxesSold;
    }
    public String toString(){
        return name + ": " + boxesSold;
    }

}