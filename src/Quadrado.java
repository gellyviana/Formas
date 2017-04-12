
public class Quadrado implements AreaCalculavel {
	
	private double base;
	private double resultado;
	
	public Quadrado(double base){
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void calcularArea(){
		
		this.resultado = this.base * this.base;
		System.out.printf("Area do Quadrado:%.2f\n", this.resultado);
		
	}

}
