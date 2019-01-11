import java.util.Scanner;

public class FindWord {
    public static boolean findWord(String statement){
        System.out.println("Please enter the statement");
        String name = "Harry";
        if(statement.contains(name)){
            return true;
        }else{
            return false;
        }
    }
}
