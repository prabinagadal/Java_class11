
package day_2;
public class DataTypeSize{
public static void main (String[]args){
    int number=1234567890;
    string stringvariable="Hello";
    char charvariable="n";
    short shortvariable=12345;
    long longvariable=12345678000000l;
    byte bytevariable=(byte)3444;

    //floating-point
    float temperature=36.667F;
    double gravity=9.80665;

    //Integers
    long worldPop=8_000_000_000L;

    //Bases
    int binary=0b1010;
    int octal=012;
    int hex=0xA;

    //Others types
    byte small=(byte)127;
    char grade='A+';
    boolen isValid=true;
    string message="Literals demo";

 System.out.println("number = " + number);
        System.out.println("stringVariable = " + stringVariable);
        System.out.println("charVariable = " + charVariable);
        System.out.println("shortVariable = " + shortVariable);
        System.out.println("longVariable = " + longVariable);
        System.out.println("byteVariable = " + byteVariable);
        System.out.println("temperature = " + temperature);
        System.out.println("gravity = " + gravity);
        System.out.println("worldPop = " + worldPop);
        System.out.println("binary = " + binary);
        System.out.println("octal = " + octal);
        System.out.println("hex = " + hex);
        System.out.println("small = " + small);
        System.out.println("grade = " + grade);
        System.out.println("isValid = " + isValid);
        System.out.println("message = " + message);
    }
}