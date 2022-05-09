package Package;

import java.util.Scanner;

public class Manager extends Staff implements ICalculator{
    private double responsibleSalary;
    private String position;

    public Manager(String userId, String name, int age, double coefficientSalary, String startWorkDay, int dayOffNumber, Department department ,String position) {
        super(userId, name, age, coefficientSalary, startWorkDay, dayOffNumber, department);
        this.responsibleSalary = responsibleSalary;
        this.position = position;
    }




    public double getResponsibleSalary() {
        return responsibleSalary;
    }

    public void setResponsibleSalary(double responsibleSalary) {
        this.responsibleSalary = responsibleSalary;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = String.valueOf(position);
    }

    @Override
    public String displayInformation(){

        return super.displayInformation() + " Chức danh: " + position;
    }

    @Override
    public double calculateSalary() {

        if (position.equalsIgnoreCase("Business Leader")) {
            responsibleSalary = 8000000;
        }else if (position.equalsIgnoreCase("Project Leader")){
            responsibleSalary = 5000000;
        }else if(position.equalsIgnoreCase("Technical Leader")){
            responsibleSalary = 6000000;
        }
        return super.getCoefficientSalary() * 5000000 + responsibleSalary;
    }

}
