
import java.util.Hashtable;



/* This is a stub for the Library class */
public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a library: 📖"); 
    collection = new Hashtable<String, Boolean>();
  }

  public Library(){
    super();
    collection = new Hashtable<String, Boolean>();
  }

  public void addTitle(String title){
    this.collection.put(title, true);
  }

  public String removeTitle(String title){
    this.collection.remove(title);
    return title;
  }

  public void checkOut(String title){
    this.collection.replace(title, false);
  }

  public void returnBook(String title){
    this.collection.replace(title, true);
  }

  public boolean containsTitle(String title){
    return this.collection.containsKey(title);
  }

  public boolean isAvailable(String title){
    return this.collection.getOrDefault(title, false);
  }

  public void printCollection(){
    this.collection.forEach(
      (key, value) -> {
      System.out.println(key + ": " + value);
    }
    );
  }

  public void showOptions(){
    super.showOptions();
    System.out.println(" + addTitle(title) \n + removeTitle(title) \n + checkOut(title) \n + returnBook(title) \n + containsTitle(title) \n + isAvailable(title) \n + printCollection()");
  }

  public void goToFloor(){
    if (this.activeFloor != -1){
      this.activeFloor = 1;
    } else {
      throw new RuntimeException("You MUST enter the building first!");
    }
  }
  

  public static void main(String[] args) {
    Library myLib = new Library("Lib", "13 St", 4);
    System.out.println(myLib);
    myLib.addTitle("The Catcher in the Rye");
    myLib.addTitle("A");
    myLib.addTitle("B");
    myLib.printCollection();
    myLib.checkOut("A");
    myLib.removeTitle("B");
    myLib.printCollection();
    myLib.showOptions();
  }

}