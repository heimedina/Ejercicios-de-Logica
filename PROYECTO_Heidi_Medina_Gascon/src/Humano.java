
public class Humano extends Personaje {

	private String tipo;

	public Humano(String nombre, int vida, int niv_arm, String tipo) {
		super(nombre, vida, niv_arm);
		this.tipo=tipo;
	}
	
	@Override
	public int atacar() {
		return calcularAtaqueHeroe();
	}
	
	public String getTipo() {
		return tipo;
	}
	
}
