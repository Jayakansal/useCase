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
