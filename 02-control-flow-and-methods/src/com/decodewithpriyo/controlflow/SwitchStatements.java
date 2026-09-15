package com.decodewithpriyo.controlflow;

/**
 * Topic: Switch Statements & Switch Expressions (Java 14+)
 * Timestamps: [02:09:51]
 * 
 * Supported Switch Types:
 * - byte, short, char, int (and their Wrapper classes)
 * - String (since Java 7)
 * - enum types
 * - NOT supported: float, double, boolean, long
 * 
 * Key Concepts:
 * 1. Traditional Switch: Uses ':' and requires explicit 'break' to prevent fall-through.
 * 2. Enhanced Switch (Arrow Syntax '->'): No 'break' needed; avoids accidental fall-through.
 * 3. Switch Expressions: Can return a value directly, supporting 'yield' in multi-line blocks.
 */
public class SwitchStatements {
    public static void main(String[] args) {
        // 1. Traditional Switch with Fall-Through Demonstration
        System.out.println("=== 1. Traditional Switch Statement ===");
        int dayNum = 3;
        String dayName;
        switch (dayNum) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Day";
                break;
        }
        System.out.println("Day " + dayNum + " is " + dayName);

        // 2. Enhanced Switch Expression (Arrow Syntax)
        System.out.println("\n=== 2. Enhanced Switch (Arrow Syntax) ===");
        String day = "SATURDAY";
        String dayType = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday (Working Day)";
            case "SATURDAY", "SUNDAY" -> "Weekend (Holiday)";
            default -> "Unknown Day";
        };
        System.out.println(day + " is a " + dayType);

        // 3. Switch Expression with 'yield' Keyword
        System.out.println("\n=== 3. Switch Expression with 'yield' ===");
        String code = "PRO";
        int discountPercent = switch (code) {
            case "BASIC" -> 5;
            case "STANDARD" -> 10;
            case "PRO" -> {
                System.out.println("Calculating VIP tier discount...");
                int baseDiscount = 15;
                int bonusDiscount = 5;
                yield baseDiscount + bonusDiscount; // yield returns the computed value
            }
            default -> 0;
        };
        System.out.println("Discount for plan " + code + ": " + discountPercent + "%");
    }
}
