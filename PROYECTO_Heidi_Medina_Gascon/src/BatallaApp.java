
public class BatallaApp {

	public static void main(String[] args) {
		Ejercito ejercitoHeroes = new Ejercito();
        Ejercito ejercitoBestias = new Ejercito();
        /* Crear personajes*/
        /*
         * Ejecito de Heroes
         */
        ejercitoHeroes.addPersonaje(new Elfo("Légolas", 150, 30,"Elfo"));
        ejercitoHeroes.addPersonaje(new Humano("Aragorn", 150, 50,"Humano"));
        ejercitoHeroes.addPersonaje(new Humano("Boromir", 100, 60,"Humano"));
        ejercitoHeroes.addPersonaje(new Humano("Gandalf", 300, 30,"Humano"));
        ejercitoHeroes.addPersonaje(new Hobbit("Frodo", 20, 10,"Hobbit"));
        /*
         * Ejecito de Bestias
         */
        ejercitoBestias.addPersonaje(new Orco("Lurtz", 200, 60,"Orco"));
        ejercitoBestias.addPersonaje(new Orco("Shagrat", 220, 50,"Orco"));
        ejercitoBestias.addPersonaje(new Trasgo("Uglúk", 120, 30,"Trasgo"));
        ejercitoBestias.addPersonaje(new Trasgo("Mauhúr", 100, 30,"Trasgo"));
        /*
         *  Comienzo de la batalla por turnos
         */
        int turno = 1;
        int dano;
        while (!ejercitoHeroes.estaVacio() && !ejercitoBestias.estaVacio()) {
        	System.out.println(" Turno "+ turno);
            for (int i = 0; i < Math.min(ejercitoHeroes.getPersonajes().size(), ejercitoBestias.getPersonajes().size()); i++) {
                Personaje heroe = ejercitoHeroes.getPersonajes().get(i);
                Personaje bestia = ejercitoBestias.getPersonajes().get(i);
                String tipoheroe=null, tipobestia=null;
                if(heroe instanceof Elfo) {tipoheroe="Elfo";}
                else if (heroe instanceof Humano) {tipoheroe="Humano";}
                else if (heroe instanceof Hobbit) {tipoheroe="Hobbit";}
                if(bestia instanceof Orco) {tipobestia="Orco";}
                else if (bestia instanceof Trasgo) {tipobestia="Trasgo";}
                /*
                 *  Turno del héroe
                 */
                System.out.println("Lucha entre "+heroe.getNombre()+" "+tipoheroe+" (Vida="+heroe.getVida()+" Armadura="+heroe.getNiv_arm() +") y "+bestia.getNombre()+" "+tipobestia+" (Vida="+bestia.getVida()+ " Armadura="+bestia.getNiv_arm()+")");
                int ataqueHeroe = heroe.atacar(); //Lanza el dado
                int dado = ataqueHeroe;
                if (heroe instanceof Elfo && bestia instanceof Orco) {
                    ataqueHeroe = ((Elfo) heroe).atacarContraOrco(dado); // Elfo contra Orco
                } else if (heroe instanceof Hobbit && bestia instanceof Trasgo) {
                    ataqueHeroe = ((Hobbit) heroe).atacarContraTrasgo(dado); // Hobbit contra Trasgo
                }
                
                int armaduraBestia = bestia.getNiv_arm();
                if (ataqueHeroe > armaduraBestia) { 
                    dano = ataqueHeroe - armaduraBestia;
                    bestia.recibirDano(dano);
                } else {dano=0;}
                System.out.println("****"+heroe.getNombre()+" saca " +dado+". Ataque="+ataqueHeroe+"****");
                System.out.println(heroe.getNombre()+" saca " +dado+" y le quita "+dano+" de vida a "+bestia.getNombre());
                
                /*
                 *  Turno de la bestia 
                 */
                int ataqueBestia = bestia.atacar(); //Lanza el dado
                dado = ataqueBestia;
                int armaduraHeroe = heroe.getNiv_arm();
                if (bestia instanceof Orco) {
                    armaduraHeroe = ((Orco) bestia).reducirArmadura(armaduraHeroe); // Orco reduce armadura
                }
                if (ataqueBestia > armaduraHeroe) {
                    dano = ataqueBestia - armaduraHeroe;
                    heroe.recibirDano(dano);
                } else {dano=0;}
                System.out.println("****"+bestia.getNombre()+" saca " +dado+". Ataque="+ataqueBestia+"****");                    
            	System.out.println(bestia.getNombre()+" saca " +dado+" y le quita "+dano+" de vida a "+heroe.getNombre()+"\n");
                if(!heroe.estaVivo()) {
                	System.out.println("¡Muere "+heroe.getNombre()+"!");
                }
                if(!bestia.estaVivo()) {
                	System.out.println("¡Muere "+bestia.getNombre()+"!");
                }

                /*
                 *  Eliminar muertos
                 */
                ejercitoHeroes.eliminarMuertos();
                ejercitoBestias.eliminarMuertos();
            }
            turno++;
        }
        

        /* FIN DEL TURNO
         *  Verificar quién ganó
         */
        if (ejercitoHeroes.estaVacio()) {
            System.out.println("Las Bestias ganaron la batalla.");
        } else if (ejercitoBestias.estaVacio()) {
            System.out.println("Los Héroes ganaron la batalla.");
        } else {
            System.out.println("La batalla terminó en empate.");
        }
    }

}
