package com.eomcs.pms;
import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("[작업]");

    System.out.print("프로젝트? ");
    String project = scanner.nextLine();

    System.out.print("번호? ");
    int number = scanner.nextInt();

    scanner.nextLine();

    System.out.print("내용? ");
    String contents = scanner.nextLine();

    System.out.print("완료일? ");
    Date endDay = Date.valueOf(scanner.nextLine());

    System.out.print("상태?\n");
    System.out.print("0: 신규\n");
    System.out.print("1: 진행중\n");
    System.out.print("2: 완료\n");
    System.out.print("> ");
    int choice = scanner.nextInt();

    scanner.nextLine();

    System.out.print("담장자? \n");
    String owner = scanner.nextLine();

    System.out.println("-----------------------------");

    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %s\n", number);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("완료: %s\n", endDay);

    if(choice == 0) {
      System.out.println("상태: 신규");
    }else if(choice == 1) {
      System.out.println("상태: 진행중");
    }else if(choice == 2) {
      System.out.println("상태: 완료");
    }

    System.out.printf("담당자: %s\n", owner);


  }
}
