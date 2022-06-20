
public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
//        String data = "";
//        for (int i = 0; i < 3; i++) {
//            char symbol = scanner.nextLine().charAt(0);
//
//            data = data + symbol;
//        }
//
//        for (int i = data.length() - 1; i >= 0; i--) {
//            System.out.print(data.charAt(i) + " ");
//        }
 
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);
 
        System.out.printf("%c %c %c", thirdChar, secondChar, firstChar);
    }
}
