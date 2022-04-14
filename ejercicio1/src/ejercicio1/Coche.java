/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Sergio
 */
public class Coche {
    
    private Integer numeroPuertas;

    public Coche() {
    }

     
    public Coche(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    public int puertas(){
        return numeroPuertas+1;
    }
    
}
