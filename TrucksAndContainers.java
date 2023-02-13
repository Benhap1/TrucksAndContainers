package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        int container = 0;
        int truck = 0;
        int boxInCont = 27;
        int contInTruck = 12;
        Scanner scanner = new Scanner(System.in);
        int box = scanner.nextInt();
        if (box > 0) {
            for (int i = 1; i <= box; i++) {

                if (i % (contInTruck * boxInCont) == 1) {
                    truck += 1;
                    System.out.println("Грузовик: " + truck);
                }
                if (i % boxInCont == 1) {
                    container += 1;
                    System.out.println("\tКонтейнер: " + container);
                }
                System.out.println("\t\tЯщик: " + i);
            }
        }
        if (boxInCont == 0) {
            System.out.println("Необходимо:\nгрузовиков - " + 0 + " шт." + "\nконтейнеров - " + 0 + " шт.");
        }
        System.out.println("Необходимо:\nгрузовиков - " + truck + " шт." + "\nконтейнеров - " + container + " шт.");
    }
}
