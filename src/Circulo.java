
public class Circulo implements AreaCalculavel{
	
	private double raio;
	private double resultado;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public void calcularArea(){
		
		this.resultado = 2* Math.PI * Math.pow(this.raio,2);
		System.out.printf("Area do Circulo:  %.2f\n", this.resultado);
		
	}

}
