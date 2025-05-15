package com.selecaosimples;

import javax.swing.JOptionPane;

public class Selecaosimples {

    public static void main(String[] args) {
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número:"));
        
        
        if 
           (numero > 10){
            JOptionPane.showMessageDialog(null, "O seu número é: " + (numero / 2));
        }else{
            JOptionPane.showMessageDialog(null, "O seu número é: " + (numero * 2));
        }
        
        }
    }

