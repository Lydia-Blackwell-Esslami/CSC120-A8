import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building implements HouseRequirements {


  private ArrayList<Student> residents;
  private boolean hasDiningRoom;

  /**
   * Constructor for the house
   * @param name The name of the house
   * @param address The address of the house
   * @param nFloors How many floors are in the house
   * @param hasDiningRoom Wether or not the house has a dining room
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    System.out.println("You have built a house: 🏠");
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<Student>();
  }

  /**
   * Accessor for dining room status
   * @return wether the house has a dining room or not
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

   /**
   * Accessor for house population
   * @return How many people currently live in the house
   */
  public int nResidents(){
    return this.residents.size();
  }

  /**
   * Moves a student into the house
   * @param s The student who will move in
   */
  public void moveIn(Student s){
    this.residents.add(s);
  }

  public Student moveOut(Student s){
    this.residents.remove(s);
    return s;
  }

  public boolean isResident(Student s){
    return this.residents.contains(s);
  }


  public static void main(String[] args) {
    Student bob = new Student("Bob", "990", 2029);
    House myHouse = new House("Myhouse", "16th St.", 2, false);
    myHouse.residents.add(bob);
    System.out.println(myHouse);
  }

}