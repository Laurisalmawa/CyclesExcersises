import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DoUFeelLucky {
    public static void main(String[] args) {
        int hidden = (int)Math.floor(Math.random()*100);
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Do you feel lucky? Write a number from 1 to 100 and try your luck: ");
        boolean gotItRight = false;
        int attempts = 0;

        do {
            number = Integer.parseInt(input.next());
            if(number == hidden){
                gotItRight = true;
                System.out.println("You guessed the number, you are very lucky!");
            } else if(number > hidden) {
                System.out.println("Nah! try again, the number must be lower.");
            } else {
            System.out.println("Nah! try again, the number must be greater.");
            }
            attempts++;
        } while (!gotItRight);

        System.out.println("You tried to guess the number in " + attempts + " attempts.");
    }
}