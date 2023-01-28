import java.util.Random;
import java.util.Scanner;
public class NumberGuessing{
    public static void main(String args[]){
        System.out.println("Welcome to Number Guessing Game!! \nChoose a number between 1 to 100.\n            Best Luck !!");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int Computer = rand.nextInt(101);
        // System.out.println(Computer);
        System.out.println("Enter number of rounds you want :");
        int Rounds = sc.nextInt();
        System.out.println("Guess number between 0-100 : ");
        int User = sc.nextInt();
        int count=1;
        while(true){
            if(User != Computer){
                if(User>Computer){
                    if (count>=Rounds){
                        System.out.println("*** Sorry you failed to guess the number ***");
                        System.out.println("The number was "+Computer);
                        System.out.println("Do you want to play again (Yes/No) :");
                        String str = sc.nextLine();
                        if(str.equals("Yes")){
                            continue;
                        }else{
                            break;
                        }
                    }
                    System.out.println("You are near enter smaller number :");
                    User = sc.nextInt();
                    count++;
                    continue;
                }
                else if(User<Computer){
                    if (count>=Rounds){
                        System.out.println("*** Sorry you failed to guess the number ***");
                        System.out.println("The number was "+Computer);
                        System.out.println("Do you want to play again ?? (Yes/No) :");
                        String str = sc.nextLine();
                        if(str.equals("Yes")){
                            continue;
                        }else{
                            break;
                        }
                    }
                    System.out.println("You are near enter greater number :");
                    User = sc.nextInt();
                    count++;
                    continue;
                }
            }
            else{
                System.out.println("*** You have Guesssed the number correctly in "+count+" guesses ***");
                System.out.println("Do you want to play again (Yes/No) :");
                String str = sc.nextLine();
                if(str.equals("Yes")){
                    continue;
                }else{
                    break;
                }
            }
        }
    }
}
