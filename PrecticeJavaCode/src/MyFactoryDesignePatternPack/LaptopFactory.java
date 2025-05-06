package MyFactoryDesignePatternPack;

public class LaptopFactory {
	
	public Laptop getNewLaptop(String str) {
		if("Secure".equalsIgnoreCase(str)) {
			return new AppleLaptop();
		}
		else if ("strong".equalsIgnoreCase(str)) {
			return new DellLaptop();
		}
		else {
			return new HPLaptop();
		}
	}

}
