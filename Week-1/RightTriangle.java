/*
Write a program RightTriangle that takes three int command-line arguments and determines
whether they constitute the side lengths of some triangle. 

The following two conditions are necessary and sufficient:
- Each integer must be positive. 
- The sum of the squares of two of the integers must equal the square of the third integer

// Sample Inputs
java RightTriangle 3 4 5
java RightTriangle 13 12 5
java RightTriangle 1 2 3
java RightTriangle -3 4 -5
*/

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean postiveInt = (a > 0) && (b > 0) && (c > 0);
        boolean a2b2c2 = ((a * a) + (b * b)) == (c * c);
        boolean b2c2a2 = ((b * b) + (c * c)) == (a * a);
        boolean c2a2b2 = ((c * c) + (a * a)) == (b * b);

        boolean sumOfSquares = (a2b2c2 || b2c2a2 || c2a2b2);
        boolean isRightTriangle = (postiveInt) && sumOfSquares;

        System.out.println(isRightTriangle);
    }
}
