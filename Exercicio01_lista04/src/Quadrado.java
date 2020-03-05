
public class Quadrado extends FormaGeometrica{



	public Quadrado(int altura, int base) {
		super(altura, base);
	}

	public int getArea() {
		return ( getAltura() * getBase() );
	}
	
}
