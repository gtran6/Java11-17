public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        long n1 = (long)(num1*1000);
        long n2 = (long)(num2*1000);
        return n1 == n2;
    }

    public static void main(String[] args) {
        /*
        Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
        The method should return boolean and it needs to return true if two double numbers
        are the same up to three decimal places. Otherwise, return false.
        Examples of input/output:
        *   areEqualByThreeDecimalPlaces(-3.1756, -3.175); -> should return true since numbers are equal up to 3 decimal places.
        *   areEqualByThreeDecimalPlaces(3.175, 3.176); -> should return false since numbers are not equal up to 3 decimal places.
        *   areEqualByThreeDecimalPlaces(3.0, 3.0); -> should return true since numbers are equal up to 3 decimal places.
        *   areEqualByThreeDecimalPlaces(-3.123, 3.123); -> should return false since numbers are not equal up to 3 decimal places.
        */
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
