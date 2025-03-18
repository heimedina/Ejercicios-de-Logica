import java.util.ArrayList;
import java.util.List;

public class Ejercito {
	
	private List<Personaje> personajes;
	
	public Ejercito() {
        this.personajes = new ArrayList<>();
    }
	
	public void addPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

	public List<Personaje> getPersonajes() {
		return personajes;
	}
	
	public void eliminarMuertos() {
        personajes.removeIf(personaje -> !( personaje).estaVivo());
    }

    public boolean estaVacio() {
        return personajes.isEmpty();
    }

}
