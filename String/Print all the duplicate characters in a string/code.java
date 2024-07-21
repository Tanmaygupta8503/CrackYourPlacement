import java.util.*;

class PrintAllTheDuplicateCharactersInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Duplicate characters in a string are: ");
        printDuplicateCharacters(str);
    }
    private static void printDuplicateCharacters(String str) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()) {
            map.put(c , map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
