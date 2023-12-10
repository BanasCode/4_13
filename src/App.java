import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String supposedLetter = input.nextLine();

        String status = " is an ivalid input";
        
        switch (supposedLetter) {
            case "a":
                status = " is a vowel";
                break;
           case "A":
                status = " is a vowel";
                break;
           case "e":
                status = " is a vowel";
                break;
           case "E":
                status = " is a vowel";
                break;
           case "i":
                status = " is a vowel";
                break;
           case "I":
                status = " is a vowel";
                break;
           case "o":
                status = " is a vowel";
                break;
           case "O":
                status = " is a vowel";
                break;
           case "u":
                status = " is a vowel";
                break;
           case "U":
                status = " is a vowel";
                break;

           case "b":
                status = " is a consonant";
                break;
           case "B":
                status = " is a consonant";
                break;                
           case "c":
                status = " is a consonant";
                break;
           case "C":
                status = " is a consonant";
                break;
           case "d":
                status = " is a consonant";
                break;
           case "D":
                status = " is a consonant";
                break;
           case "f":
                status = " is a consonant";
                break;
           case "F":
                status = " is a consonant";
                break;
           case "g":
                status = " is a consonant";
                break;
           case "G":
                status = " is a consonant";
                break;
           case "h":
                status = " is a consonant";
                break;
           case "H":
                status = " is a consonant";
                break;
           case "j":
                status = " is a consonant";
                break;
           case "J":
                status = " is a consonant";
                break;
           case "k":
                status = " is a consonant";
                break;
           case "K":
                status = " is a consonant";
                break;
           case "l":
                status = " is a consonant";
                break;
           case "L":
                status = " is a consonant";
                break;
           case "m":
                status = " is a consonant";
                break;
           case "M":
                status = " is a consonant";
                break;
           case "n":
                status = " is a consonant";
                break;
           case "N":
                status = " is a consonant";
                break;
           case "p":
                status = " is a consonant";
                break;
           case "P":
                status = " is a consonant";
                break;
           case "q":
                status = " is a consonant";
                break;
           case "Q":
                status = " is a consonant";
                break;
           case "r":
                status = " is a consonant";
                break;
           case "R":
                status = " is a consonant";
                break;
           case "s":
                status = " is a consonant";
                break;
           case "S":
                status = " is a consonant";
                break;
           case "t":
                status = " is a consonant";
                break;
           case "T":
                status = " is a consonant";
                break;
           case "v":
                status = " is a consonant";
                break;
           case "V":
                status = " is a consonant";
                break;
           case "w":
                status = " is a consonant";
                break;
           case "W":
                status = " is a consonant";
                break;
           case "x":
                status = " is a consonant";
                break;
           case "X":
                status = " is a consonant";
                break;
           case "y":
                status = " is a consonant but is also sometimes a vowel";
                break;
           case "Y":
                status = " is a consonant but is also sometimes a vowel";
                break;
           case "z":
                status = " is a consonant";
                break;
           case "Z":
                status = " is a consonant";
                break;
        }

        System.out.println(supposedLetter + status + ".");

        // if (supposedLetter.equals ("a") || supposedLetter.equals ("e") || supposedLetter.equals ("i") || supposedLetter.equals ("o") || supposedLetter.equals ("u")){
        //     status = " is a vowel";
        // } else {
        //     status = " is an ivalid input";
        // }

    }
}
