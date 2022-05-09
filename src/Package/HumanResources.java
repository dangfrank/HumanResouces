package Package;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class HumanResources {
    public static void main(String[] args){
        menu();

    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        do {
            System.out.println("--------Quản lý nhân viên--------");
            System.out.println("1. HIỂN THỊ DANH SÁCH NHÂN VIÊN");
            System.out.println("2. HIỂN THỊ CÁC BỘ PHẬN");
            System.out.println("3. HIỂN THỊ CÁC NHÂN VIÊN THEO BỘ PHẬN");
            System.out.println("4. THÊM NHÂN VIÊN MỚI");
            System.out.println("5. TÌM THÔNG TIN NHÂN VIÊN");
            System.out.println("6. HIỂN THỊ BẢNG LƯƠNG");
            System.out.println("7. SẮP XẾP THỨ TỰ NHÂN VIÊN THEO BẢNG LƯƠNG");
            System.out.println("8. THOÁT");

            ArrayList<Department> departmentList = new ArrayList<>();


            Department projectDepartment = new Department(1, "Project",4);
            Department businessDepartment = new Department(2, "Business",3);
            Department technicalDepartment = new Department(3, "Technical",4);

            departmentList.add(projectDepartment);
            departmentList.add(businessDepartment);
            departmentList.add(technicalDepartment);

            ArrayList<Staff> staffList = new ArrayList<>();

            Staff s1 = new Employee("001", "Nguyễn Văn A", 28, 2.0, "01/09/2021", 0, projectDepartment,3.5 );
            Staff s2 = new Employee("002", "Nguyễn Văn B", 25, 2.0, "18/08/2020", 1, projectDepartment,4);
            Staff s3 = new Employee("003", "Nguyễn Văn C", 24, 2.0, "14/10/2021", 2, businessDepartment,0 );
            Staff s4 = new Employee("004", "Nguyễn Văn D", 23, 2.0, "30/09/2019", 0, technicalDepartment,5.5 );
            Staff s5 = new Employee("005", "Nguyễn Văn E", 26, 2.0, "27/09/2018", 4, technicalDepartment,1 );
            Staff s6 = new Employee("006", "Nguyễn Văn F", 29, 2.0, "07/09/2018", 4, projectDepartment,1 );
            Staff s7 = new Employee("007", "Nguyễn Văn G", 21, 2.0, "16/03/2018", 4, businessDepartment,1 );
            Staff s8 = new Employee("008", "Nguyễn Văn H", 20, 2.0, "27/04/2018", 4, technicalDepartment,1 );
            Staff s9 = new Manager("009",  "Nguyễn Văn I", 32, 2.0, "12/09/2016", 1 ,projectDepartment,"Project Leader");
            Staff s10 = new Manager("010", "Nguyễn Văn K", 46, 2.0, "20/09/2015", 4, businessDepartment,"Business Leader");
            Staff s11 = new Manager("011", "Nguyễn Văn L", 35, 2.0, "27/03/2015", 4, technicalDepartment,"Technical Leader");

            staffList.add(s1);
            staffList.add(s2);
            staffList.add(s3);
            staffList.add(s4);
            staffList.add(s5);
            staffList.add(s6);
            staffList.add(s7);
            staffList.add(s8);
            staffList.add(s9);
            staffList.add(s10);
            staffList.add(s11);


            System.out.println("Lựa chọn từ 1 - 8");
            answer = sc.nextInt();

            if (answer == 1){
                System.out.println("                                  DANH SÁCH NHÂN VIÊN");

                for (Staff item : staffList) {
                    System.out.println(item.displayInformation());
                }
                System.out.println();

            }else if (answer == 2){
                System.out.println("       DANH SÁCH CÁC BỘ PHẬN");
                System.out.println("-------------------------------------");
                System.out.println("Mã bộ phận     Tên bộ phận       Số lượng");
                System.out.println("-------------------------------------");

                for (Department i: departmentList){
                    System.out.println(i.displayInformation());
                }
            }else if (answer == 3){
                boolean isBelongToDepartment = false;
                for (Department d: departmentList) {
                    System.out.println();
                    System.out.println("BỘ PHẬN:  " + d.getDepartmentName());
                    System.out.println();
                    for (Staff s: staffList) {
                        isBelongToDepartment = s.isBelongToDepartment(d);
                        if(isBelongToDepartment == true){
                            System.out.println(s.displayInformation());
                        }
                    }
                }
                System.out.println();
            }else if (answer == 4){
                System.out.println("Thêm nhân viên mới vào công ty");
                System.out.println("Nhấn 1 để thêm nhân viên");
                System.out.println("Nhấn 2 để thêm quản lý");
                int choose = sc.nextInt();
                while (choose != 1 && choose != 2) {
                    System.out.println("Chỉ chọn 1 hoặc 2");
                    System.out.println("Nhấn 1 để thêm nhân viên");
                    System.out.println("Nhấn 2 để thêm quản lý");
                    choose = sc.nextInt();
                }
                if (choose == 1){

                    System.out.println("Nhập mã nhân viên:");
                    String userId = sc.next();
                    System.out.println("Nhập tên nhân viên:");
                    String n = sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Nhập tuổi nhân viên:");
                    int age = sc.nextInt();
                    System.out.println("Nhập hệ số lương:");
                    double coefficientSalary = sc.nextDouble();
                    System.out.println("Nhập ngày bắt đầu làm việc:");
                    String startWorkDay = sc.next();
                    System.out.println("Nhập số ngày nghỉ:");
                    int dayOffNumber = sc.nextInt();

                    System.out.println("Nhập phòng ban:");
                    System.out.println("1: Phòng Project, 2: Phòng Business, 3: Phòng Technical");
                    int departmentId = sc.nextInt();
                    while (departmentId != 1 && departmentId != 2 && departmentId !=3){
                        System.out.println("Chỉ chọn 1 , 2 hoặc 3");
                        System.out.println("1: Phòng Project, 2: Phòng Business, 3: Phòng Technical");
                        departmentId = sc.nextInt();
                    }
                    Department department = null;
                    for (Department d: departmentList) {
                        if (d.getDepartmentId() == departmentId){
                            department = d;
                            break;
                        }
                    }
                    System.out.println("Nhập số giờ làm thêm:");
                    int overTime = sc.nextInt();
                    Employee e = new Employee(userId, name, age, coefficientSalary, startWorkDay, dayOffNumber, department, overTime);
                    staffList.add(e);
                    for (Staff item : staffList) {
                        System.out.println(item.displayInformation());
                    }
                }
                if (choose == 2){
                    System.out.println("Nhập mã quản lý:");
                    String userId = sc.next();
                    System.out.println("Nhập tên quản lý:");
                    String n = sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Nhập tuổi quản lý:");
                    int age = sc.nextInt();
                    System.out.println("Nhập hệ số lương:");
                    double coefficientSalary = sc.nextDouble();
                    System.out.println("Nhập ngày bắt đầu làm việc:");
                    String startWorkDay = sc.next();
                    System.out.println("Nhập số ngày nghỉ:");
                    int dayOffNumber = sc.nextInt();
                    System.out.println("Nhập phòng ban:");
                    System.out.println("1: Phòng Project, 2: Phòng Business, 3: Phòng Technical");
                    int departmentId = sc.nextInt();
                    while (departmentId != 1 && departmentId != 2 && departmentId !=3){
                        System.out.println("Chỉ chọn 1 , 2 hoặc 3");
                        System.out.println("1: Phòng Project, 2: Phòng Business, 3: Phòng Technical");
                        departmentId = sc.nextInt();
                    }
                    Department department = null;
                    for (Department d: departmentList) {
                        if (d.getDepartmentId() == departmentId){
                            department = d;
                            break;
                        }
                    }
                    System.out.println("Nhập Vị trí chức vụ:");
                    String p = sc.nextLine();
                    String position = sc.nextLine();
                    Manager m = new Manager(userId, name, age, coefficientSalary, startWorkDay, dayOffNumber, department, position);
                    staffList.add(m);
                    for (Staff item : staffList) {
                        System.out.println(item.displayInformation());
                    }
                }

            }else if (answer == 5){
                System.out.println("Tìm kiếm thông tin nhân viên");
                System.out.println("Chọn 1 để tìm theo mã nhân viên");
                System.out.println("Chọn 2 để tìm theo tên");
                int choose = sc.nextInt();
                while (choose != 1 && choose != 2) {
                    System.out.println("Chỉ chọn 1 hoặc 2");
                    System.out.println("Chọn 1 để tìm theo mã nhân viên");
                    System.out.println("Chọn 2 để tìm theo tên");
                    choose = sc.nextInt();
                }
                if(choose == 1){
                    System.out.println("Nhập mã nhân viên cần tìm kiếm");
                    String userId = sc.next();
                    Staff itemFound = null;
                    for (Staff item: staffList) {
                        if (item.getUserId().equalsIgnoreCase(userId)){
                            itemFound = item;
                            break;
                        }
                    }
                    if (itemFound != null) {
                        System.out.println("Thông tin nhân viên tìm thấy theo mã");
                        System.out.println(itemFound.displayInformation());
                    }else{
                        System.out.println("Không tìm thấy mã nhân viên " + userId);
                    }
                }
                else if (choose == 2){
                    System.out.println("Nhập tên nhân viên cần tìm kiếm");
                    String n = sc.nextLine();
                    String name = sc.nextLine();
                    Staff itemFound = null;
                    for (Staff item: staffList) {
                        if (item.getName().equalsIgnoreCase(name)){
                            itemFound = item;
                            break;
                        }
                    }
                    if (itemFound != null) {
                        System.out.println("Thông tin nhân viên tìm thấy theo tên");
                        System.out.println(itemFound.displayInformation());
                    }else{
                        System.out.println("Không tìm thấy nhân viên tên là " + name);
                    }
                }

            }else if (answer == 6){
                System.out.println("Bảng lương nhân viên");
                System.out.println("---------------------------------------------------");
                System.out.println("Mã ID   Tên nhân viên      Bộ phận      Lương");
                System.out.println("---------------------------------------------------");
                for (Staff item : staffList) {
                    System.out.println(item.getUserId() + "      " + item.getName() +  "     " +item.getDepartment() + "     " + String.format("%.0f", item.calculateSalary()));

                }
                System.out.println();
            }else if (answer == 7) {
                System.out.println("Sắp xếp theo thứ tự nhân viên có lương: 1. Tăng dần;   2. Giảm dần");
                int choose = sc.nextInt();
                    while (choose != 1 && choose !=2){
                        System.out.println("Chỉ chọn 1 hoặc 2");
                        System.out.println("Sắp xếp theo thứ tự nhân viên có lương: 1. Tăng dần;   2. Giảm dần");
                        choose = sc.nextInt();
                    }
                    if(choose == 1){
                        System.out.println("---------------------------------------------------");
                        System.out.println("Mã ID   Tên nhân viên      Bộ phận      Lương");
                        System.out.println("---------------------------------------------------");
                        Collections.sort(staffList, (a, b)-> (int) (a.calculateSalary() - b.calculateSalary()));
                        for (Staff item: staffList) {
                            System.out.println(item.getUserId() + "      " + item.getName() +  "     " +item.getDepartment() + "     " + String.format("%.0f", item.calculateSalary()));
                        }
                    }else if(choose == 2){
                        System.out.println("---------------------------------------------------");
                        System.out.println("Mã ID   Tên nhân viên      Bộ phận      Lương");
                        System.out.println("---------------------------------------------------");
                    Collections.sort(staffList, (a, b)-> (int) (b.calculateSalary() - a.calculateSalary()));
                    for (Staff item: staffList) {
                        System.out.println(item.getUserId() + "      " + item.getName() +  "     " +item.getDepartment() + "     " + String.format("%.0f", item.calculateSalary()));
                    }
                }


            }
        }while (answer != 8);
    }




}
