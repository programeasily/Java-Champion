package part1.lesson12;

public class DataTypes {
    public static void main(String[] args) {

        // Boolean Data Type
        // The Boolean data type is used to store only two possible values: true and false
        boolean one = false;

        // Byte Data Type (8-bit signed two's complement integer)
        // Its minimum value is -128 and maximum value is 127. Its default value is 0.
        byte a = 10, b = -20;

        // Short Data Type (16-bit signed two's complement integer)
        // Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.
        short s = 10000, r = -5000;

        // Int Data Type (32-bit signed two's complement integer)
        // Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive).
        int intA = 100000, intB = -200000;

        // Long Data Type (64-bit two's complement integer)
        // Its value-range lies between -9,223,372,036,854,775,808(-2^63)
        // to 9,223,372,036,854,775,807(2^63 -1)(inclusive)
        long longA = 100000L, longB = -200000L;

        // Float Data Type
        // The float data type is a single-precision 32-bit IEEE 754 floating point.
        // Its value range is unlimited.
        float f1 = 234.5f;

        // Double Data Type
        // The double data type is a double-precision 64-bit IEEE 754 floating point.
        // Its value range is unlimited
        double d1 = 12.3;

        // Char Data Type
        // The char data type is a single 16-bit Unicode character.
        // Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
        // The char data type is used to store characters.
        char letterA = 'A';

    }
}
