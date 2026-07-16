package Collections.TopicstoLearn.DateTimeAPI.Assignment1;

import java.time.LocalDate;

public class TodayDate {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate afterTenDays = today.plusDays(10);

        System.out.println("Today's Date : " + today);

        System.out.println("Date After 10 Days : " + afterTenDays);

    }

}
