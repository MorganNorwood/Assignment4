/*Morgan Norwood

Find the area of a regular polygon (all sides are the same length)

 */



import java.util.Scanner;


public class Assignment4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // user enters the number of sides
        System.out.print("Enter the number of sides: ");
        int numOfSides = input.nextInt();

        //user enters the length of the sides
        System.out.print("Enter the side length: ");
        double sideLength = input.nextDouble();

        // equation for the area of a regular polygon
        double area = (numOfSides * Math.pow(sideLength, 2)) /
                (4 * Math.tan (Math.PI / numOfSides));

        // result
        System.out.println("The area of the polygon is " + area);







    }

}
