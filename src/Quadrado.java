
public class Quadrado extends Retangulo implements AreaCalculavel {
	
	public Quadrado(double base){
		super(base, base);
	}
	public void calcularArea(){
		
		double resultado = this.getBase() * this.getBase();
		System.out.printf("Area do Quadrado: %.2f\n", resultado);
	}
}
