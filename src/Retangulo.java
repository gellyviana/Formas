
public class Retangulo implements AreaCalculavel{
	
	private double base;
	private double altura;
	private double resultado;
	
	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void calcularArea(){
		
		this.resultado = this.base * this.altura;
		System.out.printf("Area do Retangulo: %.2f\n", this.resultado);
	}
	
}
