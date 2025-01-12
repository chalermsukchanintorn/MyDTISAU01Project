package com.thailand.dti;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WowWow {
    public static void main(String[] args) throws IOException {
        //สร้างตัวแปร variable =>  ชนิดข้อมูล  ชื่อตัวแปร;
        String yourName;
        //เลขจำนวนเต็ม byte short int long
        int yourAge;
        //เลขจำนวนจริง float double
        double yourSalary;
        
        //รับค่า input โดยใช้ InputStreamReader/BufferedReader 
        //สร้างตัวแทนของคลาส InputStreamReader/BufferedReader ขึ้นมา
        //เรียกว่า Object หรือเรียกว่า Instance of Class
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);   
        //Byte.paseByte(), Short.parseShort(), Long.parseLong()
        //Float.parseFloat()
        
        System.out.print("Enter your name: ");
        yourName = reader.readLine(); //ข้อมูลที่ป้อนถือเป็น String ทั้งหมด
        System.out.print("Enter your age: ");
        yourAge = Integer.parseInt( reader.readLine() );
        System.out.print("Enter your salary: ");
        yourSalary = Double.parseDouble( reader.readLine() );             
        System.out.println("---------------------------");        
        System.out.println("Hi...." + yourName);
        System.out.println("You are " + yourAge + " years old");
        System.out.println("Your salary is " + yourSalary + " Bath");
    }
}
