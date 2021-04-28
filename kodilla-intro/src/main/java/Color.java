import java.util.Scanner;

public class Color {

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą litere koloru");
        String color = scanner.nextLine().trim().toUpperCase();
        String result = "";
        switch (color) {
            case "C":
                result = "Czerwony";
                break;
            case "N":
                result = "Niebieski";
                break;
            case "Z":
                result = "Zielony";
                break;
            case "P":
                result = "Pomaranczowy";
                break;

            default:
                System.out.println("zla pierwsza litera");
        }
        System.out.println(result);
        return result;
    }
}


