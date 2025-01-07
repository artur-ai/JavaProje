import java.lang.reflect.Array;

public class Main {
    public static void main( String[] args) {
        char[] array = {'a', '#', '!'};
        char [] charArrayFirst = {'!', '@', '#', '$', '%', '^', '&', '*', '~'};
        int [] arrayfirst = {65, 66, 67, 68, 69};
        int [] arraysecond = {543, 545, 654, 532};
        int[] arraythird = {34, 54, 43, 68, 98, 108};
        int a = 4;
        int b = 8;
        int c = 218312;
        int d = 321321;
        int e = 42389;
        int f = 54;
        int g = 8;
        int h = 5;
        int j = 6;
        int k = 7;
        int value = 68;
        int valuef = 108;
        int q = 3;


        charArray(array);

        char[] charArray = toCharArray(arraysecond);
        for (char symbol : charArray) {
            System.out.println(symbol);
        }

        int max = maxValue(a, b);
        System.out.println("Max value of two numbers: " + max );

        int maxfirst = maxValue(c, e ,d);
        System.out.println("Max value of three numbers: " + maxfirst );

        int maxsecond = maxValue(f, g, h, j, k);
        System.out.println("Max value of five numbers: " + maxsecond );

        String result = charToString(charArrayFirst);
        System.out.println(result);

        int index = indexOf(arrayfirst, value);
        System.out.println("Index: " + index);

        int indexf = indexOfEnd(arraythird, valuef);
        System.out.println("Index: " +indexf);

        System.out.println("Factorial of number " + q + ": " + factorial(q));
    }

    public static void charArray (char[] array) {
        System.out.println(array);
    }

    public static char[] toCharArray (int[] array){
        char[] charArray = {'b'};
        return charArray;
    }

    public static int maxValue (int a, int b) {
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }

    public static int maxValue (int c, int e, int d){
        if (c>d){
            if (c>e){
                return c;
            }
            else {
                return e;
            }
        }
        if (e>d) {
            return e;
        }
        else {
            return d;
        }
    }

    public static int maxValue (int f, int h, int g, int j, int k) {
        if (f>g) {
            if (f>h){
                return f;
            }else {
                return h;
            }
        }
        if (g>j){
            if (g>k){
                return g;
            }else {
                return j;
            }
        }
        if (j>k){
            return j;
        }else {
            return k;
        }
    }

    public static String charToString (char[] chars) {
        return new String(chars);
    }

    public static int indexOf (int [] array1, int value) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfEnd (int[] arraythird, int valuef){
        for (int i = arraythird.length - 1; i >= 0; i--){
            if (arraythird[i] == valuef){
                return i;
            }
        }
        return -1;
    }

    public static int factorial (int q){
        if (q < 0) {
            System.out.println("Factorial is not defined for a negative number");
        }
        if (q == 0 || q == 1) {
            return 1;
        }
        return q * factorial(q - 1);
    }

}


