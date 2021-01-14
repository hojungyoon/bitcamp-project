package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    java.io.InputStream keybord = System.in;
    Scanner keyScan= new Scanner(keybord);
    Date day = new Date();

    System.out.print("번호? ");
    String number = keyScan.nextLine();

    System.out.print("이름? ");
    String name = keyScan.nextLine();

    System.out.print("이메일? ");
    String eMail = keyScan.nextLine();

    System.out.print("암호? ");
    String passWord = keyScan.nextLine();

    System.out.print("사진? ");
    String picture = keyScan.nextLine();

    System.out.print("전화? ");
    String callNumber = keyScan.nextLine();


    System.out.println("----------------------------");
    System.out.printf("번호: %s\n이름: %s\n이메일: %s\n암호: %s\n사진: %s\n전화: %s\n",number, name, eMail, passWord, picture, callNumber);
    System.out.printf("가입일: %1$tY-%1$tM-%1$td", day);

    keyScan.close();


  }
}
