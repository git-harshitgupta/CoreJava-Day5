package com.app.org;

public class Worker extends Emp{
    private int hoursWorked;
    private double hrlyRate;

    public Worker(int id, String name, String deptID, double basic, int hoursWorked, double hrlyRate) {
        super(id, name, deptID, basic);
        this.hoursWorked = hoursWorked;
        this.hrlyRate = hrlyRate;
    }

    public double getSalary(){
        return super.getBasic()+(hoursWorked*hrlyRate);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getHrlyRate(){
        return hrlyRate;
    }

    public void sethrlyRate(double hrlyRate){
        this.hrlyRate = hrlyRate;
        System.out.println("The new hourly rate is "+hrlyRate);
    }
}
