public class Employee {

    //Declare Variables
    private String name;
    private String employeeNumber;
    private String hireDate;

    //Constructor
    public Employee(String n, String num, String date){
        name = n;
        employeeNumber = num;
        hireDate = date;
    }

    //Constructor
    public Employee(){

    }

    //Public void method to set the name
    public void setName(String n){
        name = n;
    }

    //Public void method to set the employee number
    public void setEmployeeNumber(String e){
        employeeNumber = e;
    }

    //Public void method to set the hiring date
    public void setHireDate(String h){
        hireDate = h;
    }

    //Public string method to get the name
    public String getName(){
        return name;
    }

    //Public string method to get the employee number
    public String getEmployeeNumber(){
        return employeeNumber;
    }

    //Public string method to get the hiring date
    public String getHireDate(){
        return hireDate;
    }

    //Private boolean method to check if the employee number is valid
    private boolean isValidEmpNum(String e){
        return true;
    }

    //Public string method to return the string
    public String toString(){
        return "\nName: " + getName() + "\nEmployee Number: " + getEmployeeNumber() + "\nHire Date: " + getHireDate();
    }


}
