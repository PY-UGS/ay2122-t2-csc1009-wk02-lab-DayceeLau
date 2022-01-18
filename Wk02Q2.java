import java.util.Scanner;

public class Wk02Q2 
{
   public static void main(String[] args) 
   {
       Scanner scan = new Scanner(System.in);
       
       double[] numbers = new double[4];
       System.out.print("Enter three numbers: ");

       for(int i=0; i<3; i++)
       {
           numbers[i] = scan.nextDouble();
       }

       numbers[3] = (numbers[0]+numbers[1]+numbers[2])/3;
       
       System.out.print("The average of " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " is "
       + numbers[3]);
   } 
}
