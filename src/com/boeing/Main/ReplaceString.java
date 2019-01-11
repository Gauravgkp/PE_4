import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args){
        System.out.println("Please enter the statement");
        Scanner scan = new Scanner(System.in);
        String statement = scan.nextLine();
        statement = statement.replace('d','f');
        System.out.println(statement.replace('l','t'));
    }

    public static String replace(String statement){
        return statement.replace('d','f');
    }
}
