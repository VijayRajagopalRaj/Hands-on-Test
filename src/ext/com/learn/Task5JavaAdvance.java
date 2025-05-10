package src.ext.com.learn;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task5JavaAdvance {

    public static void main(String[] args) {
        // Task 1: Convert list of strings to uppercase
        System.out.println("Task 1: Convert to Uppercase");
        List<String> names = Arrays.asList("abc", "def", "ghi");

//        List<String> upperNames = names.stream().map(name ->{
//            if(name.length() >2){
//                return name.substring(0,2).toUpperCase()+name.substring(2);
//            }else {
//                return name.indent(0).toUpperCase();
//            }
//        } ).collect(Collectors.toList());
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase names: " + upperNames);

        // Task 2: Filter out non-empty strings
        System.out.println("\nTask 2: Filter Non-Empty Strings");
        List<String> val1 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> nonEmpty = val1.stream()
                .filter(val -> !val.isEmpty())
                .toList();
        System.out.println("Non-empty strings: " + nonEmpty);

        // Task 3: Filter students whose names start with 'A'
        System.out.println("\nTask 3: Students with names starting with 'A'");
        List<String> students = Arrays.asList("Amit", "Ravi", "Anjali", "Sunil", "Akash", "Meena", "Asha", "Kiran", "Ajay", "Vikram");
        List<String> aStudents = students.stream()
                .filter(s -> s.startsWith("A"))
                        .toList();
        System.out.println("Students eligible for gifts: " + aStudents);

        // Task 4: Calculate age using LocalDate
        System.out.println("\nTask 4: Calculate Age");

        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter your birthdate (yyyy-mm-dd): ");
            String birthDateInput = scanner.nextLine();
            LocalDate birthDate = LocalDate.parse(birthDateInput);
            LocalDate currentDate = LocalDate.now();
            Period age = Period.between(birthDate, currentDate);
            System.out.printf("Your age is: %d years, %d months, and %d days",
                    age.getYears(), age.getMonths(), age.getDays());
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-mm-dd.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
