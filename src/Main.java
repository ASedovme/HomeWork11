import java.time.LocalDate;

public class Main {

    public static void highYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0) && (year >= 1584)) || (year % 400 == 0)) {
            System.out.println(year + " Год является высокосным");
        } else {
            System.out.println(year + " Год является невысокосным");
        }
    }
    public static void oS(int currentYear, int clientOs, int phoneYear){
        if (phoneYear == currentYear) {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите версию приложения для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Вам не повезло, для вашей операционной системы нет приложения. Смените телефон");
            }
        } else {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Вам не повезло, для вашей операционной системы нет приложения. Смените телефон");
            }
        }


    }
    public static void delivery(int deliveryDistance){
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryDay);
        } else {
            deliveryDay = deliveryDay + 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + deliveryDay);
        } else {
            deliveryDay = deliveryDay + 1;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + deliveryDay);
        }
        if (deliveryDistance > 100){
            System.out.println("Доставки нет");
        }


    }






    public static void main(String[] args) {
        System.out.println("Домашняя работа 11");
//Задача 1
        System.out.println("Задача 1");
        int year = 2022;
        highYear(year);

//Задача 2
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        int clientOs = 0;
        int phoneYear = 2020;
        oS(currentYear,clientOs,phoneYear);

//Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 25;
        delivery(deliveryDistance);

    }



}