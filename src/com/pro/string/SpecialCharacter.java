package com.pro.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacter {
    public static void main(String[] args) {
        String str = "This is a string with !@#$%^&*() special characters.";
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(str);
        boolean hasSpecialChar = matcher.find();
        while(matcher.find())
        {
        	if(matcher.group() !=" " && matcher.group()!="" && matcher.group()!= null)
        	System.out.println(" "+matcher.group());
        }
        if (hasSpecialChar) {
            System.out.println("The string contains special characters.");
        } else {
            System.out.println("The string does not contain special characters.");
        }
        
       
    }
}