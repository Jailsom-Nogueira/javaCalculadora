/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocalculadora.controle;

import com.mycompany.projetocalculadora.enums.EnumOperacao;

/**
 *
 * @author https://github.com/Jailsom-Nogueira 
 */
public class CalculadoraController {
    private Double total;
    private Boolean zerada;
    
    public CalculadoraController() {
        total = 0.0;
        zerada = true;
    }
    
    public Double realizaOperacao(EnumOperacao operacao, Double valor){
        switch (operacao) {
            case ADICAO -> {
                if(zerada){
                    total = valor;
                    zerada = false;
                }else{
                    total += valor;
                    zerada = false;
                }
            }
            case SUBTRACAO -> {
                if(zerada){
                    total = valor;
                    zerada = false;
                }else{
                    total -= valor;
                    zerada = false;
                }
            }
            case MULTIPLICACAO -> {
                if(zerada){
                    total = valor;
                    zerada = false;
                }else{
                    total *= valor;
                    zerada = false;
                }
            }
            case DIVISAO -> {
                if(zerada){
                    total = valor;
                    zerada = false;
                }else{
                    total /= valor;
                    zerada = false;
                }
            }
            case PORCENTAGEM_ADICAO -> {
                if(zerada){
                    total = valor;
                    zerada = false;
                }else{
                    double percentual = total / 100;
                    total = total + (percentual * valor);
                    zerada = true;
                }
            }
            case PORCENTAGEM_SUBTRACAO -> {
                if(zerada){
                    total = valor;
                    zerada = false;
                }else{
                    double percentual = total / 100;
                    total = total - (percentual * valor);
                    zerada = true;
                }
            }
            case DIMINUI_NUMERO -> total = valor;
            case IGUAL -> {
            }
            default -> {
            }
        }
        return total;
    }
    
    public Double getTotal() {
        return this.total;
    }
    
    public Boolean getZerada() {
        return this.zerada;
    }
        
    public void zerar(){
        total = 0.0;
        zerada = true;
    }
}
