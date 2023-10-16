import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n = console.nextInt();

        for (int i = 1; i <= n; i++){
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("FizzBuzz ");
            }else if(i % 3 == 0) {
                System.out.print("Fizz ");
            }else if(i % 5 == 0){
                System.out.print("Buzz ");
            }else{
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        fizzBuzzRecursion(n);



    }

    public static void fizzBuzzRecursion(int n){
        if (n == 1) {
            System.out.print("1 ");
            return;
        }

        fizzBuzzRecursion(n-1);

        if((n % 3 == 0) && (n % 5 == 0)) {
            System.out.print("FizzBuzz ");
        }else if(n % 3 == 0) {
            System.out.print("Fizz ");
        }else if(n % 5 == 0){
            System.out.print("Buzz ");
        }else{
            System.out.print(n + " ");
        }
    }
}