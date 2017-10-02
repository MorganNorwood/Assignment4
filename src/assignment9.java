//Morgan Norwood
//9/30/2017
/*(The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices
in a two-dimensional array with row and column as int types and maxValue as
a double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
*/

import java.util.Scanner;
public class assignment9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        int a = 0;
        int b = 0;
        double max = 0;
        double[][] m = new double[row][column];

        System.out.println("Enter the array:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        max = locateLargest(m);
        for(int c = 0; c < m.length; c++){
            for(int d = 0; d < m[c].length; d++){
                if(m[c][d] == max){
                    a = c;
                    b = d;
                }
            }
        }



        System.out.println("The location of the largest element is "
                + max + " at (" + a + ", " + b + ")");

    }

        public static double locateLargest(double[][] a) {
            double maxValue = a[0][0];
            for (int k = 0; k < a.length; k++) {
                for (int s = 0; s < a[k].length; s++) {
                    if (a[k][s] > maxValue) {
                        maxValue = a[k][s];
                    }
                }
            }
            return (maxValue);

        }





}
