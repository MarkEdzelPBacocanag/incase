import java.util.*;

public class  Carly{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      
      System.out.println("How many guest?: ");
      int guest = Integer.parseInt(scan.nextLine());
   
      System.out.println("*************************************");
      System.out.println("* Carly's makes the food that makes *");
      System.out.println("*             it a party            *");
      System.out.println("*************************************");
      int totalPrice = compute(guest);
            if(guest >= 50){
      
        System.out.println("Large Event");
      
      } else {
      
         System.out.println("Not large Event");
         
      }
      scan.close();
   }
   
   public static int compute(int guest){
      
      int totalPrice = guest * 35;
      System.out.println("Total Cost: $" + totalPrice);
      
      return totalPrice;
   }

   
}