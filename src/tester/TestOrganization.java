package tester;
import com.app.org.*;

import java.util.Scanner;

public class TestOrganization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee");
        Emp[] list = new Emp[sc.nextInt()];
        int count = 0;
        boolean exit= true;
        while (exit) {
            System.out.println("1.Hire Manager");
            System.out.println("2.Hire Worker");
            System.out.println("3.Display Employee information");
            System.out.println("4.Update performace bouns or hourly rate");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            switch(sc.nextInt()){
                case 1:
                    if(count< list.length) {
                        System.out.println("Enter the id,name,department,basic,performance bouns");
                        list[count++] = new Mgr(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
                    }
                    else {
                        System.out.println("Employee full");
                    }
                    break;
                case 2:
                    if(count< list.length) {
                        System.out.println("Enter the id,name,department,basic salary, hoursworked, hourrate");
                        list[count++] = new Worker(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(),sc.nextDouble());
                    }
                    else {
                        System.out.println("Employee full");
                    }
                    break;
                case 3:
                    for(Emp i : list){
                        if(i!=null){
                            System.out.println(i);
                            if(i instanceof Mgr){
                                System.out.println("The perfomance bouns is"+((Mgr)i).getPerformaceBouns());
                            }
                            else if(i instanceof Worker){
                                System.out.println("The hourly rate is "+((Worker)i).getHrlyRate());
                            }
                        }
                    }
                    break;
                case 4:
//                    Update performanceBonus or hourly rate
//                    I/P : emp id , bonus or hourly rate increment
//                    Update the details suitably.
                    System.out.println("Enter the id of the employee");
                    int id = sc.nextInt();
                    if(list[id-1] instanceof Mgr){
                        System.out.println("Enter the new performance bouns");
                        ((Mgr) list[id-1]).setPerformaceBouns(sc.nextDouble());
                    }
                    else if(list[id-1] instanceof Worker){
                        System.out.println("Enter the new Hourly Rate");
                        ((Worker) list[id-1]).sethrlyRate(sc.nextDouble());
                    }
                    else {
                        System.out.println("Invaild input");
                    }
                    break;
                case 5:
                    exit = false;
            }

        }
    }
}
