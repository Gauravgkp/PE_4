import java.util.Scanner;

public class CharCount {
    public static void main(String[] args){
        System.out.println("Please enter the statement");
        Scanner scan = new Scanner(System.in);
        String statement = scan.nextLine();
        System.out.println("Please enter the character to find occurrence");
        Scanner scanChar = new Scanner(System.in);

    }

    public static int charCount(String statement, String count){
        String charCount = count;
        int countOcc = 0;
        String[] statementArray = statement.split(charCount);
        if(statementArray==null){
            System.out.println("No occurance found");
        }else {
            int noOfOccurrence = statementArray.length;
            if(statementArray[noOfOccurrence-1].equals(charCount)){
                noOfOccurrence++;
            }
            System.out.println("Number of occurance found is " + (statementArray.length-1));
            countOcc = statementArray.length-1;
        }

        return countOcc;
    }
}
