package chapter3.ex4.test3_reuse;

public class Course {//개념화된 데이터 정의(개체)
   int id;
   String name;
   int capacity;
   int groupCount;
   String[] members;
   
   public Course() {
      this(0,null,null,0);
   }
   public Course(int id, String name, String[] members, int capacity) {
      this.id = id;
      this.name = name;
      this.members = members;
      this.capacity = capacity;
   }
   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getCapacity() {
      return getMembers().length;
   }
   public void setCapacity(int capacity) {
      this.capacity = capacity;
   }
   public String[] getMembers() {
      return members;
   }
   public void setMembers(String[] members) {
      this.members = members;
   }
   
   
}