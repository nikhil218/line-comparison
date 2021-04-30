import java.util.Scanner;

public class line{
   public double length_of_line(){

      Scanner obj = new Scanner(System.in);
      double x1, x2, y1, y2;
      double length_of_line = 0.0;

      System.out.println("Enter x1 value : ");
      x1 = obj.nextDouble();

      System.out.println("Enter y1 value : ");
      y1 = obj.nextDouble();

      System.out.println("Enter x2 value : ");
      x2 = obj.nextDouble();

      System.out.println("Enter y2 value : ");
      y2 = obj.nextDouble();

      length_of_line = Math.sqrt( (Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)) );
      return length_of_line;
   }

   public static void main(String[] args){

      System.out.println("Welcome to Line Comparison Computation Program");

      line l = new line();
      System.out.println("Enter First Line Co-ordinates : ");
      double first_line = l.length_of_line();
      System.out.println("Length of first line is : " + first_line);

      System.out.println("Enter second Line Co-ordinates : ");
      double second_line = l.length_of_line();
      System.out.println("Length of first line is : " + second_line);

      String first=Double.toString(first_line);
      String second=Double.toString(second_line);

      if(first.equals(second))
      {
         System.out.println("First line length is equals  to Second line");
      }
      else
      {
          System.out.println("Both lines are not of equal lengths");
      }

   }
}
