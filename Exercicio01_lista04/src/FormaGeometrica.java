
public abstract class FormaGeometrica {
	
	protected int altura;
	protected int base;
	
	public FormaGeometrica(int altura, int base) {
		this.altura = altura;
		this.base = base;
	}
	
	public FormaGeometrica() {
		
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "FormaGeometrica [altura=" + altura + ", base=" + base + "]";
	}
	
	
}
