package Package;

public abstract class  Staff {
    private String userId;
    private String name;
    private int age;
    private double coefficientSalary;
    private String startWorkDay;
    private Department department;
    private int dayOffNumber;

    public Staff(String userId, String name, int age, double coefficientSalary, String startWorkDay, int dayOffNumber, Department department) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.coefficientSalary = coefficientSalary;
        this.startWorkDay = startWorkDay;
        this.department = department;
        this.dayOffNumber = dayOffNumber;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }
    public void setName(String name){
        this.name = name;
    }public void setAge(int age){
        this.age = age;
    }public void setCoefficientSalary(double coefficientSalary){
        this.coefficientSalary = coefficientSalary;
    }public void setStartWorkDay(String startWorkDay){
        this.startWorkDay = startWorkDay;
    }public void setDepartment(Department department){
        this.department = department;
    }public void setDayOffNumber(int dayOffNumber){
        this.dayOffNumber = dayOffNumber;
    }
    public String getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getCoefficientSalary(){
        return coefficientSalary;
    }
    public String getStartWorkDay(){
        return startWorkDay;
    }
    public Department getDepartment(){
        return department;
    }
    public int getDayOffNumber(){
        return dayOffNumber;
    }


    public String displayInformation(){

        return  "Mã Id: " + userId +", Tên : "+ name +", Tuổi: "+ age +", HSL: "+coefficientSalary +", Ngày bắt đầu làm: "+ startWorkDay +", Bộ phận: "+department+", Số ngày nghỉ: "+dayOffNumber;
    }
    public Boolean isBelongToDepartment(Department d){
        if (department.getDepartmentId() == d.getDepartmentId()) {
            return true;
        }
        return  false;
    }
    abstract public double calculateSalary();

}
