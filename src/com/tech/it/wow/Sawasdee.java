package com.tech.it.wow;

//คลาสใดๆ ที่อยู่ใน java.lang ไม่จำเป็นต้อง import
import java.lang.System;
import java.lang.String;

public class Sawasdee {
    //psvm แล้ว TAB
    //public static สลับตำแหน่กันได้ ,  [ ]  ไปไว้หลัง args ได้, args เปลี่ยนเป็นชื่ออื่นได้
    public static void main(String[] args) {
        //sout แล้ว TAB
        //แสดง String คือ ตัวอักษรตั้งแต่ 0 ตัวขึ้นไป
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.print("CCC");
        System.out.println("DDD");
        System.out.println("EEE");
        System.out.println("");
        //แสดง Number
        System.out.println(123456);
        System.out.println(123.456);
        //แสดง Boolean
        System.out.println(true);
        System.out.println(false);
        //แสดง Character คือ ตัวอักษร 1 ตัว
         System.out.println('A');
         System.out.println('#');
         System.out.println('5');
         //-----------------------------------
         //แสดงข้อมูลประเภทปนกัน ให้ใช้เครื่อง + ในการเชื่ิอม (concat)
         //โดยผลลัพธ์ที่ได้จะเป็น String
         System.out.println("AAA" + 123456 + 'X' + true + 555 + "BBB");
         
         System.out.println(10 + 10 + "10" + 10);  //201010
         
         System.out.println("10" + 10 + 10 + 10);  //10101010
         
    }
}
















