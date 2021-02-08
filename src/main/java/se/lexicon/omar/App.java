package se.lexicon.omar;


import javafx.scene.Parent;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {

        /**
         Exercise 1:
         Create a LocalDate of the current day and print it out
         */
        final LocalDate currentDate = LocalDate.now();
        System.out.println("Exercise-1-Current date: " + currentDate + ".");

        /**
         Exercise2:
         Create a LocalDate of the current day and print it out in the following pattern
         using DateTimeFormatter: Thursdag 29 mars.
         */
        String currentDay = currentDate.format(DateTimeFormatter.ofPattern("eeee dd MMM"));
        System.out.println("=========================");
        System.out.println("Exercise-2-Current day: " + currentDay + ".");

        /**
         Exercise3:
         Create a LocalDate of last Monday.
         Then print out the entire week in a loop using standard ISO format.
         */
        LocalDate lastMonday = currentDate.with(DayOfWeek.MONDAY);
        System.out.println("=========================");
        System.out.println("Exercise-3:");
        LocalDate plusLastMonday = lastMonday;
        while (!plusLastMonday.equals(currentDate.plusDays(1))) {
            System.out.println(plusLastMonday.format(DateTimeFormatter.ISO_DATE));
            plusLastMonday = plusLastMonday.plusDays(1);
        }

        /**
         Exercise 4:
         Create a LocalDate object from a String by using the .parse() method.
         */
        String date = "2021-02-24";
        LocalDate localDateOfString = LocalDate.parse(date);
        System.out.println("=========================");
        System.out.println("Exercise-4:");
        System.out.println("LocalDate object from a String: " + localDateOfString);

        /**
         Exercise 5:
         The date time api provides enums for time units such as day and month.
         Create a LocalDate of 1945-05-08 and extract the day of week for that date.
         */
        LocalDate createALocalDate = LocalDate.parse("1945-05-08");
        DayOfWeek dateOfWeek = createALocalDate.getDayOfWeek();
        System.out.println("=========================");
        System.out.println("Exercise-5:");
        System.out.println("Extract the day of week from (1945-05-08): " + dateOfWeek);

        /**
         Exercise 6:
         Create a LocalDate of current date plus 10 years and minus 10 months.
         From that date extract the month and print it out.
         */
        LocalDate currentDatePlus10Years = currentDate.plusYears(10);
        Month monthOfCurrentDatePlus10Years = currentDatePlus10Years.getMonth();
        LocalDate currentDateMinus10Years = currentDate.minusYears(10);
        Month monthOfCurrentDateMinus10Years = currentDateMinus10Years.getMonth();
        System.out.println("=========================");
        System.out.println("Exercise-6:");
        System.out.println("The month of current date plus 10 years: " + monthOfCurrentDatePlus10Years);
        System.out.println("The month of current date minus 10 years: " + monthOfCurrentDateMinus10Years);

        /**
         Exercise7
         Using the LocalDate from exercise 5 and your birthdate,
         create a Period between your birthdate and the date from exercise 5.
         Print out the elapsed years, months and days
         */
        LocalDate myBirthDay = LocalDate.parse("1981-02-24");
        Period period = Period.between(createALocalDate, myBirthDay);
        System.out.println("=========================");
        System.out.println("Exercise-7:");
        System.out.println("Period between my birthday 1981-02-24 and 1945-05-08");
        System.out.println("Elapsed years: " + period.getYears() +
                "\nElapsed Months: " + period.getMonths() +
                "\nElapsed days: " + period.getDays());

        /**
         Exercise 8
         Create a period of 4 years, 7 months and 29 days.
         Then create a LocalDate of current date and add the period you created to the current date.
         */
        Period periodOf = Period.of(4,7,29);
        LocalDate currentDatePLusPeriodOf = currentDate.plus(periodOf);
        System.out.println("=========================");
        System.out.println("Exercise-8:");
        System.out.println("Current date " + currentDate + " + 4-years & 7-months & 29-days: " + currentDatePLusPeriodOf);
        System.out.println(currentDatePLusPeriodOf);

        /**
         Exercise 9
         Create a LocalTime object of the current time.
         */
        LocalTime currentLocalTime = LocalTime.now();
        System.out.println("=========================");
        System.out.println("Exercise-9:");
        System.out.println("LocalTime object of the current time: \n" + currentLocalTime);

        /**
         Exercise 10
         Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
         */
        int nanosecondsOfLocalTime = currentLocalTime.getNano();
        System.out.println("=========================");
        System.out.println("Exercise-10:");
        System.out.println("The nanoseconds of a LocalTime object of current time:\n" + nanosecondsOfLocalTime);

        /**
         Exercise 11
         Create a LocalTime object from a String using the .parse() method.
         */
        String stringTime = "19:39:35";
        LocalTime localTimeOfString = LocalTime.parse(stringTime);
        System.out.println("=========================");
        System.out.println("Exercise-11:");
        System.out.println("LocalTime object from a String using the .parse() method:\n" + localTimeOfString);

        /**
         Exercise 12
         Using DateTimeFormatter format LocalTime from current time and print it out as following pattern:
         10:32:53
         */
        String currentLocalTimeFormat = currentLocalTime.format(DateTimeFormatter.ofPattern("H:mm:ss"));
        System.out.println("=========================");
        System.out.println("Exercise-12:");
        System.out.println("DateTimeFormatter format LocalTime from current time\n"+currentLocalTimeFormat);

        /**
         Exercise 13
         Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00.
         */
        LocalDateTime currentLocalDate = LocalDateTime.now();
        String currentLocalDateTimeFormatter = currentLocalDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println("=========================");
        System.out.println("Exercise-13:");
        System.out.println("Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00:");
        System.out.println(currentLocalDateTimeFormatter);

        /**
         Exercise 14
         Using DateTimeFormatter format the LocalDateTime object from exercise 13 to a String that should look tile this: torsdag 5 april 10:00
         */
        String currentLocalDateTimeFormatterAs = currentLocalDate.format(DateTimeFormatter.ofPattern("eeee d MMM HH:mm"));
        System.out.println("=========================");
        System.out.println("Exercise-14:");
        System.out.println("Current DateTimeFormatter to a String like: torsdag 5 april 10:00");
        System.out.println(currentLocalDateTimeFormatterAs);

        System.out.println("=========================");
        System.out.println("The End.");

    }

}
