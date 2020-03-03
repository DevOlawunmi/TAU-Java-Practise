package TAULectures;

import java.util.Scanner;

public class MadLibs
{public static void main(String arg[])

{System.out.println("Enter an adjective");
    Scanner scanner = new Scanner(System.in);
    String adjective  = scanner.next();
    System.out.println("What season of the year is it?");
    String season = scanner.next();
    System.out.println("Enter a whole number");
    int wholeNumber = scanner.nextInt();
System.out.println("On a"+ " "+ adjective +" "+ season+ " day ,"+" I drink a minimum of "+ wholeNumber +" cups of coffee");
};
}
