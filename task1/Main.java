package com.tests.techTasks.task1;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            integers.add(i);
        }
        solve(integers, Integer.parseInt(args[1]));
    }
    public static void solve(ArrayList<Integer> list, int turn) {
        int count = 1;
        String res = "1";
        for (int i = 0; i < list.size(); i++) {
            if (count == turn) {
                count = 1;
                if (list.get(i).equals(list.get(0))) break;
                res += list.get(i);
            }
            if (i == list.size() - 1) i = -1;
            count++;
        }
        System.out.println(res);
    }
}
