
import javax.xml.bind.annotation.XmlAccessType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestPrimitiveType {
    public static void main(String[] args) {
        //整數類
     byte a = 10;//10進位
     short b =010;//8近位
     int c =0b010;//2進位 0b開頭2近位
     long d =0x010;//16近位
        System.out.println("a = " + a);//10
        System.out.println("b = " + b);//8
        System.out.println("c = " + c);//2
        System.out.println("d = " + d);//16
        int big =1__1_1;//底線純粹增加辨識度
        System.out.println(big);
       long verybig = 1234567890987654321L;//long型別+L
       //浮點數類
       float f1 =1.0f-0.8f;
       double d1 = 1.0-0.8;
       
        System.out.println("f1 = " + f1);//IEEE754 
        System.out.println("d1 = " + d1);//IEEE754 
        System.out.println(8E-1);//0.8
        System.out.println(1d);//1.0
        
    }    
}
