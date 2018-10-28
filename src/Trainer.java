

public class Trainer {
    
	
    private String firstname;
    private String lastname;
    private java.util.ArrayList<Pokemon> pokemons = new java.util.ArrayList<Pokemon>();

    public Trainer(String firstname, String lastname) {
	this.firstname = firstname;
	this.lastname = lastname;
	
	
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public String toString() {
	return "Vorname: " + this.firstname + "\nNachname: " + this.lastname 
			 + "\nPokemons " + pokemons;
    }

    public void neuesPokemon(String name, Type art) {
    	Pokemon p1 = new Pokemon(name, art);
    	pokemons.add(p1);
    }
    
   
    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
        pokemon.setTrainer(this);
    }
		
    

}
