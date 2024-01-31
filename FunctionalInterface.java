import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class FunctionalInterface {
    // finding the given number is +ve or not.
    //Predicate
    public static void main(String [] args){

        // this is implemented for the future usage
        List<Employee> arr = new ArrayList<Employee>();

        arr.add(new Employee("Yashwanth",48,600000.0));
        arr.add(new Employee("Sujith",40,600000.0));
        arr.add(new Employee("Gurunanthan",90,5000000.0));



        //Given number is positive or not.
        Predicate<Integer> isPos = (n)->n>0;

        //uppercase
        Function<String,String> Camelcase =(s1)->s1.toUpperCase();


        //substring.
        BiFunction<String,String,String> substring = (S1,S2)-> String.valueOf(S1.contains(S2));


        //Check whether the given number is prime or not.
        Predicate<Double>isprime = (number)->{
            boolean retVal = true;
            for(int i=2;i<number/2;i++){
                if(number%i==0){
                    retVal=false;
                }
            }
            return retVal;
        };


        // increment in the employee salary by 10%
        Function<Employee,Double>salary = (s)->{
            Employee emp = (Employee) s;
            Double amount = emp.getSalary();
            return amount+(amount*(10/100));
        };

        //check whether the salary of the person is greater than 10000
        Predicate<Employee> SalaryChecker = (salaryVal)->{
//            Employee emp = (Employee) salaryVal;
            Double amount = salaryVal.getSalary();
            return amount>100000;
        };

        //Get the company address from the
        Supplier<String> address = ()->"Elcot sez shollinganallur";


        // print the details of the Employee
        Consumer<List<Employee>> printDetails = (details)->{

            for(Employee emp: details){
                System.out.println("Name:"+emp.getName()+"Id: "+emp.getId()+"Salary: "+emp.getSalary());
            }
        };



        // Employee with high salary.


        Consumer<List<Employee>> highSalary = (arrvalues)->{
//            Double salaryValue = 0.0;
//            for(Employee in:salaryList){
//                salaryValue = salaryList.getLast().salary;
//            }
            Collections.sort(arrvalues);
            System.out.println(arrvalues.getLast().getName());
        };
        highSalary.accept(arr);

        //sorting the list by any order
        //just changing in the employee.java file enough





    }
}
