
public class Triangulo extends FormaGeometrica {

	public Triangulo(int altura, int base) {
		super(altura, base);
	}
	
	public int getArea() {
		return ( (getAltura() * getBase()) / 2);
	}
	
	

}
