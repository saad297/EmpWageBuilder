import java.util.*;

public class EmpWageBuilder implements EmpWageInterface
{
	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;

	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;

	public EmpWageBuilder()
	{
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	public void addCompanyEmpWage(String company, int empRate, int numOfDays, int maxHrs) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRate, numOfDays, maxHrs);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}

	}

	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalEmpWage;
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs=0;
                int totalEmpHrs=0;
                int days=0;
                while (totalEmpHrs <= companyEmpWage.MAX_WORK_HOURS &&
			 days < companyEmpWage.NUM_OF_WORKING_DAYS)
                {
                        days++;
                        int empCheck=(int)Math.floor(Math.random() * 10) %3;
                        switch (empCheck) {
                                case IS_FULL_TIME:
                                        empHrs=8;
                        break;
                                case IS_PART_TIME:
                                        empHrs=4;
                        break;
                                default:
                                        empHrs=0;
                        }
                        totalEmpHrs += empHrs;
			System.out.println("Total working days : " +days+"  Total working hours : " + totalEmpHrs);
                }
		return totalEmpHrs * companyEmpWage.EMP_RATE_PER_HOUR;
	}

	public static void main(String[] args)
	{
		EmpWageBuilder builder=new EmpWageBuilder();
		builder.addCompanyEmpWage("DMART",20,2,10);
		builder.addCompanyEmpWage("Reliance",10,4,20);
		builder.computeEmpWage();
		System.out.println("Total wage for Dmart : " + builder.getTotalWage("dmart"));
	}
}
