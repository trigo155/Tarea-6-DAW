package clases;
	/**
	* Triángulo representa la manera de calcular el área del Triángulo heredando de la clase Figura.
	* @autor Juan José Trigo Hormigos.
	* @version 1.0 28/02/2021.
	*/

public class Triangulo extends Figura{
    
    private double base;
    private double altura;
	/**
	* Calcula el área multiplicando base por altura y dividiendo entre 2.
	* @param recibe base.
	* @param recibe altura.
	* @return área.
	*/
    public double CalcularArea() {        
        return this.area=(base*altura)/2;
     }
	/**
	* @return base.
	*/
    public double getBase() {
        return base;
    }
	/**
	* @param double recibe base.
	*/
	public void setBase(double base) {
        this.base = base;
    }
	/**
	* @return altura.
	*/
    public double getAltura() {
        return altura;
    }
	/**
	* @param double recibe altura.
	*/
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
