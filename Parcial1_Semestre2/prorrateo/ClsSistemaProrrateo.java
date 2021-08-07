/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prorrateo;

import com.columnas.ClsColumnas;

/**
 *
 * @author 7010
 */
public class ClsSistemaProrrateo {
    private String[][] prorrateo;
    private static final int DETALLE =0;
    private static final int NUNIDADES =1;
    private static final int VSFACTURA =2;
    private static final int GVALOR =3;
    private static final int GPESO =4;
    private static final int CUNIDAD =5;
    private static final int CTOTAL =6;
    private int filaActual =0;
    
    private final int MAX_FILAS =6;
    private final int MAX_COLUMNAS =7;
    private int totalFilas =0;
    
    public ClsSistemaProrrateo(int filas){ 
        if (filas>MAX_FILAS) {
            throw (new IllegalArgumentException());
        }else{
            totalFilas = filas;
            prorrateo = new String[totalFilas][MAX_COLUMNAS]; 
        }
    }
    
    public String AgregaColumnasMatriz(ClsColumnas prorra){
        if (filaActual >= MAX_FILAS){
            return "Ya llegaste al final";
        }else{
            prorrateo[filaActual][DETALLE]=prorra.getDescripcion();
            prorrateo[filaActual][NUNIDADES]=prorra.getnUnidades()+"";
            prorrateo[filaActual][VSFACTURA]=prorra.getvSegunFactura()+"";
            prorrateo[filaActual][GVALOR]=prorra.getGastoValor()+"";
            prorrateo[filaActual][GPESO]=prorra.getGastoPeso()+"";
            prorrateo[filaActual][CUNIDAD]=prorra.getCostoUnidad()+"";
            prorrateo[filaActual][CTOTAL]=prorra.getCostoTotal()+"";
            filaActual = filaActual +1;
                    }
        
         return "OK";
    }
    
        public void imprimirDecorado(){
        for (int x = 0; x < prorrateo.length; x++) {
            System.out.print("|");
            for (int y = 0; y < prorrateo[x].length; y++) {
                System.out.print(prorrateo[x][y]);
                if (y != prorrateo[x].length -1) {
                    System.out.print("\t");
                }
            }
                System.out.println("|");
        }
    
    } 
        
         public double sumaColumna(int columna){
        double total=0.0;
        for (int y = 0; y < filaActual; y++) {
            String col = prorrateo[y][columna];
            total = total + Double.valueOf(col);
             
            
        }
        return total;
    }
    
}
