public class CompanyEmpWage {
        public final int EMP_RATE_PER_HOUR;
        public final int NUM_OF_WORKING_DAYS;
        public int totalEmpWage;
        public final int MAX_WORK_HOURS;
        public final String company;

        public CompanyEmpWage(String company, int empRate, int numOfDays, int maxHrs) {
                this.company = company;
                EMP_RATE_PER_HOUR = empRate;
                NUM_OF_WORKING_DAYS = numOfDays;
                MAX_WORK_HOURS = maxHrs;
		totalEmpWage=0;
        }

        public void setTotalEmpWage(int totalEmpWage) {
                this.totalEmpWage = totalEmpWage;
        }

        public String toString() {
                 return "Total Emp Wage for Company " +company+ " is : " + totalEmpWage;
        }

}
