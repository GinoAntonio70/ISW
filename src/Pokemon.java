
public class Pokemon {
    private String name;
    private Type type;
    private Trainer trainer;
    private int number;
    private boolean hasTrainer;
    private static int nextNumber;
    

    public Pokemon(String name, Type type) {
	this.name = name;
	this.type = type;
	this.number = nextNumber;
	nextNumber++;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	// this references the actual object instance
	this.name = name;
    }

    public Type getType() {
	return type;
    }

    public void setType(Type type) {
	this.type = type;
    }

    public int getNumber() {
	return this.number;
    }
    
    
    public void setTrainer(Trainer trainer) {
        if (this.hasTrainer == false) {
            this.trainer = trainer;
            this.hasTrainer = true;
    	}
    	else {
	    System.err.println("This pokemon alread has a trainer!");
	}
    }
     
    
    public Trainer getTrainer() {
    	return trainer;
    }
    
    
    public String toString() {
	return "Pokemon(" + getNumber() + ") '" + getName() + "' of type '" 
			+ getType();
    }

}
