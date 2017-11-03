/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phat.util;

import java.util.Scanner;

/**
 *
 * @author lionsibi
 */
public class Inputer {
    public static double inputReal(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                return Double.parseDouble(sc.nextLine());
            }catch(Exception e){
                System.out.println("DOUBLE!!!");
            }
        }
    }
    
    public static int intputInteger(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                return Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println("INTEGER!!!");
            }
        }
    }
    
    public static String inputString(){
        Scanner sc = new Scanner(System.in);
        String s; 
        while(true){
            s = sc.nextLine();
            if(s == ""){
                System.out.println("You did not do anything ?? :D ??");
            }else{
                return s.trim().toUpperCase();
            }
            
        }
    }
}
