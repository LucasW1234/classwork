import java.util.Scanner;
/**
 * 
 *
 * Lucas W.
 * 9/16/22
 */
public class Madlibs
{
    private static int getMyInput(String msg) {
        int returnValue = 0;
        Boolean valid = false;
        Scanner input = new Scanner(System.in);
        
        do {
            try {
                System.out.println (msg);
                returnValue = input.nextInt();
                valid = true;
            }
            catch(Exception e) {
                 System.out.println ("ERROR! " + e.toString() + " TRY AGAIN!"); 
                 input.nextLine();
            }
        } while (valid != true);
        
        return returnValue;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        String name,adjective1,adjective2,adjective3,animal,noun1,adjective4,food,verb,noun2,adverb,adjective5,noun3,noun4;
        int month, day, year;
        
        //inputs
        System.out.println ("please enter your name");
        name=scanner.nextLine();
        month = getMyInput ("please enter the current month");
        day = getMyInput ("please enter the current day");
        year = getMyInput ("please enter the current year");
        System.out.println ("give me an adjective");
        input.nextLine();
        adjective1 = scanner.nextLine();
        System.out.println ("give me another adjective");
        adjective2 = scanner.nextLine();
        System.out.println ("give me another adjective");
        adjective3 = scanner.nextLine();
        System.out.println ("give me an animal");
        animal = scanner.nextLine();
        System.out.println ("give me a noun");
        noun1= scanner.nextLine();
        System.out.println ("give me an adjective");
        adjective4 = scanner.nextLine();
        System.out.println ("give me a food");
        food = scanner.nextLine();
        System.out.println ("give me a verb");
        verb = scanner.nextLine();
        System.out.println ("give me a noun");
        noun2= scanner.nextLine();
        System.out.println ("give me an adverb");
        adverb = scanner.nextLine();
        System.out.println ("give me an adjective");
        adjective5 = scanner.nextLine();
        System.out.println ("give me a noun");
        noun3= scanner.nextLine();
        System.out.println ("give me another noun");
        noun4= scanner.nextLine();
        String trick = ("trick or treat, smell my "+noun4+"!");

        
        //madlibs output
        System.out.println (name+" "+month+"/"+day+"/"+year);
        System.out.println ("One"+adjective1+", "+adjective2+" night, no stars in sight.");
        System.out.println ("Thunder roared a "+adjective3+" hello; lightning flashed the trees below");
        System.out.println ("The sound of a "+animal+" could be heard in the distance");
        System.out.println ("It was Halloween night. I was dressed as a "+noun1+".");
        System.out.println ("My bag was beside me filled with "+adjective4+food+" that I couldn't wait to eat.");
        System.out.println ("As I "+verb+" up the driveway of a house to trick or treat, I wonder what type of "+noun2+" I will get");
        System.out.println ("I ring the doorbell with "+adverb+".");
        System.out.println ("It opens and a "+adjective5+" man wearing a "+noun3+" looks at me.");
        System.out.println ("I scream "+trick);
        
        
        
        
    }
    
}
