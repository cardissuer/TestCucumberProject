package tests;

public class safeGuardTest {
//
//    Write a function that prints each number from 1 to 100 on a new line
//
//    For each multiple of 3, print “fizz” instead of the number
//
//    For each multiple of 5, print “buzz” instead of the number
//
//    For multiples of both 3 and 5, print “fizzbuzz” instead of the number

    public static void main(String[] args) {
        fizzBuzz(100);
    }
    public static void fizzBuzz (int n){
        for (int i=1; i<=n;i++){
            if (i%3==0) System.out.println("fizz");
            if (i%5==0) System.out.println("buzz");
            if (i%3==0 && i%5==0) System.out.println("fizzbuzz");
            else {
                System.out.println(i);
            }
        }
    }
}
