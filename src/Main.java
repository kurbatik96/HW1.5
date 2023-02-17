public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android");
        } else {
            System.out.println("Оставайтесь на сайте");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для iOS");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android");
        } else if (clientOS == 0 || clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию программы");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2024;
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println(year+" год является високосным");
            }else {
            System.out.println(year+ " год является не високосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryTimeDays = 1;
        int deliveryDistance = 95;
    if(deliveryDistance<=20){
        System.out.println("Доставка займет дней :"+ deliveryTimeDays);
    } else if(deliveryDistance>20 && deliveryDistance<=60){
        System.out.println("Доставка займет дней :"+ (deliveryTimeDays+1));
    }else if(deliveryDistance>60 && deliveryDistance<=100){
        System.out.println("Доставка займет дней :"+ (deliveryTimeDays+2));
    }else{
        System.out.println("Доставки так далеко нет");
    }
}

    public static void task5() {
        System.out.println("Задача 5");
    int monthNumber = 8;
    switch (monthNumber){
        case 1:
        case 2:
            System.out.println("Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
            break;
        case 12:
            System.out.println("Зима");
            break;
        default:
            System.out.println("Такого месяца не существует.");
            }
    }
    }
