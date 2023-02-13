import java.math.BigDecimal;

public class Basic {
    public static void main(String[] args) {

        /*
         * Integer
         * type wrapperclass| byte| size
         * byte -> BYTE -> 1 (- 128 to 127)
         * short -> SHORT -> 2 (-32768 to 32767)
         * int -> INTEGER -> 4
         * long -> LONG -> 8
         * ---------------------
         * Floating Point
         * float
         * double
         * ----------------
         * Boolean
         * boolean
         * ------------------
         * Character
         * char
         * 
         */

        /*
         * we can find size using wrapper class for example Byte of byte , it return
         * 
         */
        System.out.println(Byte.SIZE); // 8 ie 8 bit
        System.out.println(Byte.BYTES); // 1 ie 1 byte
        System.out.println(Byte.MAX_VALUE); // 127
        System.out.println(Byte.MIN_VALUE); // -128

        // by default all long literal are considred to be integer
        // to make it long we need to put l at last
        // we cannot take longer type like long and put in smaller type like int
        // but we can do explicit casting if we are sure about value

        long l = 699988l;
        int i = 1000;
        i = (int) l; // -> explicit casting

        l = i;// implicit casting -> storing shorter type in longer type

        // in literal java also spport octal and hexadecimal

        int eight = 010;// -> 8 octal
        int sixteen = 0x10; // -> 16 hexadecimal
        int fifteen = 0XF; // -> 15

        // anything starting with 0 is octal and after that it can only have digit range
        // from 0 to
        // 7
        /*
         * decimal 0 to 9
         * hexadecimal 0 to 9 then A to F 0xF -> 15
         */

        // operator allowed on integer +, -, /, *. %, ++, --
        // ------------------------------------------------------
        // Floating point - default vaue is double
        /*
         * double and float
         * 
         * default value is double
         * 
         * float f = 34.5 // it gives error becuse 34.5 is doble and cannt store double
         * as foat is 4 byte while double is 8 byte
         * 
         * correct way to store foat is
         * float f = 34.5F
         * 
         * for any floating point operation result is always double
         * 
         * double db1 = 34.5678;
         * float f2 = db1; // error lossy conversion
         * float f2 = (float)db //explicit casting
         * 
         * operator allowed same as integer
         * 
         * int i = f2 ; error lossy conversin
         * int i = (int)f2; //32
         * float f = i; //allowed becuase it is idening conversion
         * 
         * floating point representation donot allow accurate representation of decimal
         * value
         * 
         * to get exact accuracy we need to go for big decimal
         * 
         * to create bigecimal need to pass string in its constrctor
         * 
         * when we pass doube inside BigDecimal Constructor then value is not accurate
         * 
         * 
         * 
         * 
         * 
         */
        BigDecimal number1 = new BigDecimal("34.67887888");
        BigDecimal number2 = new BigDecimal("10.67887888");
        System.out.println("bigdecimal" + number1.add(number2));
        BigDecimal number3 = number1.add(number2); // number3 will contain addition , number1 will remain same

        /*
         * BigDecimal is immutable we cannot change it once created, immutabl class can
         * be assigned value only once
         */

        // adding integer to bigdecimal
        int i = 3;

        BigDecimal n4 = number3.add(new BigDecimal(i));

        /*
         * Boolean
         * 
         * boolean isValue = true
         * boolean isVALUE = false
         * 
         * operation on boolean are called logical operator
         * 
         * result of relational operator (>, <, ==,<=) is boolean value
         * 
         * xor logical operator -> ^ RETURN true of both operand are difrent
         * 
         * false ^ false -> false
         * 
         * false ^ true -> true
         * 
         * true ^ true -> false
         * 
         * NOT OPERATOR -> !
         * !true -> false
         * 
         * ----------------------------------------
         * 
         * character data type -> char
         * 
         * char ch = 'r'
         * 
         * each character is assigned unicode
         * 
         * character data type has 2 bytes
         * 
         * char ch = 65;
         * 
         * it store 'A' in ch
         * 
         * doing ch++; -> ch contain 'B'
         * 
         * 
         */
        char ch2 = '\u0022';
        System.out.println(ch2);// -> "

        char ch33 = '\u00A2'; // -> cents
        // unicode hepls and character that we cannot type

        char ch = 65;

        // '0' to '9' -> 48 and 57
        // 'a' to 'z' -> 97 to 122

        Character.toUpperCase(ch);// -> return uppercase

        // (int)ch return int value ie 65

        System.out.println('\n');// print 2 line 1 for new line one for \n

    }

}
