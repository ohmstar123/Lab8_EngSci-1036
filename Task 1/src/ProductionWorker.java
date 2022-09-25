public class ProductionWorker extends Employee{

    //Declare variables
    private int shift;
    private double payRate;
    public final int DAY_SHIFT = 1;
    public final int NIGHT_SHIFT = 2;
    String sunOrMoon;

    //Constructor
    public ProductionWorker(String n, String num, String date, int sh, double rate){
        super(n, num, date);
        shift = sh;
        payRate = rate;
    }

    //Constructor
    public ProductionWorker(){

    }

    //Public void method to set the shift
    public void setShift(int s){
        shift = s;
    }

    //Public void method to set the pay rate
    public void setPayRate(double p){
        payRate = p;
    }

    //Public int method to get the shift
    public int getShift(){
        if (shift == DAY_SHIFT)
            return 1;
        else
            return 2;
    }

    //Public double method to get the pay rate
    public double getPayRate(){
        return payRate;
    }

    //Public string method to return the string
    public String toString(){
        if (shift == 1)
        {
            sunOrMoon = "Day";
        }
        else{
           sunOrMoon = "Night";
        }
        return super.toString() + "\nShift: " + sunOrMoon + "\nHourly Pay Rate: " + String.format("%.2f\n", getPayRate());
    }

}
