import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Flower[] flowersArray = new Flower[3];


        flowersArray[0] = new Flower("Роза", 3000);
        flowersArray[1] = new Flower("Тюльпан", 4300);
        flowersArray[2] = new Flower("Лилия", 1200);

        Flow(flowersArray);
    }

    public static void Flow(Flower[] flowers) {
        if (flowers.length == 0) {
            System.out.println("Массив цветов пуст.");
            return;
        }

        Flower EXFlow = flowers[0];

        for (int i = 1; i < flowers.length; i++) {
            if (flowers[i].getPrice() > EXFlow.getPrice()) {
                EXFlow = flowers[i];
            }
        }

        System.out.println("Самый дорогой цветок: " + EXFlow.getName());
    }
}








