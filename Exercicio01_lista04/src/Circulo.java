
public class Circulo extends FormaGeometrica {
	
	
	public Circulo() {
	}
	
	public Circulo(int altura, int base) {
		super(altura, base);
	}
	
	public double getArea() {
		return ( ( 3.14 * ((getBase()/ 2) * (getBase()/ 2) )));
	}	
}
