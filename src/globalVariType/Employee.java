package globalVariType;

public class Employee {

		char emp_gender;
		String emp_name;
		String emp_id;
		float emp_Sal;
		String emp_desg;
		int emp_age;
		static String team;
	
			public void emp_info()
			{
				System.out.println("***Employee Information***");
				System.out.println("Employee Name is "+emp_name);
				System.out.println("Employee Id is "+emp_id);
				System.out.println("Employee Salary  is "+emp_Sal);
				System.out.println("Employee Designation is "+emp_desg);
				System.out.println("Employee Age "+emp_age);
				System.out.println("Employee Gender is "+emp_gender);
			}
	
}



