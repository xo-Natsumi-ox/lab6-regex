package ua.lviv.iot;


import java.util.Scanner;

public class Regex {

    public String replaceRegular(String text, String fragment) {
        String fullfragment = "[а-я]*" + fragment + "[а-я]*";
        return text.replaceAll(fullfragment, "");

    }

}
