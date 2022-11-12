package com.tests.techTasks.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String str;
            ArrayList<Integer> integers = new ArrayList<>();
            while ((str = br.readLine()) != null) {
                integers.add(Integer.parseInt(str));
            }
            solve(integers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void solve(ArrayList<Integer> nums) {
        int sum = 0, med;
        Collections.sort(nums);
        if (nums.size() % 2 == 0) {
            med = (nums.get(nums.size() / 2) + nums.get(nums.size() / 2 - 1)) / 2;
        } else med = nums.get(nums.size() / 2);
        for (Integer num : nums) {
            sum += Math.abs(num - med);
        }
        System.out.println(sum);
    }
}
