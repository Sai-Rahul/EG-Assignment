import java.util.*;

class Employee{
	String firstname;
	String lastname;
	int age;
	Date dateOfJoin;
	public Employee(String firstname, String lastname, int age, Date dateofbirth) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.dateOfJoin = dateOfJoin;
	}
	
	@Override
	public String toString() {
		return firstname+" "+ lastname;
	}
}
public class Solution3 {

	public static void main(String[] args) {
		List<Employee>empLst= new ArrayList<>();
		empLst.add(new Employee("vishnu","vanka",16,new Date(1998,5,27)));
		empLst.add(new Employee("Rajesh","surab",29, new Date(1974,11,15)));
		empLst.add(new Employee("Rahul","Racha",15, new Date(1995,12,10)));
		empLst.add(new Employee("Amarjeet","Kaleswar",26, new Date(1982,7,01)));
		//using comparator interface class
		Comparator<Employee> finalComparator = (emp1,emp2)->{return emp1.firstname.compareTo(emp2.firstname);};
		finalComparator = finalComparator.thenComparing((emp1,emp2)->{return emp1.dateOfJoin.compareTo(emp2.dateOfJoin);});
		System.out.println(empLst);
		Collections.sort(empLst, finalComparator);
		System.out.println(empLst);
	}

}
