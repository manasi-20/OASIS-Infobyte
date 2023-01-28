import java.util.Scanner;

public class ATM {
    public static void main(String args[]){

        String id1 = "Manak";
        int Pin1 = 123; 
        int Balance_of_Manak = 1000;
        int Withdraw_by_Manak = 500;
        int Deposit_by_Manak = 400;

        String id2 = "Roma";
        int Pin2 = 101; 
        int Balance_of_Roma = 6000;
        int Withdraw_by_Roma = 50;
        int Deposit_by_Roma = 0;

        System.out.println("*** WELCOME TO ATM ***");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your userid :");
        String Userid = sc.nextLine();
        System.out.println("Enter your pin :");
        int UserPin = sc.nextInt();
    
        if(Userid.equals(id1) && UserPin==Pin1){
            while(true){
                System.out.println("Press 0 for Checking balance");
                System.out.println("Press 1 for Transaction History");
                System.out.println("Press 2 for Withdraw");
                System.out.println("Press 3 for Deposit");
                System.out.println("Press 4 for Transfer");
                System.out.println("Press 5 for Quit");
                int choice = sc.nextInt();

                switch(choice){
                    case(0):
                    System.out.println("Your balance is :"+Balance_of_Manak);
                    break;

                    case(1):
                    System.out.println("Your account history is ");
                    System.out.println("Withdraw Amount :"+Withdraw_by_Manak);
                    System.out.println("Deposit Amount :"+Deposit_by_Manak);
                    break;
                    case(2):
                    System.out.println("Enter Withdraw Amount :");
                    int withdraw = sc.nextInt();
                    if(Balance_of_Manak>=withdraw){
                        Balance_of_Manak = Balance_of_Manak - withdraw;
                        System.out.println("*** Transaction successful please collect your money ***");
                        System.out.println("Your new balance is "+Balance_of_Manak);
                    }else{
                        System.out.println("*** Opps you don't have sufficient fund in your account !! ***");
                    }
                    break;

                    case(3):
                    System.out.println("Enter deposit amount :");
                    int deposit = sc.nextInt();
                    Balance_of_Manak = Balance_of_Manak + deposit;
                    System.out.println("*** Your money has been deposited successfully ***");
                    System.out.println("Your new balance is "+Balance_of_Manak);
                    break;

                    case(4):
                    System.out.println("Enter Userid to which you want to transfer your money :");
                    String id = sc.nextLine();
                    System.out.println("Enter amount to be transfered :");
                    int amt = sc.nextInt();
                    if(amt<=Balance_of_Manak){ 
                        if(id==id2){
                            Balance_of_Manak = Balance_of_Manak-amt;
                            Balance_of_Roma = Balance_of_Roma+amt;
                            System.out.println("*** Your money has been transfered successfully ***");
                            System.out.println("Your new balance is "+Balance_of_Manak);
                        }else{
                            System.out.println("*** Incorrect user id ***");
                        }
                    }else{
                        System.out.println("*** Opps you don't have sufficient fund in your account !! ***");
                    }
                    break;
                    
                    case(5):
                    System.out.println("*** Thankyou visit again :) ***");
                    System.exit(0);
                }
            }
        }
        else if(Userid.equals(id2) && UserPin==Pin2){
                while(true){
                    System.out.println("Press 0 for Checking balance");
                    System.out.println("Press 1 for Transaction History");
                    System.out.println("Press 2 for Withdraw");
                    System.out.println("Press 3 for Deposit");
                    System.out.println("Press 4 for Transfer");
                    System.out.println("Press 5 for Quit");
                    int choice = sc.nextInt();

                    switch(choice){
                        case(0):
                        System.out.println("Your balance is :"+Balance_of_Manak);
                        break;

                        case(1):
                        System.out.println("Your account history is ");
                        System.out.println("Withdraw Amount :"+Withdraw_by_Roma);
                        System.out.println("Deposit Amount :"+Deposit_by_Roma);
                        break;
                        case(2):
                        System.out.println("Enter Withdraw Amount :");
                        int withdraw = sc.nextInt();
                        if(Balance_of_Roma>=withdraw){
                            Balance_of_Roma = Balance_of_Roma - withdraw;
                            System.out.println("*** Transaction successful please collect your money ***");
                            System.out.println("Your new balance is "+Balance_of_Roma);
                        }else{
                            System.out.println("*** Opps you don't have sufficient fund in your account !! ***");
                        }
                        break;

                        case(3):
                        System.out.println("Enter deposit amount :");
                        int deposit = sc.nextInt();
                        Balance_of_Roma = Balance_of_Roma + deposit;
                        System.out.println("*** Your money has been deposited successfully ***");
                        System.out.println("Your new balance is "+Balance_of_Roma);
                        break;

                        case(4):
                        System.out.println("Enter Userid to which you want to transfer your money :");
                        String id = sc.nextLine();
                        System.out.println("Enter amount to be transfered :");
                        int amt = sc.nextInt();
                        if(amt<=Balance_of_Roma){ 
                            if(id==id1){
                                Balance_of_Roma = Balance_of_Roma-amt;
                                Balance_of_Manak = Balance_of_Manak+amt;
                                System.out.println("*** Your money has been transfered successfully ***");
                                System.out.println("Your new balance is "+Balance_of_Roma);
                            }else{
                                System.out.println("*** Incorrect user id ***");
                            }
                        }else{
                            System.out.println("*** Opps you don't have sufficient funds in your account !! ***");
                        }
                        break;

                        case(5):
                        System.out.println("*** Thankyou visit again :) ***");
                        System.exit(0);
                    }
            }
        }
    }
}
