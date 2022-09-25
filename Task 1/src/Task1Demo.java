public class Task1Demo {
    public static void main(String[] args) {
        //Creating instances for the classes
        Employee workerOne = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1, 16.50);
        Employee workerTwo = new ProductionWorker("Joan Jones", "222-L", "12-12-2005", 2, 18.50);

        //Outputing the toString methods from the classes
        System.out.println("The first production " + workerOne);
        System.out.println("The second production " + workerTwo);
    }
}
