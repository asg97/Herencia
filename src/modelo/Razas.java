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
public class Razas {

    private String nombre;
    private int num_victorias;
    private double nivel_ataque;
    private double nivel_defensa;

    public Razas(String nombre, int num_victorias, double nivel_ataque, double nivel_defensa) {
        this.nombre = nombre;
        this.num_victorias = num_victorias;
        this.nivel_ataque = nivel_ataque;
        this.nivel_defensa = nivel_defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_victorias() {
        return num_victorias;
    }

    public void setNum_victorias(int num_victorias) {
        this.num_victorias = num_victorias;
    }

    public double getNivel_ataque() {
        return nivel_ataque;
    }

    public void setNivel_ataque(double nivel_ataque) {
        this.nivel_ataque = nivel_ataque;
    }

    public double getNivel_defensa() {
        return nivel_defensa;
    }

    public void setNivel_defensa(double nivel_defensa) {
        this.nivel_defensa = nivel_defensa;
    }

}
