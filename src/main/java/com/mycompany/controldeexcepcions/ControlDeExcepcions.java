/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controldeexcepcions;

import com.mycompany.controldeexcepcions.CustomExceptions.MinhaExcepcionAritmetica;
import com.mycompany.controldeexcepcions.CustomExceptions.MinhaExcepcionDeRunTime;
import com.mycompany.controldeexcepcions.CustomExceptions.MinhaExcepcionExcepcional;
import com.mycompany.controldeexcepcions.Objects.Calculadora;

/**
 *
 * @author root
 */
public class ControlDeExcepcions {

    public static void main(String[] args) /*throws MinhaExcepcionExcepcional */{
       
        try{
            Calculadora calculadora = new Calculadora("asd", "asd");
        }catch(ArrayIndexOutOfBoundsException AIex){
            System.out.println("Excepcion Array, non salta, xa que non é o tipo de excepció capturada");       
        }
        /* Se descomento este bloque de abaixo (e borro o corchete da liña 24) verei que o IDE xa me avisa que as excepcións de abaixo nunca saltarán)
        xa que as excepcións captúranse de máis concreta a máis xenérica*/
        /*
        }catch(Exception excepcion){
            System.out.println("Superior na xerarquía");
        }
        */
        catch(NumberFormatException nFex){
            System.out.println("Saltou esta excepcion primeiro : " + nFex.getMessage());
        }catch(Exception excepcion){
            System.out.println("Esta excepción non salta, pero poderíamos comentar o catch anterior e entraría por este");
        }
        
        System.out.println("O meu código segue");
        
        try{
        Calculadora calculadora2 = new Calculadora("1.84","2.5");
        }catch(NumberFormatException exc){
         //throw new MinhaExcepcionAritmetica("Integer non é double");
         System.out.println("A excepcion foi: "+ exc.getMessage());
        }
        System.out.println("Chego ata aquí se capturo o throw");
        
        Calculadora calculadoraExcepcional = new Calculadora("5","0","5");
        
       /* System.out.println("Se operandoB é 0 terei unha excepción definida na clase Calculadora");
        System.out.println(imprimeDivision(calculadoraExcepcional));
        System.out.println("Se operandoB é 0 non chego aquí");
        */
         
        try{
            System.out.println(imprimeDivision(calculadoraExcepcional));
        }catch(MinhaExcepcionAritmetica arexc){
            System.out.println("Excepcion capturada: "+arexc.getMessage());
        } 
       
        System.out.println("Se comento o bloque de arriba e descomento o tryCatch para captura-la excepción, seguirei executando código");
        
        /*Da igual cantos throw lance, se os capturo nun punto superior da árbore de execución seguirá o programa, se non capturo as excepcións
        que lanza o código, cortarase a execución
        
        */
        
        NinhoDeErros erros = new NinhoDeErros();
        
        /*Se descomentamos a chamada do método de abaixo deberemos engadir un throws á sinatura do main, pero ó non ter
        invocante, o programa romperá
        */
        // erros.calculandoAlgo(calculadoraExcepcional);
        /*
        Debemos capturalo como no exemplo seguinte
        */
        
        try{
        erros.calculandoAlgo(calculadoraExcepcional);
        }catch(MinhaExcepcionExcepcional exc){
            System.out.println("Capturada a excepción: "+exc.getMessage());
        }
        
        // e así completamos a execución exitosamente
        
        System.out.println("Excepcións Controladas!!");
    }
    public static Double imprimeDivision(Calculadora calculadora){
        return calculadora.divide();
       
    }
}
