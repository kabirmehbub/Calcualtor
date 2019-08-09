/*
@author: Kabir Mehboob Alam
*/
 import java.util/.Scanner;

 public class Claculator{

    public static void main(String[] args) {

        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");
        /*Now we will be using data type 'double'
        so that user can enter a integer as well as floating point value
        */
        num1 = scanner.nextDouble();
        System.out .println("Enter Second number");
        num2 = scanner.nextDouble();
        
        
        System.out.println("Enter an operator (+, -, *, /);");
        char operator = scanner.next().charArt(0);

        scanner.close();
        double output;


        switch(operator)
        {
            case '+':
               output = num1 + num2;
               break;

            case '-':
              output = num1 - num2;
              break;

            case '*':
              output = num1 * num2;
              break;            

            case '/':
              output = num1 / num2;
              break;

              /*So after adding all the cases, if user puts 
              any invalid operator we must show that an error message */

              default:
              System.out.println("You have entered an Invalid operation");

        }

            System.out.println(num1+," ",+operator," ""+num2+": "+output");
    }
 }