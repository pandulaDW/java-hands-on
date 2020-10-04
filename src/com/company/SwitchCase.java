package com.company;

public class SwitchCase {
    public static String findDate(int number) {
        String date = "";
        switch (number) {
            case 1 -> date = "Monday";
            case 2 -> date = "Tuesday";
            case 3 -> date = "Wednesday";
            case 4 -> date = "Thursday";
            case 5 -> date = "Friday";
            case 6 -> date = "Saturday";
            case 7 -> date = "Sunday";
            default -> System.out.println("Enter a proper day number");
        }
        return date;
    }

    public static void getWebsiteType(String url) {
        String ext = url.substring(url.lastIndexOf(".") + 1);
        switch (ext) {
            case "com" -> System.out.println("Commercial");
            case "org" -> System.out.println("Organization");
            case "gov" -> System.out.println("Government");
            case "net" -> System.out.println("Network");
        }
    }
}
