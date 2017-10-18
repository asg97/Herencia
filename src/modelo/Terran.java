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
public class Terran extends Razas{
    private double num_edificios;
    private double tecnologia;

    

    public Terran(double num_edificios, double tecnologia, String nombre, int num_victorias, double nivel_ataque, double nivel_defensa) {
        super(nombre, num_victorias, nivel_ataque, nivel_defensa);
        this.num_edificios = num_edificios;
        this.tecnologia = tecnologia;
    }

    public double getNum_edificios() {
        return num_edificios;
    }

    public void setNum_edificios(double num_edificios) {
        this.num_edificios = num_edificios;
    }

    public double getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(double tecnologia) {
        this.tecnologia = tecnologia;
    }
    
public double calculoEdificio(){

return (getNivel_defensa()+(num_edificios *0.25));
}
    
   
  public double calculoTecnologia(){

return(getNivel_ataque()+(tecnologia*0.5));
}  
    
}
