package exercises.exercise4;

import java.util.regex.Pattern;

public class Exercise4 {
    public static void main(String[] args) {
        // Email format case
        System.out.println("Check for Email pattern");
        System.out.println("sudharshann05@gmail.com: " + Pattern.matches("^(.+)@(.+)$", "sudharshann05@gmail.com"));
        System.out.println("sudharshann05@: " + Pattern.matches("^(.+)@(.+)$", "sudharshann05@"));

        // Check digits
        System.out.println("\nCheck for digits pattern");
        System.out.println("43: " + Pattern.matches("\\d+", "43"));
        System.out.println("abcd: " + Pattern.matches("\\d+", "abcd"));

        // Character case sensitive
        System.out.println("\nCheck for Character pattern");
        System.out.println("regex: " + Pattern.matches("^[a-z]+$", "regex"));
        System.out.println("Regex: " + Pattern.matches("^[a-z]+$", "Regex"));

        // Check phone number patter
        System.out.println("\nCheck for phone number pattern");
        System.out.println("9486311502: " + Pattern.matches(".?(\\d{3}).*(\\d{3}).*(\\d{4})", "9486311502"));
        System.out.println("23t4562811: " + Pattern.matches(".?(\\d{3}).*(\\d{3}).*(\\d{4})", "23t4562811"));

        // Check Date pattern
        System.out.println("\nCheck for Date pattern");
        System.out.println("05-01-1998: " + Pattern.matches("(\\d{2}).(\\d{2}).(\\d{4})", "05-01-1998"));
        System.out.println("05-01-98: " + Pattern.matches("(\\d{2}).(\\d{2}).(\\d{4})", "05-01-98"));

        // Check URL pattern
        System.out.println("\nCheck for URL pattern");
        System.out.println("https://www.google.com/search: " + Pattern.matches("(https?)://(www)?.?(\\w+).(\\w+)/?(\\w+)?", "https://www.google.com/search"));
        System.out.println("yahoo.com: " + Pattern.matches("(https?)://(www)?.?(\\w+).(\\w+)/?(\\w+)?", "yahoo.com"));

    }
}
