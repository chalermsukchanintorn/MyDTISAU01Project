package com.dti.operator;

public class Km1OPT {
    //Operator ตัวดำเนินการ
    public static void main(String[] args) {
        //Arithematic Opt . + - * / %
        System.out.println(10 + 7);
        System.out.println(10 - 7);
        System.out.println(10 * 7);
        System.out.println(10 / 7);
        System.out.println(10.0 / 7);
        System.out.println(10 / 7.0);
        System.out.println(10 % 7); //Mod หารเอาเศษ      
        System.out.println("------------------------------");
        //Comparation Opt. ==  !=  <  <=  >   >=
        //เปรียบเทียบได้แต่ number หรือ character
        System.out.println(10 > 7);
        System.out.println(10 < 7);
        System.out.println(10 == 7);
        System.out.println(10 != 7);
        System.out.println(10 <= 7);
        System.out.println(10 >= 7);
        //System.out.println("Mod" > "Mee"); Error
        System.out.println('A' > 'c');
        System.out.println("------------------------------");
        //Logical Opt.  !(not)  &&(and)   ||(or) ใช้กับค่าที่เป็น ิboolean (true/false)
        System.out.println(!true);
        System.out.println(!false);
        System.out.println("------------------------------");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println("------------------------------");
        System.out.println(false || false);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(true || true);        
    }
}
