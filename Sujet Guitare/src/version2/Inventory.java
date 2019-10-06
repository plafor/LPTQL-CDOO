package version2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public //TODO complete code
	search(Guitar searchGuitar) {
		
		//TODO complete code
		
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {

			Guitar guitar = i.next();

			// Ignore serial number since that's unique
			// Ignore price since that's unique

			Builder builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals(guitar.getBuilder())))
				continue;

			//TODO complete code

			Wood topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals(guitar.getTopWood())))
				continue;

			Wood backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals(guitar.getBackWood())))
				continue;

			//TODO complete code

			//TODO complete code
		}
		//TODO complete code
	}

}
