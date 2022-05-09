package Package;

public class Department {
    private int departmentId;
    private String departmentName;
    private int departmentQuantity;


    public Department(int departmentId, String departmentName, int departmentQuantity) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentQuantity = departmentQuantity;
    }



    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentQuantity() {
        return departmentQuantity;
    }

    public void setDepartmentQuantity(int departmentQuantity) {
        this.departmentQuantity = departmentQuantity;
    }
    public String displayInformation(){
        return "    "+departmentId + "          " + departmentName + "             " + departmentQuantity;
    }
    @Override
    public String toString() {
        return departmentName;
    }
}
