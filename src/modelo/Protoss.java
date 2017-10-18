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
public class Protoss extends Razas {

    private double pilones;

    public Protoss(double pilones, String nombre, int num_victorias, double nivel_ataque, double nivel_defensa) {
        super(nombre, num_victorias, nivel_ataque, nivel_defensa);
        this.pilones = pilones;
    }

    public double getPilones() {
        return pilones;
    }

    public void setPilones(double pilones) {
        this.pilones = pilones;
    }

    public double calcularPilonesA() {

        return (getNivel_ataque() + (pilones * 0.5));
    }

    public double calcularPilonesD() {

        return (getNivel_defensa() + (pilones * 0.5));
    }
}
