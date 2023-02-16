package com.team.view;

import java.util.Scanner;

public class TSUtikity {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * 获取输入值，1到4，不是重新输入
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("选择错误，请重新输入:");
            } else break;
        }
        return c;
    }


    /**
     * 提示等待，直到客户输入回车返回
     */
    public static void readReturn() {
        System.out.println("按回车继续。。。。");
        readKeyBoard(100, true);
    }


    /**
     * 获取输入值，不超过2位，当返回值
     */
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入:");
            }
        }
        return n;
    }


    /**
     * 获取输入值，yn，当返回值
     */
    private static char readConfirmSelection() {

        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("输入错误，请重新输入：");
            }
        }
        return c;


    }

    private static String readKeyBoard(int limit, boolean blankReturn) {


        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度 (不大于" + limit + ") 错误，请重新输入:");
                continue;
            }
            break;
        }

        return line;


    }


}

