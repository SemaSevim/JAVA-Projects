import java.util.Scanner;
public class Greengrocer {

    public static void main(String[] args){
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;
   

    Scanner inp = new Scanner(System.in);

    System.out.print("pear Kg:");
    double pearKG = inp.nextDouble();
    System.out.print("apple Kg:");
    double appleKG = inp.nextDouble();
    System.out.print("tomato Kg:");
    double tomatoKG = inp.nextDouble();
    System.out.print("banana Kg:");
    double bananaKG = inp.nextDouble();
    System.out.print("eggplant Kg:");
    double eggplantKG = inp.nextDouble();

    double totalPrice= (pearKG*pearPrice) +(appleKG*applePrice) + (tomatoKG * tomatoPrice) + (bananaKG* bananaPrice) + (eggplantKG*eggplantPrice);
    System.out.print("Total price:" +totalPrice);

    
} }
