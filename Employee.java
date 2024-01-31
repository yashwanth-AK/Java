import java.util.Comparator;

public class Employee implements Comparable {
    String name;
    Integer id;
    Double salary;
    public Employee(String name,Integer id,Double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee) o;
        return this.salary.compareTo(emp.getSalary());
    }



}
