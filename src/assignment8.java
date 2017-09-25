/* Morgan Norwood
Assignment 8.30
(Algebra: solve linear equations)
 Write a method that solves 2 * 2 system of linear equations
 */

import java.util.Scanner;

public class assignment8 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f below:");
        //Creating a 2d array for a00, a01, a10, a11.
        double[][] a = new double[2][2];
        //Creating an array for b0 and b1
        double[] b = new double[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //Allowing for user to enter values for a.
                a[i][j] = input.nextDouble();
            }
        }
        for(int k = 0; k < b.length; k++) {
            //Allowing for user to enter values for b.
            b[k] = input.nextDouble();
        }
        //Getting the point from method linear equation.
        double[] points = linearEquation(a, b);
        if (linearEquation(a, b) == null) {
            System.out.println("No solution.");
        }
        else {
                System.out.println("x = " + points[0] + " and y = " + points[1]);

        }


    }

    private static double[] linearEquation(double[][] a, double[] b) {

        // equation:
        // ab_Minus_bc = a * d - b * c
        double ab_Minus_bc = a[0][0] * a[1][1] - a[0][1] * a[1][0];

        if (ab_Minus_bc == 0.0) return null;

        // equation:
        // x = (e * d - b * f) / ab_Minus_bc;
        // y = (a * f - e * c) / ab_Minus_bc;
        double[] point = new double[2];
        point[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / ab_Minus_bc;
        point[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / ab_Minus_bc;

        return point;
    }

}
