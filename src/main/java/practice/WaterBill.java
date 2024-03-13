package practice;

public class WaterBill {

	public static void main(String[] args) {
		System.out.println(calculateWaterBill(1800));
	}

	private static double calculateWaterBill(double gallonsUsage) {
		
		double minimumCharge=18.84 ;
		int numberOfGallonsInCCF = 748;
		int includeGallons = 2*numberOfGallonsInCCF;
		
		if(gallonsUsage<=includeGallons) {
			return minimumCharge;
		}else {
			double extraGallonsUsed = gallonsUsage - includeGallons;
			double extraAmount = Math.ceil(extraGallonsUsed / numberOfGallonsInCCF) * 3.90;
			return minimumCharge + extraAmount;
		}
	}
}
