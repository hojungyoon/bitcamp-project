package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    final int LENGTH = 100;

    Scanner keyboardScan = new Scanner(System.in);
    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
    Date[] registeredDate = new Date[LENGTH];

    int size = 0;

    while (true) {
      System.out.print("[명령어] ");
      String input = keyboardScan.nextLine();

      if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
        System.out.println("-----[Bye!]-----");
        break;
      } else if (input.equalsIgnoreCase("/member/add")) {
        System.out.println("[회원등록]");

        for (int i = 0; i < LENGTH; i++) {
          System.out.print("번호? ");
          no[i] = Integer.parseInt(keyboardScan.nextLine());

          System.out.print("이름? ");
          name[i] = keyboardScan.nextLine();

          System.out.print("이메일? ");
          email[i] = keyboardScan.nextLine();

          System.out.print("암호? ");
          password[i] = keyboardScan.nextLine();

          System.out.print("사진? ");
          photo[i] = keyboardScan.nextLine();

          System.out.print("전화? ");
          tel[i] = keyboardScan.nextLine();

          registeredDate[i] = new java.sql.Date(System.currentTimeMillis());

          size++;
          System.out.println(); // 빈 줄 출력

          System.out.print("계속 입력하시겠습니까?(y/N) ");
          String str = keyboardScan.nextLine();
          if (!str.equalsIgnoreCase("y")) {
            break;
          }
          System.out.println(); // 빈 줄 출력
        }
      } else if (input.equalsIgnoreCase("/member/List")) {
        System.out.print("[회원목록]");
        for (int i = 0; i < size; i++) {
          // 번호, 이름, 이메일, 전화, 가입일
          System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
              no[i], name[i], email[i], tel[i], registeredDate[i]);
        }
      } else {
        System.out.println("잘못된 입력정보입니다.");
      }


    } 
    /*
    System.out.println("[회원]");


    // 최대 입력 개수
    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
    Date[] registeredDate = new Date[LENGTH];

    int size = 0;

    for (int i = 0; i < LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());

      System.out.print("이름? ");
      name[i] = keyboardScan.nextLine();

      System.out.print("이메일? ");
      email[i] = keyboardScan.nextLine();

      System.out.print("암호? ");
      password[i] = keyboardScan.nextLine();

      System.out.print("사진? ");
      photo[i] = keyboardScan.nextLine();

      System.out.print("전화? ");
      tel[i] = keyboardScan.nextLine();

      registeredDate[i] = new java.sql.Date(System.currentTimeMillis());

      size++;
      System.out.println(); // 빈 줄 출력

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String str = keyboardScan.nextLine();
      if (!str.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println(); // 빈 줄 출력
    }

    keyboardScan.close();

    System.out.println("--------------------------------");


    }
     */
    keyboardScan.close();
  }
}
