import java.util.ArrayList;

public class Course {
    // Attributes
    private String name; 
    private String meetingTime; 
    private String prefixNum;
    private ArrayList<Student> roster; 

    public Course(String name, String meetingTime, String prefixNum) {
        this.name = name;
        this.meetingTime = meetingTime;
        this.prefixNum = prefixNum;
        this.roster = new ArrayList<>(); 
    }

    public String toString() {
        return this.prefixNum + " " + this.name + " meets at " + this.meetingTime; 
    }

    public static void main(String[] args) {
        Course csc120 = new Course("OOP", "TR 9:25", "CSC120");
        System.out.println(csc120);
        Student ab = new Student("Ab", "9909abc", 2014);
        Student jordan = new Student("Jordan", "9909def", 2006);
        csc120.roster.add(ab); 
        csc120.roster.add(jordan); 
        System.out.println(csc120.roster);
    }

}