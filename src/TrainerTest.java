
public class TrainerTest {

    public static void main(String[] args) {
		
	
    // Neuen Trainer anlegen - Konstruktortest
    	
        System.out.println();
	System.out.println("Testen des Konstruktors für den Trainer");
	Trainer t1 = new Trainer("Lloyed", "Christmas");
	System.out.println("Trainer t1 angelegt mit dem Vornamen = Lloyd und den Nachnamen = Christmas");
	Trainer t2 = new Trainer("Harry", "Dunne");
	System.out.println(t1);
	System.out.println();
	System.out.println("Trainer t2 angelegt mit dem Vornamen = Harry und den Nachnamen = Dunne");
	System.out.println();
	System.out.println(t2);
		
	
	// Neues Pokemon eines Trainers erstellen
	
	System.out.println();
	System.out.println("Testen des Hinzufügens eines neuen Pokemons");
	t1.neuesPokemon("Pikachu", Type.Fire);
	System.out.println(t1);
	
	
	// Bestehndes Pokemon Hinzufügen
	
	System.out.println();
	System.out.println("Testen des Hinzufügens eines bestehenden Pokemons");
	System.out.println("Dazu erzeugen des Pokemons: Hellfire, Typ: fire");
	Pokemon p1 = new Pokemon("Hellfire", Type.Fire);
	System.out.println(p1);
	System.out.println("und nun das Pokemon zuordnen zu dem Trainer Lloyed Christmas");
	t1.addPokemon(p1);
	System.out.println(t1);
	
	
	// Versuch vergebenes Pokemon an einen Trainer zu geben
	
	System.out.println();
	System.out.println("Vergebenes Pokemon einem neuen trainer zuweisen - sollte Fehlschlagen");
	p1.setTrainer(t2);
	System.out.println();
    }

}
