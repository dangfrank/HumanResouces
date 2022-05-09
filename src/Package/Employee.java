package Package;

public class Employee extends Staff implements ICalculator{
    private double overTime;

    public Employee(String userId, String name, int age, double coefficientSalary, String startWorkDay, int dayOffNumber, Department department,double overTime) {
        super(userId, name, age, coefficientSalary, startWorkDay, dayOffNumber, department);
        this.overTime = overTime;
    }

    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }


    @Override
    public double calculateSalary(){
        return super.getCoefficientSalary() * 3000000 + overTime * 200000;
    };


    @Override
    public String displayInformation(){
       return super.displayInformation() + " Làm thêm: " + overTime;

    }


}
