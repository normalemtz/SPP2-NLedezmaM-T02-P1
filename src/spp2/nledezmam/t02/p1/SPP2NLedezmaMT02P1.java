/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.t02.p1;
import java.util.Scanner;
/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMT02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NORMA ALEJANDRA LEDEZMA MARTINEZ - A01411460 (IIS)
        
        Scanner tecl = new Scanner (System.in);
        //Variables
        
        int cate;
       System.out.println("Introduzca categoría (1-4) :");
        cate= tecl.nextInt();
        
        switch (cate){
                case 1 :
                    pago (30);
                 break;
                case 2: 
                    pago (38);
                break;
                case 3:
                    pago (50);
                break;
                case 4: 
                    pago (70);
                break;
                default:
                    System.out.println("Ingrese un valor entre los rangos");
               
            }
        }
    

    static void pago(double vex){
        Scanner tecl = new Scanner (System.in);
        double sue, he, paga;
        
        System.out.println("Introduzca sueldo base:");
        sue = tecl.nextDouble();
        System.out.println("Introduzca horas trabajadas");
        he= tecl.nextDouble(); 
        
        paga = sue + (vex * he); 
             System.out.println("La paga del trabajador es:" + paga);
    }
    
    
}
