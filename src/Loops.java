import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Loops lauraTheSeller = new Loops();
        boolean exit = true;

        do {
            System.out.println("What program do you want to use?");
            System.out.println("1. Laura selling newspapers.");
            System.out.println("2. Counting from lowest to highest.");
            System.out.println("3. Counting from highest to lowest.");
            System.out.println("4. Print half a tree.");
            System.out.println("5. Print a tree.");
            System.out.println("Any other number to exit");
            System.out.print("Write it here: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();


            switch(option) {
                case 1:
                    lauraTheSeller.sellNewspapers();
                    break;
                case 2:
                    lauraTheSeller.countNextNumbers();
                    break;
                case 3:
                    lauraTheSeller.countPreviousNumbers();
                    break;
                case 4:
                    lauraTheSeller.printHalfTree();
                    break;
                case 5:
                    System.out.println("Choose the option you want to use:");
                    System.out.println("1. Paint Symbols by the max number you enter.");
                    System.out.println("2. Paint Symbols by the max lines you enter.");
                    Scanner scanner1 = new Scanner(System.in);
                    int optionTree = scanner1.nextInt();

                    switch (optionTree) {
                        case 1:
                            lauraTheSeller.paintSymbolsByMaxNumber();
                        break;
                        case 2:
                            lauraTheSeller.paintSymbolsByMaxLines();
                        break;
                        default:
                    }
                default:
                    exit = false;
            }
        } while(exit);

    }
    public void sellNewspapers() {
        System.out.println("LAURA SELLING NEWSPAPERS");
        int energy = 100;
        int newspaper = (int)Math.floor(Math.random()*(50 - 30) + 30);
        System.out.println("Choose the option to execute: ");
        System.out.println("1. while");
        System.out.println("2. for");
        System.out.println("3. for each ");
        System.out.println("Any other number to exit");
        System.out.println("Write it over here: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch(option) {
            case 1:
                while (newspaper > 0 && energy > 0) {
                    int newsToSell = (int) Math.floor(Math.random() * (5 - 1) + 1);
                    System.out.println("Laura has " + newspaper + " newspapers to sell. And she has " + energy
                        + "% of energy, she is going to sell " + newsToSell + " newspapers.");

                    if (newsToSell <= newspaper) {
                    newspaper -= newsToSell;
                    } else {
                       newspaper -= newspaper;
                     }
                energy = energy - 5;
                    }
                System.out.println("Laura has " + energy + "% of energy, and she has left " + newspaper + " newspaper to sell");
                if(newspaper == 0) {
                    System.out.println("Congratulations Laura! you have sold all the newspapers.");
                } else {
                    System.out.println("I'm really sorry for you Laura, better luck for the next one!");
                }
                break;
            case 2:
                for(; newspaper > 0 && energy > 0; energy -= 5) {
                    int newsToSell = (int) Math.floor(Math.random() * (5 - 1) + 1);
                    System.out.println("Laura has " + newspaper + " newspapers to sell. And she has " + energy
                            + "% of energy, she is going to sell " + newsToSell + " newspapers.");

                    if (newsToSell <= newspaper) {
                        newspaper -= newsToSell;
                    } else {
                        newspaper -= newspaper;
                    }
                }
                    System.out.println("Laura has " + energy + "% of energy, and she has left " + newspaper + " newspaper to sell");
                    if (newspaper == 0) {
                        System.out.println("Congratulations Laura! you have sold all the newspapers.");
                    } else {
                        System.out.println("I'm really sorry for you Laura, better luck for the next one!");
                    }

                break;
            case 3:

                break;
            default:
        }

    }

    public void countNextNumbers() {
        System.out.println("COUNTING FROM LOWEST TO HIGHEST");
        System.out.println(" ");
        System.out.print("Write a positive number to count from lowest to highest: " );
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        System.out.println("Choose the option to execute: ");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. for each ");
        System.out.print("Write it over here: ");
        Scanner scanner1 = new Scanner(System.in);
        int option = scanner1.nextInt();

        switch(option) {
            case 1:
                for (int counter = 1; counter <= number; counter++) {
                System.out.println(counter);
                }
                break;
            case 2:
                int counter = 1;
                while(counter <= number){
                    System.out.println(counter++);
                }
            case 3:
                break;
            default:
        }
    }

    public void countPreviousNumbers() {
        System.out.println("COUNTING FROM HIGHEST TO LOWEST");
        System.out.print("Write a positive number to count from highest to lowest: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Choose the option to execute: ");
        System.out.println("1. while");
        System.out.println("2. for");
        System.out.println("3. for each ");
        System.out.print("Write it over here: ");
        Scanner scanner1 = new Scanner(System.in);
        int option = scanner1.nextInt();

        switch (option) {
            case 1:
                while (number > 0) {
                    System.out.println(number--);
                }
            case 2:
                for(;number > 0; number -= number) {
                    System.out.println(number);
                }
                break;
            case 3:
                break;
            default:
        }
    }

    public void printHalfTree() {
        System.out.println("Enter the number of asterisks that you want on your tree:");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        for(int counter = 1; counter <= lines; counter++){
            for(int counter2 = 1; counter >= counter2; counter2++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    public void paintSymbolsByMaxNumber() {
        System.out.println("Enter the number of asterisks that you want on your tree:");
        Scanner scanner = new Scanner(System.in);
        int maxSymbols = scanner.nextInt();
        int lines = maxSymbols/2 +1;
        int spaces = maxSymbols/2;

        for(int countLines = 1, symbols = 1; countLines <= lines; countLines++, symbols+=2, spaces--) {
            for(int countSpaces = 1; spaces >= countSpaces ; countSpaces++) {
                System.out.print(" ");
            }
            for(int countSymbols = (maxSymbols%2 == 1)? 1 : 2 ; countSymbols <= symbols; countSymbols++) {
                System.out.print("*");
            }
            System.out.println(" ");

            // es impar? countSymbols = 1 : countSymbols = 2

            // Cada vez que aumenten los numeros se genera un espacio en los numeros impares, el espacio no se genera en los numeros pares
            // si el residuo de la division del numero es igual a 1 el número es impar.  condicion = limite
            // como del 5 llego 2
            // es diferente para los numeros pares e impares.
            // 1/2 = 0
            // 2/2 = 1
            // 3/2 = 1
            // 4/2 = 2
            // 5/2 = 2 + 1 = 3
            //  --*
            //  -***
            //  *****
            //
        }

    }

    public void paintSymbolsByMaxLines() {
        System.out.println("Enter the number of lines tha you want to get on the tree: ");
        Scanner scanner = new Scanner(System.in);
        int maxLines = scanner.nextInt();
        int spaces = maxLines - 1 ;

        for(int countLines = 1, plusSymbols = 1; countLines <= maxLines; countLines++, spaces--, plusSymbols+= 2) {
            for(int countSpaces = 0; countSpaces <= spaces; countSpaces++) {
                System.out.print(" ");
            }
            for(int countSymbols = 1; countSymbols <= plusSymbols; countSymbols++ ) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
