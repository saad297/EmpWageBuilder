class EmpWageBuilder
{
	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;

	public static void computeEmpWage(String company, int empRate, int numOfDays, int maxHrs) {
		int empHrs=0;
              	int empWage=0;
		int totalEmpWage=0;
                int totalEmpHrs=0;
                int days=0;
                while (empHrs <= maxHrs && days < numOfDays)
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
			empWage = empHrs * empRate;
			totalEmpWage += empWage;
                        System.out.println("Total days : " + days + "   Total hours are : " + totalEmpHrs);
                }
		System.out.println("Total Employee Wage for " +company+ " is : " +totalEmpWage);
	}

	public static void main(String[] args)
	{
		computeEmpWage("Dmart",20,10,30);
		computeEmpWage("Reliance",15,5,20);
	}
}
