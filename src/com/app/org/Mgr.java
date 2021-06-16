package com.app.org;

public class Mgr extends Emp{
    private double performaceBouns;

    public Mgr(int id, String name, String deptID, double basic, double performaceBouns) {
        super(id, name, deptID, basic);
        this.performaceBouns = performaceBouns;
    }
    public double getSalary() {
        return super.getBasic()+performaceBouns;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public double getPerformaceBouns() {
        return performaceBouns;
    }

    public void setPerformaceBouns(double performaceBouns) {
        this.performaceBouns = performaceBouns;
        System.out.println("The new performace bouns is "+performaceBouns);
    }
}
