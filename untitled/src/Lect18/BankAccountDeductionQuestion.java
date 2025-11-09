package Lect18;

import java.util.Scanner;

public class BankAccountDeductionQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Integer.parseInt();  // This Convert String to Integer
        int bankBalance = 1000;
        int orig = bankBalance;
      if(bankBalance > 0){
          while (bankBalance > 0){
              String enteredAmount = sc.nextLine();
//              System.out.println(enteredAmount);
              if(enteredAmount.equals("exit")){  // .equals is used to compare strings
                  break;
              }  else if (bankBalance > Integer.parseInt(enteredAmount)) {
                  bankBalance = bankBalance -  Integer.parseInt(enteredAmount);
                  System.out.println("Amount Withdrawl - "+enteredAmount);
              } else{

                  if(Integer.parseInt(enteredAmount) > bankBalance){
                      System.out.println("Out of Balance Amount");
                      break;
                  }
              }


//              break;
          }
      }

        System.out.println("Bank Balance Amount Left - "+bankBalance);

    }
}
