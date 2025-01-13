import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main( String[] args) {
        char[] array = {'a', '#', '!'};
        char [] charArrayFirst = {'!', '@', '#', '$', '%', '^', '&', '*', '~'};
        int [] arrayfirst = {65, 66, 67, 68, 69};
        int [] arraysecond = {65, 54, 68, 89, 70};
        int[] arraythird = {34, 54, 43, 68, 98, 108};
        int [] arrayfourth = {10, -1, 34, -120, 3, 988, 14};
        byte [] arr = {1, 2, 1, 3, 4};
        int [] arrayFirst = {1, 2, 3, 4};
        int [] arraySecond = {2, 3, 4, 5};
        int[] arrayResult = arrsMath(arrayFirst, arraySecond);
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
        int year = 2024;
        int number = 2;


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

        boolean leapYear = isLeapYear(year);
        System.out.println(year + " is a leap year - " + leapYear);

        arrayfirst = new int[]{65, 66, 67, 68, 69};
        multiple(arrayfirst, number);

        System.out.println("To sorting: " + Arrays.toString(arrayfourth));
        sorting(arrayfourth);
        System.out.println("After sorting: " + Arrays.toString(arrayfourth));

        reiteration(arr);
        System.out.println("Does the array have repeating elements? : " + reiteration(arr));

        arrsMath(arrayFirst, arraySecond);
        System.out.println("The result of multiplication: ");
        for (int valuet : arrayResult ) {
            System.out.println(valuet + " ");
        }

        arrayfirst = new int[]{65, 66, 67, 68, 69};
        arraysecond =new int[] {65, 54, 68, 89, 70};
        int [] resultArray = offSet(arrayfirst, arraysecond);
        offSet(arrayfirst, arraysecond);
        System.out.println("The result of the difference: ");
       for (int valuer : resultArray) {
           System.out.print(valuer + " ");
       }

       //приймає масив інтів, повертає його ж у реверсному порядку



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

    public static boolean isLeapYear (int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }

    public static void multiple (int[] array, int number){
        for (int num : array) {
            if (num % number == 0) {
                System.out.println("The number is a multiple of "  + number + ": " + num);
            }
        }
    }

    public static void sorting (int [] array){
        Arrays.sort(array);
    }

    public static boolean reiteration (byte [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int [] arrsMath (int[] arrayFirst, int[] arraySecond) {
        int [] arrayResult = new int[arrayFirst.length];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayResult[i] = arrayFirst[i] * arraySecond[i];
        }
        return arrayResult;
    }

   public static int [] offSet (int [] arrayfirst, int [] arraysecond) {
       List<Integer> resultList = new ArrayList<>();
       for (int i = 0; i < arrayfirst.length; i++) {
           boolean found = false;
           for (int j = 0; j < arraysecond.length; j++) {
               if (arrayfirst[i] == arraysecond[j]) {
                   found = true;
                   break;
               }
           }
           if (!found) {
               resultList.add(arrayfirst[i]);
           }
       }
       for (int i = 0; i < arraysecond.length; i++) {
           boolean found = false;
           for (int j = 0; j < arrayfirst.length; j++) {
               if (arraysecond[i] == arrayfirst[j]) {
                   found = true;
                   break;
               }
           }
           if (!found) {
               resultList.add(arraysecond[i]);
           }
       }
       int[] resultArray = resultList.stream().mapToInt(Integer::intValue).toArray();
       return resultArray;


   }

}