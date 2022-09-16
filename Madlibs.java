import java.util.Scanner;
/**
 * 
 *
 * Lucas W.
 * 9/16/22
 */
public class Madlibs
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        String name,noun,pluralNoun,verb,bodyPart,adjective,pluralNoun2, adjective2;
        int month, day, year;
        
        System.out.println ("please enter your name");
        name=scanner.nextLine();
        System.out.println ("please enter the current month");
        month = scanner.nextInt();
        System.out.println ("please enter the current day");
        day = scanner.nextInt();
        System.out.println ("please enter the current year");
        year = scanner.nextInt();
        
        System.out.println (name+" "+month+"/"+day+"/"+year);
    }
}
