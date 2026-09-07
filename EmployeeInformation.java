public class EmployeeInformation {
     public static void main(String[] args) {
        class Employee {
            String empNo;
            String empName;
            String joinDate;
            String desigCode;
            String department;
            int basic;
            int hra;
            int it;


            public Employee(String empNo, String empName, String joinDate, String desigCode, String department, int basic, int hra, int it) {
                this.empNo = empNo;
                this.empName = empName;
                this.joinDate = joinDate;
                this.desigCode = desigCode;
                this.department = department;
                this.basic = basic;
                this.hra = hra;
                this.it = it;
            }
        }
        String[][] employee = {
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };

        for (String[] emp : employee) {
            String empNo = emp[0];
            String empName = emp[1];
            String desigCode = emp[3];
            String department = emp[4];
            int basic = Integer.parseInt(emp[5]);
            int hra = Integer.parseInt(emp[6]);
            int it = Integer.parseInt(emp[7]);
            
            int da = 0;
            String designation = " ";
            
            switch (desigCode) {
                case "e" -> {
                    designation = "Engineer";
                    da = 20000;
                }
                case "c" -> {
                    designation = "Consultant";
                    da = 32000;
                }
                case "k" -> {
                    designation = "Clerk";
                    da = 12000;
                }
                case "r" -> {
                    designation = "Receptionist";
                    da = 15000;
                }
                case "m" -> {
                    designation = "Manager";
                    da = 40000;
                }
            }

            int salary = basic + hra + da - it;

           
            System.out.printf("%-10s %-15s %-15s %-15s %-10d%n", empNo, empName, department, designation, salary);
        }
    
        // Same code using object-oriented approach
        System.out.println("\nUsing Object-Oriented Approach:\n");  
        Employee employees[] = new Employee[7];

        employees[0] = new Employee("1001", "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000);
        employees[1] = new Employee("1002", "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000);
        employees[2] = new Employee("1003", "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000);
        employees[3] = new Employee("1004", "Chahat", "29/01/2013", "r", "Front Desk", 12000, 6000, 2000);
        employees[4] = new Employee("1005", "Ranjan", "16/07/2005", "m", "Engg", 50000, 20000, 20000);
        employees[5] = new Employee("1006", "Suman", "1/1/2000", "e", "Manufacturing", 23000, 9000, 4400);
        employees[6] = new Employee("1007", "Tanmay", "12/06/2006", "c", "PM", 29000, 12000, 10000);    

        System.out.println("Enter the employee number:");
         try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
             String inputEmpNo = scanner.nextLine();
             
             Employee selectedEmployee = null;
             for (Employee emp : employees) {
                 if (emp.empNo.equals(inputEmpNo)) {
                     selectedEmployee = emp;
                     break;
                 }
             }
             
             if (selectedEmployee != null) {
				 // giving it a formatted look
				 System.out.printf("%-10s %-15s %-15s %-15s %-10s %-15s%n", "Emp No", "Emp Name", "Department", "Designation", "Salary","Join Date");
				 System.out.println("------------------------------------------------------------------------------------------");
				System.out.printf("%-10s %-15s %-15s %-15s %-10d %-15s%n", selectedEmployee.empNo, selectedEmployee.empName, selectedEmployee.department, selectedEmployee.desigCode, selectedEmployee.basic + selectedEmployee.hra + (selectedEmployee.desigCode.equals("e") ? 20000 : selectedEmployee.desigCode.equals("c") ? 32000 : selectedEmployee.desigCode.equals("k") ? 12000 : selectedEmployee.desigCode.equals("r") ? 15000 : selectedEmployee.desigCode.equals("m") ? 40000 : 0) - selectedEmployee.it,selectedEmployee.joinDate);


             } else {
                 System.out.println("Employee not found.");
             }}

    }
}
