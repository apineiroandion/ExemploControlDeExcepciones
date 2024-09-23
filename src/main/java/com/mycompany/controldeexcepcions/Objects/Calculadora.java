/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controldeexcepcions.Objects;

import com.mycompany.controldeexcepcions.CustomExceptions.MinhaExcepcionAritmetica;
import com.mycompany.controldeexcepcions.CustomExceptions.MinhaExcepcionExcepcional;

/**
 *
 * @author root
 */
public class Calculadora {
    
    private int operandoA;
    private int operandoB;
    private int operandoC;
    
    
    public int getOperandoA() {
        return operandoA;
    }

    public void setOperandoA(int operandoA) {
        this.operandoA = operandoA;
    }

    public int getOperandoB() {
        return operandoB;
    }

    public void setOperandoB(int operandoB) {
        this.operandoB = operandoB;
    }
    
    public Calculadora(String operandoA, String operandoB){
        this.operandoA = Integer.parseInt(operandoA.toString());
        this.operandoB = Integer.parseInt(operandoB.toString());
    }
    public Calculadora(String operandoA, String operandoB, String operandoC){
        if(operandoA.contains(".")||operandoB.contains(".")||operandoC.contains(".")){
            throw new MinhaExcepcionAritmetica("SEN PUNTOS");
        }else{
        this.operandoA = Integer.parseInt(operandoA.toString());
        this.operandoB = Integer.parseInt(operandoB.toString());
        this.operandoC = Integer.parseInt(operandoC.toString());
        }
    }
    public double divide()throws MinhaExcepcionAritmetica{
        if(operandoA==0 || operandoB == 0){
            throw new MinhaExcepcionAritmetica("Non dividas por 0");
        }else{
            return operandoA/operandoB;
        }
    }
    public int multiplica() throws MinhaExcepcionExcepcional{
        throw new MinhaExcepcionExcepcional("Multiplícanse os problemas");
    }
}
