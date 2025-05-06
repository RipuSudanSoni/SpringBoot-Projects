package MyFactoryDesignePatternPack;

public class FactoryMain {
	
	public static void main(String args[]) {
	
		LaptopFactory lFactory = new LaptopFactory();
		
		Laptop aLaptop = lFactory.getNewLaptop("secure"); 
		aLaptop.laptopSpec();
	}
}
