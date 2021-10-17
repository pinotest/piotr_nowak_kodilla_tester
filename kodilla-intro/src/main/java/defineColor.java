import java.util.Scanner;

public class defineColor {

    public static void main(String[] args) {
        String result = defineColor.getUserSelection();
        System.out.println("Selected color: " + result);
    }
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select first letter of color (B, S, G, W, R, Y): ");
            String  scan = scanner.nextLine().trim().toUpperCase();
            switch (scan) {
                case "B": return "BLACK";
                case "S": return "SILVER";
                case "G": return "GRAY";
                case "W": return "WHITE";
                case "R": return "RED";
                case "Y": return "YELLOW";
                default:
                    System.out.println("Color not defined. Try again.");
            }
        }
    }

}
