/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VPFK.ferramentas;

import com.VFPK.Modelo.Veiculo;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author ageuv
 */
public class Ordenador {
    class VeiculoComparator implements Comparator<Veiculo> {
    @Override
    public int compare(Veiculo veiculo1, Veiculo veiculo2) {
        // Primeiro critério de comparação: ordem alfabética do modelo
        
        int resultado = veiculo1.getModelo().compareTo(veiculo2.getModelo());

        // Se os nomes forem iguais, aplicamos o segundo critério: data de fabricação
        if (resultado == 0) {
            resultado = Integer.compare(veiculo1.getAnoFab(), veiculo2.getAnoFab());
        }
        return resultado;
    }
}
    //                                   |
    //COLOCAR ESSE CODIGO ONDE FOR RODAR V
    //Collections.sort(veiculos, new VeiculoComparator());
    
}
