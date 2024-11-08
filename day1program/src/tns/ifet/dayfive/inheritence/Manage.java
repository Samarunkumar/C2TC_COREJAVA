package tns.ifet.dayfive.inheritence;

public class Manage {
	private int teamSize;

	// constructors
	public Manager() {
		super();

	}

	public Manager(String name, int employeeId, String department, int teamSize) {
		super(name, employeeId, department);
		this.teamSize = teamSize;
	}

	// getter/setter methods
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [TeamSize=" + teamSize + ", Name=" + getName() + ", EmployeeId=" + getEmployeeId()
				+ ", Department=" + getDepartment() + "]";
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
