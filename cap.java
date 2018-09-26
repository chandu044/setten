import java.util.Scanner;
public class Main {
    private static void print(String message) {
        System.out.print(message);
    }
    private static void println(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) throws java.lang.Exception {
        
        String currentWord;
        String finalString = "";
        
        Scanner scanner = new Scanner(System.in);
        
     //   println("Enter a string : ");
        String line = scanner.nextLine();
        
        Scanner scannedLine = new Scanner(line);
        
        while (scannedLine.hasNext()) {
            
            currentWord = scannedLine.next();
            finalString += Character.toUpperCase(currentWord.charAt(0)) + currentWord.substring(1) + " ";
        }
        
        println(  finalString);
    }
}
