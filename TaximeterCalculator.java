import java.util.Scanner;;
public class TaximeterCalculator {

    public static void main(String[] args){
        int km, total=10;
        double perKm =2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("enter the distance in km:");
        km = input.nextInt();

        total += (perKm * km );
        total = (total <= 20) ? 20 : total;

        System.out.println("Total Price: " +total);   

    }
    
}
