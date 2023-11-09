package com.enums;

import org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement;

public class FirstEnum {
    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Days d = Days.FRIDAY;
        System.out.println(d);
        
        // Printing all days
        Days[] allDays = Days.values();
        for (Days day : allDays) {
            System.out.println(day);
        }
        
        
    }
}