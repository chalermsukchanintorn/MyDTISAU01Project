package com.thailand.dti;

import java.util.Scanner;

public class ByeBye {
    public static void main(String[] args) {
        //สร้างตัวแปร variable =>  ชนิดข้อมูล  ชื่อตัวแปร;
        String yourName;
        //เลขจำนวนเต็ม byte short int long
        int yourAge;
        //เลขจำนวนจริง float double
        double yourSalary;

        //รับค่า input โดยใช้ Scanner จะสร้างตัวแทนของคลาส Scanner ขึ้นมา
        //เรียกว่า Object หรือเรียกว่า Instance of Class
        Scanner sc = new Scanner(System.in);
        //nextBtye(), nextShort(), nextLong(), nextFloat()

        System.out.print("Enter your name: ");
        yourName = sc.next();
        System.out.print("Enter your age: ");
        yourAge = sc.nextInt();
        System.out.print("Enter your salary: ");
        yourSalary = sc.nextDouble();
        System.out.println("---------------------------");
        System.out.println("Hi...." + yourName);
        System.out.println("You are " + yourAge + " years old");
        System.out.println("Your salary is " + yourSalary + " Bath");
    }
}
