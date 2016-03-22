import java.util.Scanner;

class test2 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        String numbers;
        System.out.println("Enter Two Numbers");

            // First number//
        Integer x = Integer.valueOf(input.next());

            //Second number//
        Integer y = Integer.valueOf(input.next());

            //operation//
        Integer z = x+y;

            //Prints the Answer//
        System.out.println(z);
    }
}
