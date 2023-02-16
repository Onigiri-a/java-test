package com.team.view;

import java.util.Scanner;

public class TSUtikity {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * ��ȡ����ֵ��1��4��������������
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("ѡ���������������:");
            } else break;
        }
        return c;
    }


    /**
     * ��ʾ�ȴ���ֱ���ͻ�����س�����
     */
    public static void readReturn() {
        System.out.println("���س�������������");
        readKeyBoard(100, true);
    }


    /**
     * ��ȡ����ֵ��������2λ��������ֵ
     */
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("���������������������:");
            }
        }
        return n;
    }


    /**
     * ��ȡ����ֵ��yn��������ֵ
     */
    private static char readConfirmSelection() {

        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("����������������룺");
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
                System.out.print("���볤�� (������" + limit + ") ��������������:");
                continue;
            }
            break;
        }

        return line;


    }


}
