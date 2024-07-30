 class Employee {
    int employeeId;
    String name;
    String position;
    double  salary;
    
    public Employee(int employeeId,String name,String position, int salary)
    {
        this.employeeId=employeeId;
        this.name=name;
        this.position=position;
        this.salary=salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Employee_Management{
    private Employee[] employees;
    int size=0;
    public Employee_Management(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee){
        if(size<employees.length){
            employees[size]=employee;
            size++;
        }}
    public Employee searchEmployee(int employeeId){
        for(int i=0;i<size;i++){
            if(employees[i].getEmployeeId()==employeeId){
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployee(){
        for(int i=0;i<size;i++){
            System.out.println(employees[i]);
        }
    }

   // public void deleteEmployee(int employeeId ){


    //}

    public static void main(String[] args) {
        Employee_Management ems = new Employee_Management(5);

        Employee e1 = new Employee(1, "Sumit", "Developer", 85000);
        Employee e2 = new Employee(2, "Pranay", "Manager", 55000);
        Employee e3 = new Employee(3, "mihir", "Designer", 60000);

        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        System.out.println("Employees after adding:");
        ems.traverseEmployee();

        System.out.println("Search for employee with ID 2:");
        System.out.println(ems.searchEmployee(2));


    }
}

