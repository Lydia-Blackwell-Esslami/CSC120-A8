/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }

    public Cafe(){
        super();
        this.nCoffeeOunces = 0;
        this.nSugarPackets = 0;
        this.nCreams = 0;
        this.nCups = 0;
    }
    
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces - size <0 || this.nSugarPackets - nSugarPackets <0 || this.nCreams - nCreams <0||this.nCups - 1 <0){
            this.restock(50, 50, 50, 50);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }
    /**
     * Restocks the cafe
     * @param nCoffeeOunces Number of coffee servings to be restocked
     * @param nSugarPacketsNumber of sugar packets to be restocked
     * @param nCreams Number of cream servings to be restocked
     * @param nCups Number of cups to be restocked
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups; 
    }

    private void restock(){
        this.nCoffeeOunces += 20;
        this.nSugarPackets += 20;
        this.nCreams += 20;
        this.nCups += 20; 
    }

    public String toString(){
        return (this.name + " is a " + this.nFloors + "-story cafe located at " + this.address + 
        ". The current state of the inventory is: " + this.nCoffeeOunces + "oz of coffee, " + this.nSugarPackets + 
        " packets of sugar, " + this.nCreams + "tsps of cream, " + this.nCups + " cups. ");
    }

    public void showOptions(){
        super.showOptions();
        System.out.println(" + sellCoffee() \n + restock()");
    }

    public void goToFloor(int floorNum){
        throw new RuntimeException("This floor is not available to customers");
    }

    public void goUp(){
        throw new RuntimeException("The roof is not acessible to customers");
    }

    public void goDown(){
        throw new RuntimeException("The basement is not acessible to customers");
    }

    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Bean", "13 St.", 1, 50, 30, 70, 12);
        System.out.println(myCafe);
        myCafe.sellCoffee(30, 10, 7);
        System.out.println(myCafe);
        myCafe.sellCoffee(30, 10, 7);
        System.out.println(myCafe);
        myCafe.showOptions();
    }
    
}




