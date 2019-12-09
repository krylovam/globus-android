import java.util.ArrayList;
import java.util.Scanner;
public class MyFirstClass {
    public static void main(String[] args){
        Scanner in = new Scanner((System.in));
        String [] Words = new String[]{"environment", "anticyclone", "accomodation", "durability","access",
        "destination", "machine", "cauldron", "cousin", "aeronavigation", "globus"};
        String currentWord = Words[(int)(Math.random()*Words.length)];
        StringBuilder hiddenWord = new StringBuilder(currentWord);
        for (int i = 0; i < currentWord.length(); i ++){
            hiddenWord.setCharAt(i,'*');
        }
        System.out.println("Welcome to our Game\nYour word looks like this "+hiddenWord);
        int guessed = 0;
        while (guessed < currentWord.length()){
            boolean guessedLetter = false;
            System.out.println("Please input a latin character");
            String userLetter = in.nextLine();
            userLetter = userLetter.toLowerCase();
            if (!userLetter.isEmpty()) {
                char letter = userLetter.charAt(0);
                for (int i = 0; i < currentWord.length(); i ++){
                    if (letter == currentWord.charAt(i)){
                        if (hiddenWord.charAt(i) != '*'){
                            System.out.println("This character is already open");
                        }
                        else{
                            hiddenWord.setCharAt(i,letter);
                            guessedLetter = true;
                            guessed ++;
                        }
                    }
                }
                if (guessedLetter){
                    System.out.println("Congratulations! Open this character " + hiddenWord);
                }else{
                    System.out.println("No such character\nTry again!");
                }
            }
        }
        System.out.println("The end!");
    }
}
