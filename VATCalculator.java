import java.util.Scanner;
public class VATCalculator {
    public static void main(String[] args){

        double amount, vatAmount, amountInVat, vatRate1=0.18, vatRate2= 0.08;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the amount:");

        amount= inp.nextDouble();

        if(amount >0 && amount <= 1000){
             vatAmount = amount * vatRate1;
             amountInVat = amount + vatAmount;
             System.out.println("VAT rate : " +vatRate1);
        }

        else {
             vatAmount = amount * vatRate2;
             amountInVat = amount + vatAmount;
             System.out.println("VAT rate : " +vatRate2);

        }

        System.out.println("VAT amount : " +vatAmount);
        System.out.println("Amount including VAT : " + amountInVat);





        
    



    }


    
}
