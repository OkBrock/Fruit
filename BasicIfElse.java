import java.util.Scanner;

public class BasicIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite fruit?");
        String fruit = scanner.nextLine();

        String banana = "Banana";
        String mango = "Mango";
        String durian = "Durian";

        if(fruit.equals(banana)) {
            System.out.println("You are correct. Banana is indeed the best fruit!");
        }
        else if(fruit.equals(mango)) {
            System.out.println("If we are talking about dried fruit, definitely.");
        }
        else if(fruit.equals(durian)) {
            System.out.println("THAT IS DISGUSTING!!!");
        }
        else {
            System.out.println("You are wrong! Banana is the best fruit.");
        }        


    }
}
