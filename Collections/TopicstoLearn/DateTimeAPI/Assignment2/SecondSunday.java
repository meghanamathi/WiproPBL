package Collections.TopicstoLearn.DateTimeAPI.Assignment2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SecondSunday {

    public static void main(String[] args) {

        LocalDate nextMonth = LocalDate.now()
                .plusMonths(1)
                .withDayOfMonth(1);

        LocalDate firstSunday = nextMonth.with(
                TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));

        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("Second Sunday of Next Month : "
                + secondSunday);

    }

}