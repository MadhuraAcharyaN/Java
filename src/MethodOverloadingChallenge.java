public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in: " + convertToCentimeters(5, 8) + "cm" );
        System.out.println("68in: " + convertToCentimeters(68) + "cm" );

    }

    public static double convertToCentimeters(int heightInInch) {
//        convert to centimeter
        return heightInInch * 2.54;
    }

    public static double  convertToCentimeters(int heightInFeet, int heightInInch) {
//        convert feet to inch and call first method
        int convertedHeightToInch = heightInFeet * 12;
        return convertToCentimeters(convertedHeightToInch + heightInInch);
    }
}
