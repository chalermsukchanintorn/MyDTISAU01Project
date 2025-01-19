package com.sau.workshop;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.*;
import java.text.DecimalFormat;

//โปรแกรมคำนวณหาค่า BMI โดยรับค่า ชื่อ น้ำหนัก (kg) ส่วนสูง (m) ทางแป้นพิมพ์
//แล้วแสดงผลค่า BMI ทางหน้าจอ 
//BMI = น้ำหนัก ÷ ส่วนสูง² 
public class BMIProject {

    public static void main(String[] args) throws IOException {
        String yourName;
        double yourWeight, yourHeight, yourBMI;

//        InputStreamReader input = new InputStreamReader(System.in);
//        BufferedReader reader = new BufferedReader(input);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.0000");

        System.out.println("++++++++++++++++++++++");
        System.out.println("      BMI  Program by DTI-SAU");
        System.out.println("++++++++++++++++++++++");
        System.out.print("Input your name: ");
        yourName = reader.readLine();
        System.out.print("Input your weight (kg): ");
        yourWeight = Double.parseDouble(reader.readLine());
        System.out.print("Input your height (m): ");
        yourHeight = Double.parseDouble(reader.readLine());
        System.out.println("++++++++++++++++++++++");
//        yourBMI = yourWeight / (yourHeight * yourHeight);
        yourBMI = yourWeight / Math.pow(yourHeight, 2);
//        System.out.println("BMI of " + yourName + " is " + yourBMI);
        System.out.println("BMI of " + yourName + " is " + df.format(yourBMI) );
        System.out.println("++++++++++++++++++++++");     
    }
}
