package day_3;

import java.util.Scanner;

class bank{
    Scanner sc=new Scanner(System.in);

    private double bal=50000;
    private String pwd="Ankur";
    public void deposit(){
        System.out.println("Enter your password..");
        String a=sc.next();
        if(a.equals(pwd)){
            System.out.print("Enter amount to be deposit : ");
            double amt=sc.nextDouble();
            if(amt>0){
            bal=bal+amt;
            System.out.println("deposited amount is "+amt);
            System.out.println("Total balance is "+bal);
            System.out.println("thanks for choosing Us..."); 
            }
            else{
                System.out.println("Invalide amount!!");
            }
        }
        else{
            System.out.println("wrong password!!!!");
        }
    }
    public void withdraw(){
        System.out.println("Enter your password..");
        String a=sc.next();
        if(a.equals(pwd)){
            System.out.print("Enter the amount to be withhdraw..");
            double amt=sc.nextDouble();
            if(amt<=bal){
            bal=bal-amt;
            System.out.println("Withdraw amount is "+amt);
            System.out.println("Remain balance is "+bal);
            System.out.println("thanks for choosing Us...");
            }
            else{
                System.out.println("Insufficientn balance !!!!");
            }
        }
        else{
            System.out.println("wrong password!!!!");
        }
        
    }
    public void balance(){
        System.out.println("Enter your password..");
        String a=sc.next();
        if(a.equals(pwd)){
            System.out.println("Remain balance is "+bal);
            System.out.println("thanks for choosing Us...");
        }
        else{
            System.out.println("wrong password!!!!");
        }
        
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bank b= new bank();
        System.out.println("1.View balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("Enter your Choice");
        int choice =sc.nextInt();

        switch(choice){
            case 1:
            b.balance();
            break;
            case 2:
            b.deposit();
            break;
            case 3:
            b.withdraw();
            break;
            default:
            System.out.println("Invalide Choice!!!");
        }
    }
    
}
