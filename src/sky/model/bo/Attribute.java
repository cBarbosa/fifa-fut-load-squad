package sky.model.bo;

import java.util.ArrayList;

public class Attribute {
	private String name;
	private short value;
	private ArrayList<Integer> chemistryBonus;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public short getValue() {
		return value;
	}
	public void setValue(short value) {
		this.value = value;
	}
	public ArrayList<Integer> getChemistryBonus() {
		return chemistryBonus;
	}
	public void setChemistryBonus(ArrayList<Integer> chemistryBonus) {
		this.chemistryBonus = chemistryBonus;
	}
}