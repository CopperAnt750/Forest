package forest;

public class Forest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree firstOne = new Oak();
		firstOne.setHealthy(true);
		firstOne.setTreeAge(100);
		firstOne.setYearOfPlant(1921);
		firstOne.setHome(true);
		
		System.out.println("A first tree is Oak from "+ firstOne.getYearOfPlant() );
		System.out.println("Second line " );
	}

}
