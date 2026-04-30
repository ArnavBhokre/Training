class student{
   private int rollNo;
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String section;

    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    private void study(){
        System.out.println("Dont Disturb me ");
     }
     public void callstudy(){
        this.study();
     }
    private void sleep(){
        System.out.println("Sleeping ..");
    }
    public void callsleep(){
        this.sleep();
     }
}
public class Encaps1 {
    public static void main(String ar[]){
       student s = new student();
      s.setRollNo(22);
      System.out.println("Roll No = "+s.getRollNo());
      s.setAge(22);
      System.out.println("Agr = "+s.getAge());
       s.setName("Arnav");
      System.out.println("Name = "+s.getName());
      s.setSection("H.");
      System.out.println("Section = "+ s.getSection());
      s.callstudy();
      s.callsleep();

    }
    
}