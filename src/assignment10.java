/**
 * Morgan Norwood
 *
 * Chapter 10 Exercise 5:
 *
 *      (Displaying the prime factors)
 *      Write a program that prompts the user to enter a positive integer
 *      and displays all its smallest factors in decreasing order.
 *      For example, if the integer is 120, the smallest factors are
 *      displayed as 5, 3, 2, 2, 2. Use the StackOfIntegers class to store
 *      the factors (e.g., 2, 2, 2, 3, 5)
 *      and retrieve and display
 *

 */
import java.util.Stack;
import java.util.Scanner;


    public class assignment10 {
        public static void main(String[] args) {

            System.out.print("Enter a positive integer: ");
            int num = new Scanner(System.in).nextInt();

            Stack stack = new Stack();

            int factor = 2;
            //checking num is greater than 2
            while (factor <= num) {
                //checking value is even
                if (num % factor == 0) {
                    //adding all factors to stack
                    stack.push(factor);
                    //updating num
                    num /= factor;
                    //continuing to search for factors
                } else {
                    factor++;
                }
            }
            while (!stack.empty()) {
                System.out.print(stack.pop() + " ");
            }


        }
    }

