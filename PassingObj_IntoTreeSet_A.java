package set;

public class PassingObj_IntoTreeSet_A 
{
	private int empId;
	private String empName;
	private String empAddress;
	public PassingObj_IntoTreeSet_A(int empId, String empName, String empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return empId + " " + empName + " " + empAddress;
	}
	

}
