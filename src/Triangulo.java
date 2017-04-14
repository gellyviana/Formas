
public class Triangulo implements AreaCalculavel {
	
	private double altura;
	private double base;
	private double resultado;
	
	public Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public void calcularArea(){

		this.resultado = (this.base * this.altura)/2;
		System.out.printf("Area do Triangulo: %.2f\n", this.resultado);
		
	}

}
