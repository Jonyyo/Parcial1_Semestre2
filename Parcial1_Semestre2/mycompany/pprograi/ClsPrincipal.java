/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pprograi;

import com.columnas.ClsColumnas;
import com.prorrateo.ClsSistemaProrrateo;

/**
 *
 * @author 7010
 */
public class ClsPrincipal {
    
    public static void main(String[] args) {
        ClsSistemaProrrateo co = new ClsSistemaProrrateo(4);
        ClsColumnas columna = new ClsColumnas();
        columna.setnUnidades(50);
        columna.setvSegunFactura(60);
        columna.setGastoValor(columna.getvSegunFactura()*0.232);
        columna.setGastoPeso(columna.getnUnidades()*0.75);
        columna.setCostoUnidad(columna.getvSegunFactura()+columna.getGastoValor()+columna.getGastoPeso());
        columna.setCostoTotal(columna.getnUnidades()*columna.getCostoUnidad());
        columna.setDescripcion("cemento");
        co.AgregaColumnasMatriz(columna);
        
        
        columna.setnUnidades(150);
        columna.setvSegunFactura(40);
        columna.setGastoValor(columna.getvSegunFactura()*0.232);
        columna.setGastoPeso(columna.getnUnidades()*0.75);
        columna.setCostoUnidad(columna.getvSegunFactura()+columna.getGastoValor()+columna.getGastoPeso());
        columna.setCostoTotal(columna.getnUnidades()*columna.getCostoUnidad());
        columna.setDescripcion("cal");
        co.AgregaColumnasMatriz(columna);
        
        columna.setnUnidades(200);
        columna.setvSegunFactura(55);
        columna.setGastoValor(columna.getvSegunFactura()*0.232);
        columna.setGastoPeso(columna.getnUnidades()*0.75);
        columna.setCostoUnidad(columna.getvSegunFactura()+columna.getGastoValor()+columna.getGastoPeso());
        columna.setCostoTotal(columna.getnUnidades()*columna.getCostoUnidad());
        columna.setDescripcion("tubos");
        co.AgregaColumnasMatriz(columna);
        
        columna.setnUnidades(50);
        columna.setvSegunFactura(350);
        columna.setGastoValor(columna.getvSegunFactura()*0.232);
        columna.setGastoPeso(columna.getnUnidades()*0.75);
        columna.setCostoUnidad(columna.getvSegunFactura()+columna.getGastoValor()+columna.getGastoPeso());
        columna.setCostoTotal(columna.getnUnidades()*columna.getCostoUnidad());
        columna.setDescripcion("Hierro");
        co.AgregaColumnasMatriz(columna);
        
        
        co.imprimirDecorado();      
        co.imprimirDecorado(); 
        
    }
    
}
