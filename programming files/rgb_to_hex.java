public class rgb_to_hex {
    public static void main(String[] args) {
         //Establishes variables for each value of R, B, and G.
        int r = 255;
        int g = 127;
        int b = 0;
        //creates a string that states the hexidecimal value of the rbg color value
        String hexColor = rgbToHex(r, g, b);
        //prints a statement declaring the hexidecimal color that is equal to the established
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    //method to convert rbg color to hex
    public static String rgbToHex(int r, int g, int b) {
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        //formats output
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


