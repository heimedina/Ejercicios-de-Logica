import java.util.Random;

abstract class Personaje {
	
	private String nombre;
	private int vida;
	private int niv_arm;
	Random rand = new Random();
	
	public Personaje(String nombre, int vida, int niv_arm) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.niv_arm = niv_arm;
	}

	public int getVida() {
		return vida;
	}

	public int getNiv_arm() {
		return niv_arm;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void recibirDano(int dano) {
        vida = vida - dano;
        if (vida < 0) {
            vida = 0;
        }
    }
	
	public boolean estaVivo() {
        return vida > 0;
    }

	public abstract int atacar();
	
	// Método común de ataque entre Heroes
    protected int calcularAtaqueHeroe() {
        int dado1 = rand.nextInt(101); // Dado con valor entre 0-100
        int dado2 = rand.nextInt(101); // Dado con valor entre 0-100
        return Math.max(dado1, dado2); // Elige el máximo de ambos
    }
    
 // Método común de ataque entre Heroes
    protected int calcularAtaqueBestia() {
        return rand.nextInt(91); // Dado con valor entre 0-90
    }
	

}
