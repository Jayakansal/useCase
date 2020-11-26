package com.useCase;

import java.util.Random;

public class PresentOrAbsent {

	public static void main(String[] args) {
		Random random=new Random();
			int randomNum=random.nextInt(2);

if (randomNum==1) {
	System.out.println("Employee is Present");
} else { 
	System.out.println("Employee is Absent");
	}
	}
}
package com.useCase1;

import java.util.Random;

public class SalaryOfEmployee {

        public static void main(String[] args) {
                Random random=new Random();
                int randomNum=random.nextInt(2);

if (randomNum==1) {
System.out.println("Employee is Present");
int EmpHur=8;
int ratePerHur=20;
System.out.println("Salary:(int EmpHur* int ratePerHur)}");

} else {
System.out.println("Employee is Absent");
System.out.println("Salary:+0");
}
package com.useCase2;

import java.util.Random;

public class PartTimeORFullTime {

        public static void main(String[] args) {
                int PartTime=1;
                int FullTime=2;
                int EmpRatePerHr=20;
                int EmpHur=0;

                Random random=new Random();
                int randomNum=random.nextInt(3);
                if (randomNum==1)
                {
                 EmpHur=4;
                }
                else if (randomNum==2) {
                 EmpHur=8;
                }
                else {
                         EmpHur=0;
                }

                System.out.println("Employee Hours"+ EmpHur);
                System.out.println("Salary:"+( EmpHur*EmpRatePerHr));


                }


        }
package com.useCase3;

import java.util.Random;

public class WorkingHour {


        public static void main(String[] args) {
                int PartTime=1;
                int FullTime=2;
                int EmpRatePerHr=20;
                double Salary;
                int absent=0;
                int partTimeHour=4;
                int fullTimeHour=8;
                Random random=new Random();
                int randomNum=random.nextInt(3);
                int EmpHur;
                switch (randomNum) {
                case 1:
                        int partTimeWage=(partTimeHour*EmpRatePerHr);
                        System.out.println("Part Time Employee " +partTimeWage);
                        break;
                case 2:
                        int fullTimeWage=(fullTimeHour*EmpRatePerHr);
                        System.out.println("Full Time Employee " +fullTimeWage);
                        break;

                default:
                        System.out.println("Absent"+ absent);
                        break;
                }


        }
        }
package com.useCase4;

import java.util.Random;

public class SalaryOfMonth {

        public static void main(String[] args) {
                int partTimeHours=4;
                int fullTimeHours=8;
                int FullTime=8;
                int EmpRatePerHr=20;
        double Salary;
        int absent=0;
       int WorkingDays=20;
       int day;
       int EmpHur;


      for ( day= 1; day< WorkingDays; day++) {

           Random random=new Random();
           int randomNum=random.nextInt(3);

           switch (randomNum) {
                case 1:
                        int partTimeWage=(partTimeHours*EmpRatePerHr);
                        System.out.println("Part Time Employee " +partTimeWage);
                        break;
                case 2:
                        int fullTimeWage=(fullTimeHours*EmpRatePerHr);
                        System.out.println("Full Time Employee " +fullTimeWage);
                        break;

                default:
                        System.out.println("Absent"+ absent);
                        break;
                }

}
        }
}

package com.useCase5;

import java.util.Random;



public class EmpWage {

        public static void main(String[] args) {
                System.out.println("Welcome to employee wage computation");
                int maxHrsInMonth=100;
                int noOfWorkDay=20;
                int empRatePerHr=20;
                int isPartTime=1;
                int isFullTime=2;
                int empHrs=0;
                int totalEmpHrs=0;
                int totalWorkDay=0;
                int totalEmpWage=0;
        while( totalWorkDay<noOfWorkDay && totalEmpHrs<=maxHrsInMonth)
        {
                 Random random=new Random();
                int randomNum=random.nextInt(3);
                System.out.println("Random number: "+randomNum);
        switch(randomNum)
        {
        case isPartTime: empHrs=4;
                break;
        case isFullTime: empHrs=8;
                break;
        default: empHrs=0;

        }
                totalWorkDay++;
                totalEmpHrs=totalEmpHrs + empHrs;
                System.out.println("employee days: "+totalWorkDay + "work hours: "+totalEmpHrs);
totalEmpWage=(totalEmpHrs*empRatePerHr);
System.out.println("employee total salary is: "+totalEmpWage);

        }
        }
        }
package com.useCase6;

public class EmpWagebuilderClassMethod {

        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static final int NUM_OF_WORKING_DAYS=2;
        public static final int MAX_HRS_IN_MONTH=10;

                public static int computeEmpWage() {
                        int empHrs=0;
                        int totalEmpHrs=0;
                        int totalWorkingDays=0;

                        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
                        {
                                totalWorkingDays++;
                                int empCheck = (int) Math.floor(Math.random()*10)%3;
                                switch (empCheck)
                                {
                                case IS_PART_TIME:
                                   empHrs=4;
                                   break;
                                case IS_FULL_TIME:
                                        empHrs=8;
                                        break;

                                default:
                                        empHrs=0;
                                }
                                        totalEmpHrs+=empHrs;
                                        System.out.println("Day#:"+totalWorkingDays+ "Emp Hr: "+empHrs);
                        }
                        int totalEmpWage= totalEmpHrs*EMP_RATE_PER_HOUR;
                        System.out.println("total Emp Wage:" +totalEmpWage);
                        return totalEmpWage;
                }
                public static void main (String[] args)
                {
                        computeEmpWage();
                                }



        }

package com.useCase7;

public class EmpWageBuilderMultiCompany {

	
	public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		public static final int NUM_OF_WORKING_DAYS=2;
		public static final int MAX_HRS_IN_MONTH=10;
	public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		  {
			  int empHrs=0;
			  int totalEmpHrs=0, totalWorkingDays=0;

				while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
				{
					totalWorkingDays++;
					int empCheck = (int) Math.floor(Math.random()*10)%3;
					switch (empCheck)
					{
					case IS_PART_TIME:
					   empHrs=4;
					   break;
					case IS_FULL_TIME:
						empHrs=8;
						break;
						
					default:
						empHrs=0;
					}
						totalEmpHrs+=empHrs;
						System.out.println("Day#:"+totalWorkingDays+ "Emp Hr: "+empHrs);
				}
				int totalEmpWage= totalEmpHrs*empRatePerHour;
				
				System.out.println("Total Emp Wage for Company:"+company+" is:" +totalEmpWage);
				return totalEmpWage;
		  public static void main(String[] args)
		  {
			  computeEmpWage("DMart",20,2,10);
			  computeEmpWage("Reliance",10,4,20);
			 
		  
		  }
		  
		{
			
		

	}

package com.employee.usecases;

import java.util.Random;

public class EmpWageBuilderObject {

        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;

        private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;

        private int totalEmpWage;

        public EmpWageBuilderObject(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
                super();
                this.company = company;
                this.empRatePerHour = empRatePerHour;
                this.numOfWorkingDays = numOfWorkingDays;
                this.maxHoursPerMonth = maxHoursPerMonth;
        }


        public void computeEmpWage()
        {
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
        Random random=new Random();
        while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays)
        {
                totalWorkingDays++;

                int empCheck=random.nextInt(3);
                                //(int) Math.floor(Math.random() * 10)%3;
                switch(empCheck)
                {
                case IS_PART_TIME:
                        empHrs=4;
                        break;

                case IS_FULL_TIME:
                        empHrs=8;
                        break;
                default:
                        empHrs=0;

