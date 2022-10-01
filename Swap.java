public class Swap {
    public static void main(String[] args) {
        int SalaryOfMarriam = 20000;
        int SalaryOfBabar = 25000;
        System.out.println("Salary of Marriam before swapping: " + SalaryOfMarriam);
        System.out.println("Salary of Babar before swapping: " + SalaryOfBabar);
        SalaryOfBabar = SalaryOfMarriam + SalaryOfBabar;
        SalaryOfMarriam = SalaryOfBabar - SalaryOfMarriam;
        SalaryOfBabar=SalaryOfBabar-SalaryOfMarriam;
        System.out.println("Salary of Marriam after swapping: " + SalaryOfMarriam);
        System.out.println("Salary of Babar after swapping: " +SalaryOfBabar);}}
