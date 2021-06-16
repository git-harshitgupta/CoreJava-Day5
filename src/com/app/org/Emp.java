package com.app.org;

abstract public class Emp {
    private int id;
    private  String name;
    private String deptID;
    private  double basic;

    public Emp(int id, String name, String deptID, double basic) {
        this.id = id;
        this.name = name;
        this.deptID = deptID;
        this.basic = basic;
    }
    public double getBasic() {
        return basic;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptID='" + deptID + '\'' +
                ", basic=" + basic +
                '}';
    }

    public abstract double getSalary();

}
