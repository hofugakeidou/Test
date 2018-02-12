package com.my.Recursion;
public class Recursion {
    /**
     * @Author Huang Yifan
     * @param n
     * @return ...
     *@vision
     */


    static int si = 5;

    public static void main(String[] args) {
        int i = 5;
        print(si);
        print(i);
        System.out.println("end");
    }

    public static int print(int i) {
        if (i == 0) {
            System.out.println(0);
            return 0;
        } else {
            System.out.println(i);
            print(i - 1);
            return 0;
        }
    }
}
