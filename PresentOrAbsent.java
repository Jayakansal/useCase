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

