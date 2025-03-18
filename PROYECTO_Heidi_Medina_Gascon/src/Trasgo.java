
public class Trasgo extends Personaje{

	private String tipo;

	public Trasgo(String nombre, int vida, int niv_arm, String tipo) {
		super(nombre, vida, niv_arm);
		this.tipo=tipo;
	}
	
	@Override
	public int atacar() {
        return calcularAtaqueBestia(); // Dado con valor entre 0-90
    }
	
	public String getTipo() {
		return tipo;
	}
}
