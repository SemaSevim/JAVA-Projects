import java.util.Scanner;
public class PythagoreanTheorem {
    public static void main(String[] args){

        int edge1, edge2;
        double hypotenuse;

         Scanner input = new Scanner(System.in);
         System.out.print("Enter the first edge value: ");
         edge1 = input.nextInt();

         System.out.print("Enter the second edge value: ");
         edge2 = input.nextInt();

         hypotenuse = Math.sqrt((edge1*edge1) + (edge2*edge2));

         System.out.println("Hypotenuse : " +hypotenuse);


    }
}
