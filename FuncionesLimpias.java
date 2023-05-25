package com.examples;

public class FuncionesLimpias {
    public static void main(String[] args) {
        System.out.println("El resultado es:" +sumarNumeros(1,3));
        System.out.println("¿Hoy es dia de pago? " + esDiaDePago(15));
    }


    public static int sumarNumeros(int iNumero1, int iNumero2){
        return iNumero1+iNumero2;
    }
    public static boolean esDiaDePago (int iNumber){
        return iNumber == 15 || iNumber == 30;
    }
}
