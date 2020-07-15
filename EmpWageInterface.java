public interface EmpWageInterface {

	public void addCompanyEmpWage(String company, int empRate, int numOfDays, int maxHrs);
	public void computeEmpWage();
	public int computeEmpWage(CompanyEmpWage company);
}
