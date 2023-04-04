public class main {
    public static void main(String[] arg) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        short clinetOS = 1;
        switch (clinetOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Введена не верная переменная");
        }
    }
    public static void task2() {
        short clinetOS = 0;
        int clientDeviceYear = 2015;
        if (clinetOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clinetOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clinetOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clinetOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        int year = 2016;
        boolean devidedOn4 = year % 4 == 0;
        boolean devidedOn100 = year % 100 == 0;
        boolean devidedOn400 = year % 400 == 0;
        if ((devidedOn4 == true && devidedOn100 == false) || devidedOn400 == true) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4() {
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60 && deliveryDistance >= 20) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100 && deliveryDistance >= 60) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    public static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Не правильно прописан номер месяца");
        }
    }
}
