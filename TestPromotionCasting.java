/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestPromotionCasting {
    public static void main(String[] args) {
        byte a,b;
        a=12;
        b=a;
               System.out.println(b);
       short c;
       c=b;//promotion
        System.out.println(c);//12
        
        char d ='a';
        int k,k2;
        k=d;        
        System.out.println("k="+k);
        k2 = d+'1';
        System.out.println("k2="+k2);
        System.out.println(d);
        int zero = '0';//int 轉成 byte  0 //promotion
        System.out.println(zero);
        
        char one = (char)(zero+2); //casting
        System.out.println("one="+one);//2
        
        int m =88*365;      
             if (m>=-32768 & m<=32767){
                 short h = (short)m;
         System.out.println("h="+h);        
         }
              }            
        
                
    }

