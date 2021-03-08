import clases.Circulo;
import clases.Figura;
import clases.Rectangulo;
import clases.Triangulo;

	/**
	 * Clase para representar el área del círculo, rectángulo y triángulo.
	 * @author Juan José Trigo Hormigos
	 * @version 1.0 28/12/2021
	 */

public class Main {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        
        circulo.setRadio(44.55);
        rectangulo.setBase(30);
        rectangulo.setAltura(40);
        triangulo.setBase(50);
        triangulo.setAltura(60);
        
        System.out.println("Area del circulo "+calcularArea(circulo));
        System.out.println("Area del rectangulo "+calcularArea(rectangulo));
        System.out.println("Area del Triangulo "+calcularArea(triangulo));
       }
    /**
	* Metodo para calcular el área.
	* @param clase abstracta figura.
	* @return Regresa el área de la figura.
	*/  
    public static double calcularArea(Figura f){ // Ejemplo de uso de polimorfismo

	      
        return f.CalcularArea();
    }
}
