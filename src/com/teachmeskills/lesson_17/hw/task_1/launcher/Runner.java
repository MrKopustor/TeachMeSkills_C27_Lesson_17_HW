package com.teachmeskills.lesson_17.hw.task_1.launcher;

import com.teachmeskills.lesson_17.hw.task_1.MyFunc;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 & 2");


        while (true) {
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("1")) {
                MyFunc<String> my1;
                my1 = (str) -> {
                    StringBuffer buffer = new StringBuffer(str);
                    buffer.reverse();
                    return buffer.toString();
                };

                System.out.println(my1.doSomething("Ruslan")); // => nalsuR
                break;
            } else if (s.equalsIgnoreCase("2")) {
                MyFunc<Integer> my;
                my = (i) -> {
                    int result = 1;
                    for (int j = 1; j <= i; j++) {
                        result = result * j;
                    }
                    return result;
                };

                System.out.println(my.doSomething(10));
                break;
            } else {
                System.out.println("Invalid value, enter number 1 & 2");
            }
        }
    }
}
