import java.util.Objects;
public class Employee {
    private static int countID;
    private String middleName;
    private String firstName;
    private String lastName;
    private int department;
    private int salary;
    private int id;
    public Employee (String middleName, String firstName, String lastName, int department, int salary) {
        this.id=countID++;
        this.middleName = middleName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department=department;
        this.salary=salary;

    }
    @Override
    public String toString() {
        return "|ID сотрудника - ("+
                this.id + ")|"+
                "Ф.И.О. сотрудника - ("+
                this.middleName + " "+
                this.firstName + " "+
                this.lastName + ")|"+
                "Отдел № ("+
                this.department + ")|"+
                "Зарплата сотрудника - ("+
                this.salary +")|";
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(middleName, employee.middleName) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(middleName, firstName, lastName, department, salary, id);
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getDepartment(){
        return this.department;
    }
    public int getSalary(){
        return this.salary;
    }
    public int getId() {
        return this.id;
    }
    public void setDepartment(int department){
        this.department = department;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setId(int id) {
        this.id=id;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
}
