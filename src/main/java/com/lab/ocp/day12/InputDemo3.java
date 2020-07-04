/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class InputDemo3 {

    public static void main(String[] args) {
        input();
    }

    public static void input() {
        int[] y = {2, 5, 0}; // 分母
        System.out.print("請輸入分子: ");
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt(); // 取得使用者輸入分子
            System.out.print("請選擇分母鎮列維度(0:2, 1:5, 2:0) : ");
            int idx = sc.nextInt();
            int result = x / y[idx];
            System.out.printf("%d / %d = %d\n", x, y[idx], result);
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("操作錯誤, 錯誤原因: " + e);
            return;
        } catch (Exception e) {
            System.out.println("其他錯誤, 錯誤原因: " + e);
            return;
        } finally {
            System.out.println("Finsh");
        }
    }
}
