/*
The Primary format for LCD display, digital cameras, and web pages - known as the RGB format - specifies the level of Red, Green, and blue on an integer scale from 0 to 255. 
The Primary format for publishing books and magazines - known as CMYK format - specifies the level of cyan(C), magenta (M), yellow (Y) and black (K) on a real scale from 0.0 to 1.0

Write a program CMYKtoRGB.java that converts from CMYK format to RGB format using the following mathematical formulas:

white = 1- black
red = 255 x white x (1 - cyan)
green = 255 x white x (1 - magenta)
blue = 255 x white x (1 - yellow)
*/

/*
java CMYKtoRGB 0.0 1.0 0.0 0.0
java CMYKtoRGB 0.0 0.4392156862745098 1.0 0.0
*/

public class CMYKtoRGB {

    public static void main(String[] args) {
        double white = 1 - Double.parseDouble(args[3]);
        double red = 255 * white * (1 - Double.parseDouble(args[0]));
        double green = 255 * white * (1 - Double.parseDouble(args[1]));
        double blue = 255 * white * (1 - Double.parseDouble(args[2]));

        System.out.println("red = " + Math.round(red));
        System.out.println("green = " + Math.round(green));
        System.out.println("blue = " + Math.round(blue));
    }
}
