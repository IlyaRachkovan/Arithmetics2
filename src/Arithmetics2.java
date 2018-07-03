/**
 * Created by student on 03.07.2018.
 */
public class Arithmetics2 {
    public static void main(String [] args){

        int i = 0;
        int i2  = 1;
        int i3  = 2;
        String s = "String";
        String s1 = "String";
        String s2 = "other String";
        //Arithmetics
        int result;
        result = i+ i2;
        System.out.println("Result: " + result);
        i++;

        result = i3 - i2;
        System.out.println("Result: " + result );
        i++;

        result = i * i2;
        System.out.println("Result: " + result);
        i++;

        result = i / i3;
        System.out.println("Result: " + result);
        i++;

        System.out.println("i: " + i++);

        System.out.println("i: " + ++i);

        System.out.println("i: " + i);


    }

}
