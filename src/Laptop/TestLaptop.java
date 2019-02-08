package Laptop;

public class TestLaptop {
	public static void main(String[] args) {
		Laptop MyLaptop = new Laptop(7, "Core i7");
		Laptop MyLaptop2 = new Laptop("Lenovo", "Windows 10");
		Laptop.YearsOwned();
		Laptop.RandomAccessMemory();
System.out.println("Generation " + MyLaptop.ProcessorGeneration + " " + MyLaptop.ProcessorType);
System.out.println("Brand name: " + MyLaptop2.BrandName + " " + "Operating System: " + MyLaptop2.OperatingSystem);
System.out.println("This is the number of years I have owned my laptop: " + Laptop.YearsOwned + " Year");
System.out.println("My Laptop has " + Laptop.RandomAccessMemory + "GB of RAM");
	}
}
;