import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
//        System.out.println("Please enter the statement");
//        Scanner scan = new Scanner(System.in);
//        String statement = scan.nextLine();
//        String[] wordArray = statement.split(" ");
//        for(int i = 0; i < wordArray.length; i++){
//            StringBuilder reverseWord = new StringBuilder(wordArray[i]);
//            reverseWord = reverseWord.reverse();
//            wordArray[i] = reverseWord.toString();
//            System.out.print(wordArray[i] + " ");
//        }
    }

    public static String[] transpose (String statement){
        String[] wordArray = statement.split(" ");
        for(int i = 0; i < wordArray.length; i++){
            StringBuilder reverseWord = new StringBuilder(wordArray[i]);
            reverseWord = reverseWord.reverse();
            wordArray[i] = reverseWord.toString();
            System.out.print(wordArray[i] + " ");
        }
        return wordArray;
    }
}
