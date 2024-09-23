/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controldeexcepcions;

import com.mycompany.controldeexcepcions.CustomExceptions.MinhaExcepcionAritmetica;
import com.mycompany.controldeexcepcions.CustomExceptions.MinhaExcepcionExcepcional;
import com.mycompany.controldeexcepcions.Objects.Calculadora;

/**
 *
 * @author root
 */
public class NinhoDeErros {

    public String variable;
    
    public NinhoDeErros() {
    }
    
    public double calculandoAlgo(Calculadora calculadora) throws MinhaExcepcionExcepcional{
   
        /*ó declarar na sinatura a excepción, evitamos o bloque try catch, pero queda nas mans do invocante
        captura-la excepción*/
           return calculadora.multiplica();
            
   
    }
}
