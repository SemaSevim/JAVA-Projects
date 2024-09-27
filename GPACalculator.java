import java.util.Scanner;
public class GPACalculator{
    public static void main(String[] args){
        
        int math, physics, chemi, eng, hist, music;

        Scanner input = new Scanner(System.in);
        System.out.print("Math grade:");
        math= input.nextInt();

        System.out.print("Physics grade:");
        physics= input.nextInt();

        System.out.print("Chemistry grade:");
        chemi= input.nextInt();

        System.out.print("English grade:");
        eng= input.nextInt();

        System.out.print("History grade:");
        hist= input.nextInt();

        System.out.print("Music grade:");
        music= input.nextInt();

        double average;

        average = (math+ physics + chemi + eng + hist + music) / 6;

        System.out.println("Your GPA " +average);

        if (average >=60){
            System.out.println("Successful");
        }
        else System.out.println("Unsuccessful");

    }
    
}
    

