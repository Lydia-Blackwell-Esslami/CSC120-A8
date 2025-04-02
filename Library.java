
import java.util.Hashtable;



/* This is a stub for the Library class */
public class Library extends Building implements LibraryRequirements{

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a library: 📖"); 
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
  }

}