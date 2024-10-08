import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int r = inp.nextInt();
        double area = pi * r * r;
        System.out.println("Area of the circle: " +area); 
        
        double circum = 2* pi * r ;
        System.out.println("Circumference of the circle:" +circum);


        




    }
    
}
