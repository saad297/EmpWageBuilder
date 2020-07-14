class EmpWageBuilder
{
	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
	private final int EMP_RATE_PER_HOUR;
	private final int NUM_OF_WORKING_DAYS;
	private int totalEmpWage;
	private final int MAX_WORK_HOURS;
	private final String company;

	public EmpWageBuilder(String company, int empRate, int numOfDays, int maxHrs)
	{
		this.company = company;
		EMP_RATE_PER_HOUR = empRate;
		NUM_OF_WORKING_DAYS = numOfDays;
		MAX_WORK_HOURS = maxHrs;
	}

	public void computeEmpWage() {
		int empHrs=0;
              	int empWage=0;
                int totalEmpHrs=0;
                int days=0;
                while (empHrs <= MAX_WORK_HOURS && days < NUM_OF_WORKING_DAYS)
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
                }
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total working days : " +days+"  Total working hours : " + totalEmpHrs);
	}
	public String toString() {
		return "Total Emp Wage for Company " +company+ " is : " + totalEmpWage;
	}

	public static void main(String[] args)
	{
		EmpWageBuilder dmart=new EmpWageBuilder("DMART",20,10,20);
		EmpWageBuilder reliance=new EmpWageBuilder("Reliance",15,12,30);
		dmart.computeEmpWage();
		System.out.println(dmart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}
