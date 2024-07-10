import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//1.Write a program that prints the numbers from 1 to 100 such that:If the number is a multiple of 3, you need to print "Fizz" instead of that number.
/*

for(int i=1;i<=100;i++){
    if(i%3==0&&i%5==0){
        System.out.println("FizzBuzz");
    }

   else if(i%3==0){
        System.out.println("Fizz");
    }else if(i%5==0){
        System.out.println("Buzz");
    }


    System.out.println(i);
}


 */


        //2.Write a Java program to reverse a string Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT

        /*Scanner scanner = new Scanner(System.in);
        String text;
        String reverse="";

        System.out.println("Enter text: ");
        text = scanner.nextLine();
        for (int i =text.length()-1; i >= 0; i--) {
            reverse += text.charAt(i);


        }
        System.out.println("Reverse string: "+reverse);


         */


        //3.Write a program to find the factorial value of any number entered through the keyboard.
        /*Scanner scanner = new Scanner(System.in);
        int num;
        int factorial = 1;
        System.out.println("enter a number to find the factorial");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial *= i;

        }
        System.out.println("the factorial of "+num+" is: "+factorial);

         */

        //4.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

       /* Scanner scanner = new Scanner(System.in);
        int num1;
        int power;
        int result=1;
        int i=0;

        System.out.println("enter number one:");
        num1 = scanner.nextInt();
        System.out.println("enter number two:");
        power = scanner.nextInt();

        while (i < power){

            result *= num1;
            i++;


        }
        System.out.println(result);

        */

        //5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        /*Scanner scanner = new Scanner(System.in);

        int n;
        int num;
        int sum=0;
        int sumev=0;
        int sumod=0;
        System.out.println("enter the  number of integers :");
        n = scanner.nextInt();
        System.out.println("enter the integers:");

        for(int i = 1; i <= n; i++){
            num = scanner.nextInt();
            if(num%2==0){
                sumev+=num;
            }
            else
               sumod+=num;


        }
        System.out.println("sum of even:"+sumev);
        System.out.println("sum of odd:"+sumod);

         */


        //6.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
      /*  Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("enter positive number :");
        num = scanner.nextInt();

     if(num<=1){
         System.out.println(num+" is not a prime number");

     }
     if (num==2){
         System.out.println(num+" is a prime number");
     }

     if (num%2==0){
         System.out.println(num+" is not a prime number");
     }else
         System.out.println(num+" is a prime number");
     for(int i=3;i<=Math.sqrt(num);i=i+2){
         if(num%i==0){
             System.out.println(num+" is not a prime number");
         }

     }
    */


        //7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
        /*for(int i=1;i<=4;i++){
            System.out.println("week: "+i);

            for(int j=1;j<=7;j++){
                System.out.println("day: "+j);



            }
        }

         */

        //8.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
/*Scanner scanner = new Scanner(System.in);
        String text;
        String rev="";
        System.out.println("enter the text to check if it palindrome or not :");
        text = scanner.nextLine();
        for (int i = text.length()-1; i >= 0; i--) {
            rev = rev + text.charAt(i);

            }

        if(text.equals(rev)){
            System.out.println("it is a palindrome");
        }
        else
            System.out.println("it is not a palindrome");

 */

    }


    }

