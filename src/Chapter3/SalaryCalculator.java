package Chapter3;

import java.util.Scanner;

public class SalaryCalculator
{

    /*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/
    
public static void main(String arg[]) {
    int salary = 1000;
    int bonus = 250;
    int quota = 10;
    System.out.println("Please enter number of sales");
    Scanner scanner = new Scanner(System.in);
    int sales = scanner.nextInt();
    scanner.close();

    if(sales > quota){
        salary = salary + bonus;
    }

    System.out.println("The employee's pay is $" + salary);



}


}
