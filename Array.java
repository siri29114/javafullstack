import java.util.ArrayList;
import java.util.Scanner;

class Array
 {
    public static void main(String[] args)
 {
       

        Scanner scanner = new Scanner(System.in);

        

        ArrayList<String> names = new ArrayList<>();

      
        System.out.print("How many names do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine(); 


        for (int i = 0; i < count; i++) 
{
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

     
        System.out.println("\nNames you entered:");
        for (String name : names)
 {
            System.out.println(name);
        }

        scanner.close();
    }
}
