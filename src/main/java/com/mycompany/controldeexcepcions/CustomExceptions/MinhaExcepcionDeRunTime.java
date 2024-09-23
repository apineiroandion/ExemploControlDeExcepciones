/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controldeexcepcions.CustomExceptions;

/**
 *
 * @author root
 */
public class MinhaExcepcionDeRunTime extends RuntimeException{
    

    //Constructor base, lanzará o texto de excepcion xenerico
    public MinhaExcepcionDeRunTime(){}
    
    //Constructor con parámetro de mensaxe, que devolverá a mensaxe que queiramos
    public MinhaExcepcionDeRunTime(String message){
        super(message);
    }
    
    //constructor con throwable, que lanzará a causa que lle pasemos
    public MinhaExcepcionDeRunTime(Throwable cause){
        super(cause);
    }
    
    //constructor mensaxe e con throwable, que lanzará a causa que lle pasemos e a mensaxe que escollamos
    public MinhaExcepcionDeRunTime(String message, Throwable cause){
        super(message,cause);

    }
    
}
