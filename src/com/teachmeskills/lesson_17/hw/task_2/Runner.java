package com.teachmeskills.lesson_17.hw.task_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Runner {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Locale langRu = new Locale("ru");

        DayOfWeek day = date.getDayOfWeek();
        String str = day.getDisplayName(TextStyle.FULL, langRu);

        System.out.println(day.getValue()); // => 2
        System.out.println(str); // => вторник
    }
}
