import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Vad vill du göra?");
            System.out.println("1. Addera två tal");
            System.out.println("2. Räkna bokstäver i en sträng");
            System.out.println("3. Spegelvänd en sträng");
            System.out.println("4. Summera alla tal i en sträng");
            System.out.println("e. Avsluta");

            // Användare väljer för program
            // Skapa funktioner för olika program i switch case

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();


            switch (number) {
                case 1: //Addera tal

                    addera();
                    break;

                case 2: // räkna sträng

                    countLetters();
                    break;

                case 3: // sträng i spegelvänd
                    reverseMirror();
                    break;

                case 4: // Summera alla tal i en sträng
                    numberAndLetter();
                    break;

                case 5:
                    System.out.print("Hej då! ");
                    bye();
                    break;
                default:
                    System.out.print("inget ");
                        System.exit(0);

            }
        }
    }
        static void addera () {

            Scanner input = new Scanner(System.in);

            System.out.print("första talet: ");
            int firstNumber = input.nextInt();
            System.out.print("andra talet: ");
            int secondNumber = input.nextInt();

            System.out.print("Summan är = ");
            System.out.println(firstNumber + secondNumber);

        }
        static void countLetters () {

            Scanner input = new Scanner(System.in);

            System.out.print("Ange ordet du vill leta i: ");
            String word = input.nextLine();
            System.out.print("Ange bokstaven du vill leta efter: ");

            char letter = input.nextLine().charAt(0);
            long numCh = word.chars().filter(c -> c == letter).count();

            System.out.println("Det finns " + numCh + " " + letter + " i ordet " + word);

        }
        static void reverseMirror () {

            Scanner input = new Scanner(System.in);

            System.out.print("Skriv in en sträng: ");
            String word = input.nextLine();

            StringBuilder reversedString = new StringBuilder(word);
            reversedString.reverse();

            System.out.println("Strängen spegelvänt blir:  " + reversedString);


        }
        static void numberAndLetter () {

            Scanner input = new Scanner(System.in);
            System.out.print("Skriv in en sträng: ");


        }
        static void bye () {
            System.exit(0);
        }
    }

