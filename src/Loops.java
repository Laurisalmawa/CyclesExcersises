import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Loops loops = new Loops();
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


            switch (option) {
                case 1:
                    loops.sellNewspapers();
                    break;
                case 2:
                    loops.countNextNumbers();
                    break;
                case 3:
                    loops.countPreviousNumbers();
                    break;
                case 4:
                    loops.printHalfTree();
                    break;
                case 5:
                    exit = loops.paintATree();
                    break;
                default:

                    exit = false;
            }

        }while (exit) ;

    }

    public void sellNewspapers() {
        System.out.println("LAURA SELLING NEWSPAPERS");
        int energy = 100;
        int newspaper = (int) Math.floor(Math.random() * (50 - 30) + 30);
        System.out.println("Choose the option to execute: ");
        System.out.println("1. while");
        System.out.println("2. for");
        System.out.println("3. for each ");
        System.out.println("Any other number to exit");
        System.out.println("Write it over here: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
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
                if (newspaper == 0) {
                    System.out.println("Congratulations Laura! you have sold all the newspapers.");
                } else {
                    System.out.println("I'm really sorry for you Laura, better luck for the next one!");
                }
                break;
            case 2:
                for (; newspaper > 0 && energy > 0; energy -= 5) {
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
        System.out.print("Write a positive number to count from lowest to highest: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        System.out.println("Choose the option to execute: ");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. for each ");
        System.out.print("Write it over here: ");
        Scanner scanner1 = new Scanner(System.in);
        int option = scanner1.nextInt();

        switch (option) {
            case 1:
                for (int counter = 1; counter <= number; counter++) {
                    System.out.println(counter);
                }
                break;
            case 2:
                int counter = 1;
                while (counter <= number) {
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
                for (; number > 0; number -= number) {
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

        for (int counter = 1; counter <= lines; counter++) {
            for (int counter2 = 1; counter >= counter2; counter2++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    public boolean paintATree() {

        System.out.println("Choose the option you want to use:");
        System.out.println("1. Paint Symbols by the max number you enter.");
        System.out.println("2. Paint Symbols by the max lines you enter.");
        System.out.println("3. Get back to the previous menu.");
        System.out.println("Any other number to exit.");
        // Quedarse en el menu y opcion 3 para volver al menu anterior y cualquier otra tecla para salir
        //Meterle a todos los arboles base, base despues de dos niveles,
        // base impar
        // 3/2 = 1
        // 7/2 = 3
        Scanner scanner = new Scanner(System.in);
        int optionTree = scanner.nextInt();
        boolean exit = true;

            switch (optionTree) {
                case 1:
                    System.out.println("Enter the number of asterisks that you want on your tree:");
                    Scanner scanner1 = new Scanner(System.in);
                    int maxSymbols = scanner1.nextInt();
                    int lines = (maxSymbols % 2 == 1)? maxSymbols/2+1 : maxSymbols/2;
                    int spaces = maxSymbols / 2;
                    int baseLines = lines / 2;
                    int baseSpaces = maxSymbols / 3;
                    int baseSymbols = maxSymbols - 2*baseSpaces;

                    for (int countLines = 1 , symbols = 1; countLines <= lines; countLines++, symbols += 2, spaces--) {
                        for (int countSpaces = 1; spaces >= countSpaces; countSpaces++) {
                            System.out.print(" ");
                        }
                        for (int countSymbols = (maxSymbols % 2 == 1) ? 1 : 2; countSymbols <= symbols; countSymbols++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    for (int countBaseLines = 1; countBaseLines <= baseLines; countBaseLines++) {
                        for (int countBaseSpaces = 1; countBaseSpaces <= baseSpaces; countBaseSpaces++){
                            System.out.print(" ");
                        }
                        for (int countBaseSymbols = 1; countBaseSymbols <= baseSymbols; countBaseSymbols++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("Enter the number of lines tha you want to get on the tree: ");
                    Scanner scanner2 = new Scanner(System.in);
                    int maxLines = scanner2.nextInt();
                    int spaces1 = maxLines - 1;
                    int baseLines1 = maxLines/2;
                    int baseSpaces1 = maxLines/2;
                    int baseSymbols1  = maxLines -1;

                    for (int countLines1 = 1, plusSymbols = 1; countLines1 <= maxLines; countLines1++, spaces1--, plusSymbols += 2) {
                        for (int countSpaces = 0; countSpaces <= spaces1; countSpaces++) {
                            System.out.print(" ");
                        }
                        for (int countSymbols = 1; countSymbols <= plusSymbols; countSymbols++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    for (int countBaseLines = 1; countBaseLines <= baseLines1; countBaseLines++) {
                        for (int countBaseSpaces = 0; countBaseSpaces <= baseSpaces1; countBaseSpaces++) {
                            System.out.print(" ");
                        }
                        for (int countBaseSymbols = 1; countBaseSymbols <= maxLines; countBaseSymbols++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;

                case 3:
                    break;

                default:
                    exit = false;
            }
        return exit;
    }
}