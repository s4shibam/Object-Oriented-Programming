/*
Wrapper Class

The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.

Wrapper Class Example:

Primitive Type	Wrapper class
boolean	        Boolean
char	        Character
byte	        Byte
short	        Short
int	            Integer
long	        Long
float	        Float
double	        Double
*/

public class Wrapper_Class {

    public static void main(String[] args) {

        // Primitive Datatype
        int i = 5;

        // Boxing / Wrapping
        // Assigning int value using Class-Object concept
        Integer ii = new Integer(5);

        // Unboxing / Unwrapping
        // Converting Integer to int explicitly
        int j = ii.intValue();

        // Auto-boxing
        // Compiler will write 'new Integer(i)' internally
        Integer jj = i;

        // Auto-unboxing
        // Compiler will write a.intValue() internally
        int k = ii;

        System.out.println(i);
        System.out.println(ii);
        System.out.println(j);
        System.out.println(jj);
        System.out.println(k);

        // Wrapper Class Use
        String str = "12345";
        int num = Integer.parseInt(str); // Here, Integer is wrapper Class
        System.out.println(num);

    }

}

/*
 * Output:
 * 
 * Wrapper_Class.java:18: warning: [removal] Integer(int) in Integer has been
 * deprecated and marked for removal
 * Integer ii = new Integer(5);
 *              ^
 * 1 warning
 * 5
 * 5
 * 5
 * 5
 * 5
 * 12345
 */