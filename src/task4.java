import java.util.HashSet;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text:");
        String inputText = scanner.nextLine();

        String[] words = inputText.split("[\\s\\p{Punct}]+");

        System.out.println("Words in which letters are not repeated:");
        for (String word : words) {
            if (hasUniqueLetters(word)) {
                System.out.println(word);
            }
        }

        scanner.close();
    }

    public static boolean hasUniqueLetters(String word) {
        HashSet<Character> uniqueLetters = new HashSet<>();

        for (char c : word.toCharArray()) {
            
            if (uniqueLetters.contains(c)) {
                return false;
            }
            uniqueLetters.add(c);
        }

        return true; 
    }
}

