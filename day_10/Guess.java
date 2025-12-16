package day_10;
import java.util.Scanner;
public class Guess{
    double number;
    public Guess (double number){
        this.number=number;
    }     
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         int number;
         Guess g = new Guess(50);
         System.out.println("Enter a number");
         int UserGuess = sc.nextInt();
         if(UserGuess<g.number){
            System.out.println("Too Low");
         }
         else if(UserGuess>g.number){
            System.out.println("Too High");
         }
         else{
            System.out.println("Correct Guess!");
         }
         sc.close();
    }
}
