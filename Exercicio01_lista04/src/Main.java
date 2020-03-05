
public class Main {

	public static void main(String[] args) {
		
		
		
		Quadrado quad = new Quadrado(10,4);
		Triangulo tri = new Triangulo(10,4);
		Circulo cir = new Circulo();
		tri.setAltura(33);

		
		System .out.println("area do Quadrado:" + quad.getArea());
		
		System .out.println("area do Triangulo:" + tri.getArea());
		
		System .out.println("area do Criculo:" + cir.getArea());
		
		
	}

}
