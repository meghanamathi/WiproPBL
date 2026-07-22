package com.wipro.task;

import java.util.Arrays;

public class DailyTasks {

    // Concatenate two strings
    public String doStringConcat(String s1, String s2) {
        return s1 + " " + s2;
    }

    // Sort an integer array
    public int[] sortValues(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    // Check whether a string contains another string
    public boolean checkPresence(String str, String a) {
        return str.contains(a);
    }
}