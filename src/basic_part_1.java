import java.util.Scanner;

public class basic_part_1 {
    public static void main(String[] args) throws Exception {
        
        // one-line comment

        /*
        Multiline comment
        */
        
        //System.out.println("Hello, World!");
        //System.out.println("Hello, World!22");

        //----------------------------------------------------------------------------------------------------------------

        /*
        
        int a = 32;
        double b = 3.14;
        float c = 3.14f;
        String test = "Test";
        boolean e = false;

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("d:" + test);
        System.out.println("e:" + e);  
        
        */
        
        //----------------------------------------------------------------------------------------------------------------

        /*
        int a = 20;
        int b = 15;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double)b);
        System.out.println(a % b); // find the remainder
        
        */

        //----------------------------------------------------------------------------------------------------------------

        /*

        int a = 5;
        a = a + 1;
        a += 1;
        a++;
        System.out.println(a);


        int b = 5;
        b = b - 1;
        b -= 1;
        b--;
        System.out.println(b);

        */

        //----------------------------------------------------------------------------------------------------------------

        /*

        Scanner scanner = new Scanner(System.in);

        int a,b;

        System.out.println("Enter your numbers : ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Sum:" +  (a+b));

        */

        //----------------------------------------------------------------------------------------------------------------

        /*
        int age = 13;

        if (age < 18) {
            System.out.println("You cannot vote!");
        }
        else {
            System.out.println("You can vote!");
        }

        */

        //----------------------------------------------------------------------------------------------------------------

        /*
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your preference");

        int preference = scanner.nextInt();

        if (preference == 1){
            System.out.println("Preference 1");
        }
        else if (preference == 2){
            System.out.println("Preference 2");
        }
        else if (preference == 3){
            System.out.println("Preference 3");
        }
        else {
            System.out.println("Unvalid Preference");
        }

        */
        
        //----------------------------------------------------------------------------------------------------------------

        /*

        double bmi = 26.2;

        if (bmi < 25){
            System.out.println("Thin");
        }
        else if (bmi >= 25 && bmi <30){
            System.out.println("Avarage");
        }
        else {
            System.out.println("Fat");
        }

        */
        
        //----------------------------------------------------------------------------------------------------------------

        /* 

        int op = 2;

        switch(op) {
            case 1:
                System.out.println("op 1");
                break;
            case 2:
                System.out.println("op 2");
                break;
            case 3:
                System.out.println("op 3");
                break;
            default:
                System.out.println("Invalid");
        }

        */
        
        //----------------------------------------------------------------------------------------------------------------

        /*

        int i = 0;
        while (i < 10) {
            System.out.println("i is = " + i);
            i +=2;
        }

        for (int j = 0; j < 10; j +=2){
            System.out.println("j is :" + j);
        }

        */
        
        //----------------------------------------------------------------------------------------------------------------

        /*

        int i = 0;
        while (true) {
            System.out.println("i is = " + i++);
            if (i == 5) {
                System.out.println("take care, bb");
                break;
            }
            // i++;
        }

        */
        
        //----------------------------------------------------------------------------------------------------------------

    }
}
