/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salud.IMC.saludIMC.data.dto;

/**
 *
 * @author Fabian Muñoz
 */
public class ImcCalculator {
    
   private Integer size;
   private  Integer weight;

    public ImcCalculator() {
    }

    public ImcCalculator(Integer size, Integer weight) {
        this.size = size;
        this.weight = weight;
    }
    
    

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    
    
}
