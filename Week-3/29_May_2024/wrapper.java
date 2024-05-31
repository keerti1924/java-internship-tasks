import java.io.*;

public class wrapper {
    public static void main(String[] args) {
        byte a = 1;
        // wrapping around Byte object
        Byte byteobj = Byte.valueOf(a);

        int b = 10;
        // wrapping around Integer object
        Integer intobj = Integer.valueOf(b);

        float c = 18.6f;
        // wrapping around Float object
        Float floatobj = Float.valueOf(c);

        double d = 250.5;
        // Wrapping around Double object
        Double doubleobj = Double.valueOf(d);

        char e = 'a';
        // wrapping around Character object
        Character charobj = Character.valueOf(e);

        System.out.println("\nValues of Wrapper objects (printing as objects)");
        System.out.println("Byte object = " + byteobj);
        System.out.println("Integer object = " + intobj);
        System.out.println("Float object = " + floatobj);
        System.out.println("Double object = " + doubleobj);
        System.out.println("Character object = " + charobj);

        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;

        System.out.println("\nUnwrapped values (printing as data types)");
        System.out.println("byte value = " + bv);
        System.out.println("int value = " + iv);
        System.out.println("float value = " + fv);
        System.out.println("double value = " + dv);
        System.out.println("char value = " + cv);
    }
}
