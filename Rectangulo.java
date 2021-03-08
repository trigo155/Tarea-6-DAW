package clases;
	/**
	* Rectángulo representa la manera de calcular el área del rectángulo heredando de la clase Figura.
	* @autor Juan José Trigo Hormigos
	* @version 1.0 28/02/2021
	*/

public class Rectangulo extends Figura{
    
    private double base;
    private double altura;
	/**
	* Calcula el área multiplicando base por altura.
	* @param recibe base.
	* @param recibe altura.
	* @return área.
	*/ 

    public double CalcularArea() {        
        return this.area=(base*altura);
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
