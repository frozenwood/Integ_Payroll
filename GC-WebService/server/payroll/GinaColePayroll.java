// all web services (implementations)
// must be placed in a package
package payroll;
import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.ArrayList;
import java.util.Date;

// annotation{} a j2se 5 feature
@WebService
public class GinaColePayroll {
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();

	@WebMethod
	public boolean newEmployee(Employee e) {
		try{
			for(Employee emp : employeeList){
				if(e.getName().equalsIgnoreCase(emp.getName())){
					System.out.println("Name exists!");
					return false;
				} else{
					employeeList.add(e);
					System.out.println("Successfully registered "+e.getName()+".");
					return true;
				}
			}
		} catch(Exception x) {
			x.printStackTrace();
		}
		return false;
	}

	@WebMethod
	public boolean deleteEmployee(String n) {
		try{
			for(int i = 0; i < employeeList.size(); i++){
				if(n.equalsIgnoreCase(employeeList.get(i).getName())){
					employeeList.remove(i);
					System.out.println("Successfully deleted "+n+".");
					return true;
				}else{
					System.out.println("Name doesn't exist!");
					return false;
				}
			}
		} catch(Exception x) {
			x.printStackTrace();
			return false;
		}
		return false;
	}

	@WebMethod
	public double computePayslip(String n, int reg, int ot) {
		try{
			for(Employee emp : employeeList){
				if(n.equalsIgnoreCase(emp.getName())){
					System.out.println(emp.getName()+" Salary: ");
					return emp.getHourlyRate()*reg;
				} else{
					return 0;
				}
			}
		} catch(Exception x) {
			x.printStackTrace();
		}
		return 0;
	}
}
