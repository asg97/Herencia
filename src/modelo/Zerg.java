/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAM
 */
public class Zerg extends Razas {

    private double esbirros;
    private double overlords;

    public Zerg(double esbirros, double overlords, String nombre, int num_victorias, double nivel_ataque, double nivel_defensa) {
        super(nombre, num_victorias, nivel_ataque, nivel_defensa);
        this.esbirros = esbirros;
        this.overlords = overlords;
    }

    public double getEsbirros() {
        return esbirros;
    }

    public void setEsbirros(double esbirros) {
        this.esbirros = esbirros;
    }

    public double getOverlords() {
        return overlords;
    }

    public void setOverlords(double overlords) {
        this.overlords = overlords;
    }

    public double calculoEsbirrosA() {

        return (getNivel_ataque() + (esbirros * 0.15));

    }

    public double calculoEsbirrosD() {

        return (getNivel_defensa() + (esbirros * 0.30));

    }

    public double calculoOverlords() {

        return (getNivel_ataque() + (overlords * 0.40));

    }

}
