import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int year = 2020;
        printInfoAboutYear(year);
        //Задача 2
        System.out.println("Задача 2");
        printInfoAboutVersion(0, 2014);
        //Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 66;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Доставка невозможна на расстояние " + deliveryDistance);
        } else {
            System.out.println("Время доставки-  " + days + " дн.");
        }




    }
    //Задача 1
    private static boolean isLeapYear (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void printInfoAboutYear (int year) {
        if (isLeapYear(year)) {
            System.out.println(+year + " год является високосним");
        } else {
            System.out.println(+year + " год не является високосним");
        }
    }

    // Задача 2
    public static void printInfoAboutVersion (int os, int productionYear) {
        int currentYear = LocalDate.now().getYear();
        if(currentYear > productionYear) {
            System.out.println("Установите облегченную версия для ");
        } else {
            System.out.println("Установите версию приложения для");
        }
        if (os == 0) {
            System.out.println("IOS по ссылке");
        } else {
            System.out.println("Android по ссылке");
        }
    }
    // Задача 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }



}
