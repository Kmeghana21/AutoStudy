package globalVariType;

public class HrPortal
{

	public static void main(String[] args)
	{
		Employee Sachin= new Employee();		//created object of employee class
		Sachin.emp_name="Sachin Tendulakar";
		Sachin.emp_id="IND10";
		Sachin.emp_desg="Batsman";
		Sachin.emp_Sal=123.14f;
		Sachin.emp_age=41;
		Sachin.emp_gender='M';
		
		Sachin.emp_info();
				

	}

}
