package com.eomcs.pms;
import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("[프로젝트]");

    System.out.print("번호? ");
    int number = scanner.nextInt();

    scanner.nextLine();

    System.out.print("프로젝트명? ");
    String projectName = scanner.nextLine();

    System.out.print("내용? ");
    String contents = scanner.nextLine();

    System.out.print("시작일? ");
    Date startDate = Date.valueOf(scanner.nextLine());

    System.out.print("종료일? ");
    Date endtDate = Date.valueOf(scanner.nextLine());

    System.out.print("만든이? ");
    String owner = scanner.nextLine();

    System.out.print("팀원? ");
    String teamMembers = scanner.nextLine();

    scanner.close();

    System.out.println("----------------------------");
    System.out.printf("번호: %d\n", number);
    System.out.printf("프로젝트명: %s\n", projectName);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("시작일: %s\n", startDate);
    System.out.printf("종료일: %s\n", endtDate);
    System.out.printf("만든이: %s\n", owner);
    System.out.printf("팀원: %s\n", teamMembers);


  }
}
