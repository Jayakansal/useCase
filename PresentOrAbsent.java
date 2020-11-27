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
		  
	}
			
		

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

 }
                totalEmpHrs+=empHrs;
                System.out.println("day: "+totalWorkingDays + "EmpHrs: "+empHrs);
                }
         totalEmpWage=totalEmpHrs*empRatePerHour;
                //System.out.println("total emp wage for company: "+company+"is: "+totalEmpWage);

                }


        @Override
        public String toString() {
                return "Total Emp Wage for Company: "+company+" is "+totalEmpWage;
        }
        public static void main(String[] args) {
                EmpWageBuilderObject dMart=new EmpWageBuilderObject("DMart", 20, 2, 10);
                EmpWageBuilderObject reliance=new EmpWageBuilderObject("Reliance", 10, 4, 20);

                dMart.computeEmpWage();
                System.out.println(dMart);


                reliance.computeEmpWage();
                System.out.println(reliance);

        }

}


//Company Employee Wage

package com.employee.usecases;

public class CompanyEmpWage {

	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company: "+company+" is "+totalEmpWage;
	}

}


//Employee Wage Builder Array

package com.employee.usecases;

import java.util.Random;

public class EmployeeWageBuilderArray {

	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	public int numOfCompany=0;
	
	CompanyEmpWage companyEmpWage[];
	
	public EmployeeWageBuilderArray()
	{
		companyEmpWage=new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	{
		companyEmpWage[numOfCompany]=new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}
	
	private void computeEmpWage()
	{
		for (int i = 0; i <numOfCompany; i++) 
		{
			companyEmpWage[i].setTotalEmpWage(this.computeEmpWage(companyEmpWage[i]));
			System.out.println(companyEmpWage[i]);
		}
	}
	
	
	private int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
	int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
	Random random=new Random();
	while(totalEmpHrs<=companyEmpWage.maxHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays)
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
		}
		totalEmpHrs+=empHrs;
		System.out.println("day: "+totalWorkingDays + "EmpHrs: "+empHrs);
		}
	
	return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	
	
	public static void main(String[] args) {
		EmployeeWageBuilderArray empWageBuilder=new EmployeeWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
	}
}
package com.employee.usecase11;

public interface CompanyEmpWage {
public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	 public void computeEmpWage();
	 public int computeEmpWage(CompanyEmpWage companyEmpWage);
}
public class CompanyEmpWage{

	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company: "+company+" is "+totalEmpWage;
	}

}




package com.employee.usecases;

import java.util.Random;

public class EmployeeWageBuilder {

	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	public int numOfCompany=0;
	
	CompanyEmpWage companyEmpWage[];
	
	public EmployeeWageBuilderArray()
	{
		companyEmpWage=new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	{
		companyEmpWage[numOfCompany]=new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}
	
	private void computeEmpWage()
	{
		for (int i = 0; i <numOfCompany; i++) 
		{
			companyEmpWage[i].setTotalEmpWage(this.computeEmpWage(companyEmpWage[i]));
			System.out.println(companyEmpWage[i]);
		}
	}
	
	
	private int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
	int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
	Random random=new Random();
	while(totalEmpHrs<=companyEmpWage.maxHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays)
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
		}
		totalEmpHrs+=empHrs;
		System.out.println("day: "+totalWorkingDays + "EmpHrs: "+empHrs);
		}
	
	return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	
	
	public static void main(String[] args) {
		EmployeeWageBuilderArray empWageBuilder=new EmployeeWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
	}
}
}

package com.employee.usecase12;

public interface IComputeEmpWage {

         public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
         public void computeEmpWage();
         public int computeEmpWage(CompanyEmpWage,companyEmpWage);

         public int getTotalWage(String company);

}

//Implementation class in including linked-list


package com.employee.usecase12;


import java.util.LinkedList;

import java.util.Random;

public class EmployeeWageBuilder implements IComputeEmpWage  {

        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;

        public int numOfCompany=0;

        private LinkedList<CompanyEmpWage> companyEmpWageList;



        //CompanyEmpWage companyEmpWage[];

        public EmployeeWageBuilderArray()
        {
                companyEmpWageList= new LinkedList<CompanyEmpWage>();


                //companyEmpWage=new CompanyEmpWage[5];
        }

        public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
 {
                CompanyEmpWage companyEmpWage=new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);

                companyEmpWageList.add(companyEmpWage);



        }

        public void computeEmpWage()
        {
                for (int i = 0; i <companyEmpWageList.size(); i++)
                {
                                CompanyEmpWage company=companyEmpWageList.get(i);
                                company.setTotalEmpWage(this.computeEmpWage(company));
                                System.out.println(company);

                }
        }


        public int computeEmpWage(CompanyEmpWage companyEmpWage)
        {
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
        Random random=new Random();
        while(totalEmpHrs<=companyEmpWage.maxHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays)
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
                }
                totalEmpHrs+=empHrs;
                System.out.println("day: "+totalWorkingDays + "EmpHrs: "+empHrs);
                }


        return totalEmpHrs * companyEmpWage.empRatePerHour;
        }


        public static void main(String[] args) {
                EmployeeWageBuilderArray empWageBuilder=new EmployeeWageBuilderArray();
                empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
                empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
                empWageBuilder.computeEmpWage();
        }



        }

}
package com.employee.usecase13;

public interface IComputeEmpWage {

	 public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	 public void computeEmpWage();
	 public int computeEmpWage(CompanyEmpWage companyEmpWage);
	 
	 public int getTotalWage(String company);

}

//Implementation class in including linked-list & Hash Map


package com.employee.usecase13;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class EmployeeWageBuilder implements IComputeEmpWage  {

	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	public int numOfCompany=0;
	
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	
	private Map<String, CompanyEmpWage>companyEmpWageMap;
	
	//CompanyEmpWage companyEmpWage[];
	
	public EmployeeWageBuilderArray()
	{
		companyEmpWageList= new LinkedList<CompanyEmpWage>();
		companyEmpWageMap=new HashMap<String, CompanyEmpWage>();
		
		//companyEmpWage=new CompanyEmpWage[5];
	}
	
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	{
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);	
		
		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(company, companyEmpWage);
		
		//companyEmpWage[numOfCompany]=new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		//numOfCompany++;
	}
	
	public void computeEmpWage()
	{
		for (int i = 0; i <companyEmpWageList.size(); i++) 
		{
				CompanyEmpWage company=companyEmpWageList.get(i);
				company.setTotalEmpWage(this.computeEmpWage(company));
				System.out.println(company);
			//companyEmpWage[i].setTotalEmpWage(this.computeEmpWage(companyEmpWage[i]));
			//System.out.println(companyEmpWage[i]);
		}
	}
	
	
	public int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
	int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
	Random random=new Random();
	while(totalEmpHrs<=companyEmpWage.maxHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays)
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
		}
		totalEmpHrs+=empHrs;
		System.out.println("day: "+totalWorkingDays + "EmpHrs: "+empHrs);
		}
	
	return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	
	
	public static void main(String[] args) {
		EmployeeWageBuilderArray empWageBuilder=new EmployeeWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
	}

	@Override
	public int getTotalWage(String company) {
		return companyEmpWageMap.get(company).totalEmpWage;
		 
	}
	
}
