import java.util.*;


public class Sammy{
   
      public static void main(String[] args){
         
         Scanner scan = new Scanner(System.in);
         
         System.out.println("How long is the rent?: ");
         int rent = Integer.parseInt(scan.nextLine());
      
         System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
         System.out.println("S Sammy's make it fun in the sun. S");
         System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
         compute(rent);
         scan.close();
      }
      
      public static int compute(int rent){
      
         int hours = rent / 60;
         int additionalMinutes = rent % 60;
         
         int totalPrice = (hours * 40) + additionalMinutes;
      
      
         System.out.println("Hours: " + hours);
         System.out.println("Additional Minutes: " + additionalMinutes);
         System.out.println("Total Cost: $" + totalPrice);
         
         return totalPrice;
      }
      
   }