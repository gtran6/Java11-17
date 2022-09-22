public class Main {
    public static void main(String[] args) {
        int val = 1000;
        int myMinIntVal = Integer.MIN_VALUE;
        int myMaxIntVal = Integer.MAX_VALUE;
        System.out.println(myMinIntVal); //-2147483648
        System.out.println(myMaxIntVal); //2147483647
        System.out.println(myMaxIntVal+1); //-2147483648
        System.out.println(myMinIntVal-1); //2147483647

        byte myMinByteVal = Byte.MIN_VALUE;
        byte myMaxByteVal = Byte.MAX_VALUE;
        System.out.println(myMinByteVal); //-128
        System.out.println(myMaxByteVal); //127

        Short myMinShortVal = Short.MIN_VALUE;
        Short myMaxShortVal = Short.MAX_VALUE;
        System.out.println(myMinShortVal); //-32768
        System.out.println(myMaxShortVal); //32767
        
        long myLongVal = 100L;
        long myMinLongVal = Long.MIN_VALUE;
        long myMaxLongVal = Long.MAX_VALUE;
        System.out.println(myMinLongVal); //-9223372036854775808
        System.out.println(myMaxLongVal); //9223372036854775807

        int total = myMinIntVal/2;
        byte myNewByteVal = (byte)(myMinByteVal/2);
        short myNewShortVal = (short)(myMinShortVal/2);

        float myMinFloatVal = Float.MIN_VALUE;
        float myMaxFloatVal = Float.MAX_VALUE;
        System.out.println(myMinFloatVal);
        System.out.println(myMaxFloatVal);

        double myMinDoubleVal = Double.MIN_VALUE;
        double myMaxDoubleVal = Double.MAX_VALUE;
        System.out.println(myMinDoubleVal);
        System.out.println(myMaxDoubleVal);

        float myFloatVal = 5f / 2f; //2.5
        double myDoubleVal = 5d / 2d; //2.5
        System.out.println(myFloatVal);
        System.out.println(myDoubleVal);

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
