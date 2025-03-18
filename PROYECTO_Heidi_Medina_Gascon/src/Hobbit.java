
public class Hobbit extends Personaje {

	private String tipo;

	public Hobbit(String nombre, int vida, int niv_arm, String tipo) {
		super(nombre, vida, niv_arm);
		this.tipo=tipo;
	}
	
	@Override
	public int atacar() {
		return calcularAtaqueHeroe();
	}
	
	public int atacarContraTrasgo(int ataqueinicial) {
        return ataqueinicial - 5; // Hobbit miedo a los Trasgos
    }
	
	public String getTipo() {
		return tipo;
	}

}
