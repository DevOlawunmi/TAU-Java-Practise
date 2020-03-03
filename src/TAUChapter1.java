import java.util.Scanner;

public class TAUChapter1
{
    public static void main(String[] args)
    {/*Get the number of hours worked
    2. Get the hourly pay rate
    3. Multiply pay by hours
    4. Display result
    */
System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();
        System.out.println("How much do you earn per hour?");
        double hourlyRate = scanner.nextDouble();
        double grossPay = hoursWorked * hourlyRate;
        System.out.println("You have earned £" +
                grossPay);
    }
}
