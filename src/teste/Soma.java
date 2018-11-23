/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author vanes
 */
public class Soma {
    static double soma(double v1, double v2){
        return v1+v2;
    }
    static int soma(int v1, int v2){
        return v1+v2;
    }
    static String soma(String v1, String v2){
        return v1+v2;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Soma: "+soma(1,2));
        System.out.println("Soma: "+soma(1.0,2));
        System.out.println("Soma: "+soma("1","2"));
    }
}
