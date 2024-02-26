package tk.cs.lr;

public class Main {
    public static void main(String[] args) {
        printAllTypes();
//        var testVar = "fghjkl";
//       testVar(testVar);
    }

    private static void testVar(String testVar) {
        System.out.println("Str");
    }

    public static void printAllTypes()
    {
        var CharMinValue = (Character) Character.MIN_VALUE; var CharMaxValue = (Character) Character.MAX_VALUE;
        var ByteMinValue = (Byte) Byte.MIN_VALUE; var ByteMaxValue = (Byte) Byte.MAX_VALUE;
        var ShortMinValue = (Short) Short.MIN_VALUE; var ShortMaxValue = (Short) Short.MAX_VALUE;
        var IntMinValue = (Integer) Integer.MIN_VALUE; var IntMaxValue = (Integer) Integer.MAX_VALUE;
        var LongMinValue = (Long) Long.MIN_VALUE; var LongMaxValue = (Long) Long.MAX_VALUE;
        var FloatMinValue = (Float) Float.MIN_VALUE; var FloatMaxValue = (Float) Float.MAX_VALUE;
        var DoubleMinValue = (Double) Double.MIN_VALUE; var DoubleMaxValue = (Double) Double.MAX_VALUE;

        System.out.println("Byte min value : " + ByteMinValue + " Byte max value : " + ByteMaxValue);
        System.out.println("Short min value : " + ShortMinValue + " Short max value : " + ShortMaxValue);
        System.out.println("Char min value : " + (int)CharMinValue + " Char max value : " + (int)CharMaxValue);
        System.out.println("Int min value : " + IntMinValue + " Int max value : " + IntMaxValue);
        System.out.println("Long min value : " + LongMinValue + " Long max value : " + LongMaxValue);
        System.out.println("Float min value : " + FloatMinValue + " Float max value : " + FloatMaxValue);
        System.out.println("Double min value : " + DoubleMinValue + " Double max value : " + DoubleMaxValue);
    }
}
