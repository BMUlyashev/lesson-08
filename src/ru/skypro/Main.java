package ru.skypro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        printIsLeapYear(2008);
    }

    private static void printIsLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        printIsLeapYearResult(year, leapYear);
    }

    private static boolean isLeapYear(int year) {
        if (!(year % 100 == 0) && year % 4 == 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    private static void printIsLeapYearResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — невисокосный год");
        }
    }

    private static void task2() {
        int clientDeviceYear = 2021;
        int clientOS = 1;
        printVersionInstall(clientOS, clientDeviceYear);
    }

    private static void printVersionInstall(int clientOS, int clientDeviceYear) {
        String nameOS = getNameOS(clientOS);
        boolean deviceOld = isDeviceOld(clientDeviceYear);
        printVersionToInstall(nameOS, deviceOld);
    }

    private static String getNameOS(int clientOS) {
        if (clientOS == 0) {
            return "iOS";
        }
        return "Android";
    }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear) {
            return true;
        }
        return false;
    }

    private static void printVersionToInstall(String nameOS, boolean isDeviceOld) {
        if (isDeviceOld) {
            System.out.println("Установите облегченную версию приложения для " + nameOS + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + nameOS + " по ссылке");
        }
    }

    private static void task3() {
        int deliveryDistance = 95;
        printDeliveryTime(getDeliveryTime(deliveryDistance));
    }

    private static void printDeliveryTime(int days) {
        System.out.println("Потребуется дней: " + days);
    }

    private static int getDeliveryTime(int distance) {
        int distanceInterval = 40;
        int beginDistance = 20;
        int deliveryTime = 1;

        if (distance >= beginDistance) {
            deliveryTime += (beginDistance + distance) / distanceInterval;
        }
        return deliveryTime;
    }
}
