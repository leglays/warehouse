package com.tests.techTasks.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedReader br1 = new BufferedReader(new FileReader(args[1]));
            String str;
            double[] arrayRing = new double[2];
            double r = 0;
            for (int i = 0; (str = br.readLine()) != null ; i++) {
                if (i == 0) {
                    String[] arrayStr = str.split(" ");
                    arrayRing = new double[]{Double.parseDouble(arrayStr[0]), Double.parseDouble(arrayStr[1])};
                } else r = Double.parseDouble(str);
            }
            while ((str = br1.readLine()) != null) {
                String[] arrayStr = str.split(" ");
                double[] arrayPoint = new double[] {Double.parseDouble(arrayStr[0]), Double.parseDouble(arrayStr[1])};
                solution(arrayRing, r, arrayPoint);
            }
            br.close();
            br1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void solution(double[] arrayRing, double r, double[] arrayPoint) {
        double left = Math.pow(arrayPoint[0] - arrayRing[0], 2) + Math.pow(arrayPoint[1] - arrayRing[1], 2);
        double right = Math.pow(r, 2);
        if (left > right) System.out.println(2);
        else if (left < right) System.out.println(1);
        else System.out.println(0);
    }
}
