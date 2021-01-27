package forest;

public abstract class Tree {

	private String treeSpecies;
	private int treeHeight;
	private int treeAge;
	private int yearOfPlant;
	private boolean isHealthy;
	private boolean isHomeForAnimal;
	

	public Tree() {

	}

	public Tree(String treeSpecies, int treeHeight) {
		this.treeSpecies = treeSpecies;
		this.treeHeight = treeHeight;
	}

	public Tree(String treeSpecies, int treeHeight, int treeAge, int yearOfPlant, boolean isHealthy, boolean isHome) {
		this.treeSpecies = treeSpecies;
		this.treeHeight = treeHeight;
		this.treeAge = treeAge;
		this.yearOfPlant = yearOfPlant;
		this.isHealthy = isHealthy;
		this.isHomeForAnimal = isHome;
	}

	public int getYearOfPlant() {
		return yearOfPlant;
	}

	public void setYearOfPlant(int yearOfPlant) {
		this.yearOfPlant = yearOfPlant;
	}

	public boolean getIsHealthy() {
		return isHealthy;
	}

	public void setHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}

	public boolean getIsHome() {
		return isHomeForAnimal;
	}

	public void setHome(boolean isHome) {
		this.isHomeForAnimal = isHome;
	}

	public String getTreeSpecies() {
		return treeSpecies;
	}

	public void setTreeSpecies(String treeSpecies) {
		this.treeSpecies = treeSpecies;
	}

	public int getTreeHeight() {
		return treeHeight;
	}

	public void setTreeHeight(int treeHeight) {
		this.treeHeight = treeHeight;
	}

	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}
	
	public void grow ( int height) {
		treeHeight+=height;
	}

}
