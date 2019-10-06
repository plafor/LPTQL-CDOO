package version4;

public class GuitarSpec {

	public static final int NO_PREF_NUM_STRINGS = -1;
	
	private Builder builder;
	private String model;
	private Type type;
	//TODO complete code
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		//TODO complete code
	}

	//TODO complete code

	/*
	 * preconditions : searchGuitar : ce que veut le client
	 * et l'objet courant est une vrai guitare spec
	 * 
	 */
	
	public boolean matches(GuitarSpec searchGuitar) {
		
		//TODO complete code
	}
	
}
