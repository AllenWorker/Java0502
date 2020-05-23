package com.lab.ocp.day01;

import java.util.Scanner;

public class ATM {

    

    public static void main(String[] args) {
        Account account = new Account();
        menu(account);
    }

    public static void menu(Account account) {
        char answer;
        int amount;
        System.out.println("---------------------");
        System.out.println("1. 設定帳戶名稱");
        System.out.println("2. 帳戶存款");
        System.out.println("3. 帳戶提款");
        System.out.println("4. 帳戶查詢");
        System.out.println("5. 離開");
        System.out.println("---------------------");
        System.out.println("請選擇服務項目(1-5): ");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        switch (item) {
            case 1:
                System.out.println("請輸入英文名稱: (10字以內)");
                String name = sc.next();
                System.out.printf("帳戶名稱: %s 是否正確? [Y/N]\n", name);
                answer = Character.toUpperCase(sc.next().charAt(0));
                switch (answer) {
                    case 'Y':
                        account.setName(name);
                        break;
                    case 'N':
                        System.out.println("返回");
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("請輸入金額:");
                amount = sc.nextInt();
                System.out.printf("金額 $%,d 是否正確? [Y/N]", amount);
                answer = Character.toUpperCase(sc.next().charAt(0));
                //account.setName();
                switch (answer) {
                    case 'Y':
                        account.deposit(amount);
                        break;
                    case 'N':
                        System.out.println("返回");
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("請輸入金額:");
                amount = sc.nextInt();
                System.out.printf("金額 $%,d 是否正確? [Y/N]", amount);
                answer = Character.toUpperCase(sc.next().charAt(0));
                //account.setName();
                switch (answer) {
                    case 'Y':
                        account.withdraw(amount);
                        break;
                    case 'N':
                        System.out.println("返回");
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                account.print();
                break;
            case 5:
                System.out.println("謝謝惠顧!");
                return;
            default:
                break;
        }
        menu(account);
    }
}
