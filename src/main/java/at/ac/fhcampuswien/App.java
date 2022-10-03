package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // letter
        char l = 'Z';
        int lint = (int) l;
        // hexadecimal or String
        int h = 0xface;
        // 012 interpreted as octal
        int o = 012;
        // long
        long g = 80L;
        int gint = (int) g;
        // batterie
        float b = 44e-1f;
        int bint = (int) b;
        //
        float f =5.5f;
        int fint = (int) f;
        //worldwide bearing
        double w = 8.88e1;
        int wint = (int) w;
        //komma
        double k = 99.9;
        int kint = (int) k;


        int sum = lint + h + o + gint + bint + fint + wint + kint;
        System.out.println(sum);





    }

    //todo Task 4
    public void addTwoNumbers(){

        Scanner scanner1 = new Scanner(System.in);
        int x = scanner1.nextInt();
        int y = scanner1.nextInt();


        System.out.println(x + y);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // temp var

        Scanner scanner2 = new Scanner(System.in);
        int x = scanner2.nextInt();
        int y = scanner2.nextInt();

        x=x-y;
        y=x+y;
        x=y-x;

        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");
        System.out.println("After Swap:");
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scanner3 = new Scanner(System.in);
        int n1 = scanner3.nextInt();
        int n2 = scanner3.nextInt();

        System.out.print("n1: ");
        System.out.print("n2: ");

        if (n1>n2) {
            System.out.println("n1 > n2");
        }
        else if (n2>n1) {
            System.out.println("n2 > n1");
        }
        else {
            System.out.println("n1 == n2");
        }



    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here


        Scanner scanner4 = new Scanner(System.in);
        int x = scanner4.nextInt();

        System.out.print("Enter annual Revenue: ");


        if (0 <= x && x < 20000){
            System.out.println("Poor Sales Revenue");
        }
        else if (20000 <= x && x < 50000){
            System.out.println("Average Sales Revenue");
        }
        else if (50000 <= x && x < 80000){
            System.out.println("Good Sales Revenue");
        }
        else if (80000 <= x && x < 100000){
            System.out.println("Excellent Sales Revenue");
        }
        else {
            System.out.println("Invalid Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here

        Scanner scanner5 = new Scanner(System.in);
        int x = scanner5.nextInt();

        System.out.print("Enter CommissionClass: ");

        switch(x) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner scanner6 = new Scanner(System.in);
        int x = scanner6.nextInt();

        System.out.print("Year: ");

        if((x%4)==0 && (x%400)==0) {
            System.out.println("Leapyear");
        }
        else if((x%100)==0 && (x%400)!=0){
            System.out.println("Not a Leapyear");
        }
        else
            System.out.println("Not a Leapyear");
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner scanner7 = new Scanner(System.in);
        int x = scanner7.nextInt();

        System.out.print("Number: ");

        int a = x%10; // letze ziffer 45 6
        int b = x/10; // int speichert kein Komma 4 5
        int c = b % 10;//5
        int d = x/100;// 4
        System.out.println(a*100 + c*10 + d);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}