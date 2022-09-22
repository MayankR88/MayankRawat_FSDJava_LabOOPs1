package labOOPs01;
import java.util.Scanner;

public class CredentialService extends RandomPassword{
	
	public static void main(String[] args) {
		Employee emp = new Employee("Harshit", "Choudhary");
		DepartmentNam dep = new DepartmentNam();
			
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical"+"\n2. Admin"+"\n3. Human Resource"+"\n4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if(choice==1) {
			System.out.println("Dear "+emp.firstName+" your generated credentials are as follows:" );
		
			dep.departmentName = "tech";
		
			System.out.println("Email -----> "+emp.firstName.toLowerCase()+emp.lastName.toLowerCase()
			+"@"+dep.departmentName+".abc.com");
			
			System.out.print("Password ---> ");
			System.out.print(new RandomPassword().ranpas);
		}
		else if(choice==2) {
			System.out.println("Dear "+emp.firstName+" your generated credentials are as follows:" );
		
			dep.departmentName = "adm";
		
			System.out.println("Email -----> "+emp.firstName.toLowerCase()+emp.lastName.toLowerCase()
			+"@"+dep.departmentName+".abc.com");
			
			System.out.print("Password ---> ");
			System.out.print(new RandomPassword().ranpas);
		}
		else if(choice==3) {
			System.out.println("Dear "+emp.firstName+" your generated credentials are as follows:" );
		
			dep.departmentName = "hr";
		
			System.out.println("Email -----> "+emp.firstName.toLowerCase()+emp.lastName.toLowerCase()
			+"@"+dep.departmentName+".abc.com");
			
			System.out.print("Password ---> ");
			System.out.print(new RandomPassword().ranpas);
		}
		else if(choice==4) {
			System.out.println("Dear "+emp.firstName+" your generated credentials are as follows:" );
		
			dep.departmentName = "lgl";
		
			System.out.println("Email -----> "+emp.firstName.toLowerCase()+emp.lastName.toLowerCase()
			+"@"+dep.departmentName+".abc.com");
			
			System.out.print("Password ---> ");
			System.out.print(new RandomPassword().ranpas);
		}
		else {
			System.out.println("Thank you. Try again later!");
		}
		
	}

	
}