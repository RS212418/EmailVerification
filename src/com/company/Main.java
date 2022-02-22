package com.company;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        String Email = "moo@gmail.com";
        System.out.println(ValidateEmail(Email));
        }

    public static boolean ValidateEmail(String input){
        String EmailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern EmailPattern = Pattern.compile(EmailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = EmailPattern.matcher(input);
        return matcher.find();

    }
}

