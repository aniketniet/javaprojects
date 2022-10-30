package atm;

import java.lang.StackWalker.Option;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        atmfun atm = new atmfun();
        atm.option();
    }
}

class atmfun{

    int bal =0;

   public void option()
    {
        System.out.println("Welcome to Kotak Bank ATM.");
        System.out.println("Select a option.....");
        System.out.println("1 - View Balance.");
        System.out.println("2 - Deposit Money.");
        System.out.println("3 - Widrawl Money.");
        System.out.println("0 - Exit");

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        switch(op)
        {
            case 1:
            viewbalnce();
            break;

            case 2:
            deposit();
            break;

            case 3:
            widraw();

            case 0:
            break;

            default:
            System.out.println("Choose Correct option");
            this.option();
        }
    }
    public void viewbalnce()
    {
        System.out.println("Your Balance is = $"+bal);
        option();
    }
    public void deposit()
    {
        System.out.println("Please Enter the ammount.");
        Scanner sc = new Scanner(System.in);
        int dep = sc.nextInt();
        bal = bal+dep;
        System.out.println("Blance is Deposit.");
        System.out.println("New balance is = $"+bal);
        option();
    }
    public void widraw()
    {
        System.out.println("Enter Ammount to widraw.");
        Scanner sc=new Scanner(System.in);
        int wid = sc.nextInt();

        if(wid>bal)
        {
            System.out.println("Insuician Balance, Your Blance is = $"+bal);
            option();
        }
        else{

            bal = bal -wid;
            System.out.println("Widral Success, New Blance is = $"+bal);
            option();
        }
    }
}
