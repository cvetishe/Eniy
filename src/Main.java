
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введиет данные через пробел: " +
                "количество панелей, ширину и длину панелей");
        Scanner inn = new Scanner(System.in);
        String [] dataStr = inn.nextLine().split(" ");
        calcSulfide(dataStr);
    }

    public static void calcSulfide(String[]dataStr) {
          int numbPanels = Integer.parseInt(dataStr[0]);
        int rectangleS = Integer.parseInt(dataStr[1]) * Integer.parseInt(dataStr[2]);
        int sulfideAndTotalS = (rectangleS * numbPanels) * 2;
        System.out.println("Количество необходимого для обработки сульфида тория в нанограммах: " + sulfideAndTotalS);
    }
}