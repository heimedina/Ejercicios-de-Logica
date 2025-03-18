public class Elfo extends Personaje{
	
	private String tipo;

	public Elfo(String nombre, int vida, int niv_arm, String tipo) {
		super(nombre, vida, niv_arm);
		this.tipo=tipo;
	}
	
	@Override
	public int atacar() {
		return calcularAtaqueHeroe();
	}

	public int atacarContraOrco(int ataqueinicial) {
        return ataqueinicial + 10; // Elfo tiene más fuerza contra orcos
    }

	public String getTipo() {
		return tipo;
	}
	
}
