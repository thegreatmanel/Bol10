/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin10 {

public static void metodo(){
    int numero1=Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero secreto"));
    int numintentos=Integer.parseInt(JOptionPane.showInputDialog("Cantos intentos?"));
   int numero2=0;
   while(numintentos!=0&&numero1!=numero2){
       JOptionPane.showMessageDialog(null, "quedan "+numintentos+ " intentos");
   numintentos--;
    numero2=Integer.parseInt(JOptionPane.showInputDialog("Cal crees que e o numero?"));
    if(numero1>numero2){
    JOptionPane.showMessageDialog(null, "Andas corto");}
    else if(numero2>numero1){
    JOptionPane.showMessageDialog(null, "Pasacheste");}}}

    public static void main(String[] args) {
        metodo();
    
    
}}
