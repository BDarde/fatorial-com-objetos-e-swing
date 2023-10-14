/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bruno
 */
public class Fatorial {
    private static int fatorial = 1;
    private static int num;
    private static String formula = "";
    
    public void setValor(int n){
        num = n;
        String s = " ";
        int f = 1;
        for (int i = n; i > 1; i--) {
         f *= i; 
         s +=   i + " x ";
        }
        s += "1 =";
        fatorial = f;
        formula = s;             
    }
    
     public int getFatorial(){
         return fatorial;
     }
     
     public String getFormula(){
         return formula;
     }
}
