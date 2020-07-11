class EmpWageBuilder
{
	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_WORK_HOURS=100;

	public static void main(String[] args)
	{
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
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
			System.out.println("Total days : " + days + "	Total hours are : " + totalEmpHrs);
		}
		totalEmpWage=totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total employee wage is : " + totalEmpWage);
	}
}
