
public class Orco extends Personaje {

	private String tipo;

	public Orco(String nombre, int vida, int niv_arm, String tipo) {
		super(nombre, vida, niv_arm);
		this.tipo=tipo;
	}
	
	@Override
	public int atacar() {
        return calcularAtaqueBestia(); // Dado con valor entre 0-90
    }
	
	public int reducirArmadura(int armaduraEnemigo) {
        return (int) (armaduraEnemigo * 0.9); // Reducir la armadura enemiga en 10%
    }
	
	public String getTipo() {
		return tipo;
	}

}
