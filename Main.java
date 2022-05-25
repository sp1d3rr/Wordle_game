import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // poner estadio de verificacion de lo ingredo por el usuario
        System.out.println("Please Enter given  language");
        System.out.println("A english");
        System.out.print("--> ");
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        String language = sc.nextLine();  // Read user input
        language = language.toLowerCase(); // covert to lowercase

        Wordle newGame=null;

        while (! Wordle.languagePossibilities.contains(language) ) {
            System.out.println("The language selected is not one of the options available.");
            System.out.println("Please, pick one the following options:");
            System.out.println("A) English");

            System.out.print("--> ");
            language = sc.nextLine();  // Read user input
            language = language.toLowerCase(); // covert to lowercase
        }

        if (language.equals("english") || language.equals("a")) {
            newGame = new English();
        }

        newGame.play();

    }
}


