/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controldeexcepcions.CustomExceptions;

/**
 *
 * @author root
 */
public class MinhaExcepcionAritmetica extends ArithmeticException{
      //Constructor base, lanzará o texto de excepcion xenerico
    public MinhaExcepcionAritmetica(){}
    
    //Constructor con parámetro de mensaxe, que devolverá a mensaxe que queiramos
    public MinhaExcepcionAritmetica(String message){
        super(message);
    }
    
    //Se descomentamos o constructor, veremos que non se pode chamar ó super con dous parámetros
    //pois a excepción aritmética, a diferencia de runTime e Exception, non ten excepcións fillas na xerarquía de excepcións.
    //é dicir, xa é unha causa.
/* 
    public MinhaExcepcionAritmetica(String message, Throwable cause){
      super(message,cause);
    }
*/
}
