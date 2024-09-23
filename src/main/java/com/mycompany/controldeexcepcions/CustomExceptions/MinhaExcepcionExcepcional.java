/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controldeexcepcions.CustomExceptions;

/**
 *
 * @author root
 */
public class MinhaExcepcionExcepcional extends Exception {
    //Constructor base, lanzará o texto de excepcion xenerico
    public MinhaExcepcionExcepcional(){}
    
    //Constructor con parámetro de mensaxe, que devolverá a mensaxe que queiramos
    public MinhaExcepcionExcepcional(String message){
        super(message);
    }
    //constructor con throwable, que lanzará a causa que lle pasemos
    public MinhaExcepcionExcepcional(Throwable cause){
        super(cause);
    }
    //constructor con throwable, que lanzará a causa que lle pasemos e a mensaxe que escollamos
    public MinhaExcepcionExcepcional(String message, Throwable cause){
        super(message, cause);
    }
    
}
