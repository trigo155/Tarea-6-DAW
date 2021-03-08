package clases;

import clases.Figura;
	/**
	* Círculo representa la manera de calcular el área del círculo heredando de la clase Figura.
	* @autor Juan José Trigo Hormigos
	* @version 1.0 28/02/2021
	*/

public class Circulo extends Figura{
    
    final double pi=3.1416;
    private double radio;
	/**
	* @return area.
	*/
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }
	/**
	* @return radio.
	*/
    public double getRadio() {
        return radio;
    }
	/**
	* @param double recibe radio.
	*/
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
