/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.columnas;

/**
 *
 * @author 7010
 */
public class ClsColumnas {

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the nUnidades
     */
    public double getnUnidades() {
        return nUnidades;
    }

    /**
     * @param nUnidades the nUnidades to set
     */
    public void setnUnidades(double nUnidades) {
        this.nUnidades = nUnidades;
    }

    /**
     * @return the vSegunFactura
     */
    public double getvSegunFactura() {
        return vSegunFactura;
    }

    /**
     * @param vSegunFactura the vSegunFactura to set
     */
    public void setvSegunFactura(double vSegunFactura) {
        this.vSegunFactura = vSegunFactura;
    }

    /**
     * @return the gastoValor
     */
    public double getGastoValor() {
        return gastoValor;
    }

    /**
     * @param gastoValor the gastoValor to set
     */
    public void setGastoValor(double gastoValor) {
        this.gastoValor = gastoValor;
    }

    /**
     * @return the gastoPeso
     */
    public double getGastoPeso() {
        return gastoPeso;
    }

    /**
     * @param gastoPeso the gastoPeso to set
     */
    public void setGastoPeso(double gastoPeso) {
        this.gastoPeso = gastoPeso;
    }

    /**
     * @return the costoUnidad
     */
    public double getCostoUnidad() {
        return costoUnidad;
    }

    /**
     * @param costoUnidad the costoUnidad to set
     */
    public void setCostoUnidad(double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }

    /**
     * @return the costoTotal
     */
    public double getCostoTotal() {
        return costoTotal;
    }

    /**
     * @param costoTotal the costoTotal to set
     */
    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    private String descripcion;
    private double nUnidades;
    private double vSegunFactura;
    private double gastoValor;
    private double gastoPeso;
    private double costoUnidad;
    private double costoTotal;
    
    
}
