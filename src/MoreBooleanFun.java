import java.util.Scanner;

public class MoreBooleanFun {
    public static void main(String[] args) {
        int myAge;
        int nextAge;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your age: ");
        myAge = userInput.nextInt();

        System.out.println("Current age: " + myAge);

        if(myAge >= 25){
            System.out.println("You can rent a car!");
        }
        else{
            System.out.println("You cannot rent a car :( ");
        }

        if (myAge >= 65) {
            System.out.println("You get a senior discount!");
        }
        else{
            System.out.println("Sorry, you are too young for a discount :( ");
        }

        if(myAge <= 12){
            System.out.println("You can order from the kids menu!");
        }
        else{
            System.out.println("Sorry, you are too old for the kids menu :( ");
        }

        nextAge = myAge + 1;

        System.out.println("On your next birthday out you will be: " + nextAge);

    }
}
