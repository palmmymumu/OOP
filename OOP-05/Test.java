import java.util.*;
public class Test {
 public static void main(String[] args) {
   
  ArrayList<Person> pLists = new ArrayList<Person>();
  
  pLists.add(new Person("Palm", 20));
  pLists.add(new Teacher("Palm", 20, "Engineering"));
  pLists.add(new Student("Palm", 20, "CoE", 3.98));
  pLists.add(new Employee("Palmz", 20, 1));
  pLists.add(new PermanentEmployee("Palm", 20, 1, 99999));
  pLists.add(new ContractEmployee("Palm", 20, 1, 5000));
  
  for (int i = 0; i < pLists.size(); i++) {
    pLists.get(i).printDetails();
    System.out.println("====================");
  }
 }
}