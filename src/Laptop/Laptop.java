package Laptop;

public class Laptop {
static int YearsOwned;
String BrandName;
static int RandomAccessMemory;
int ProcessorGeneration;
String ProcessorType;
String OperatingSystem;

public Laptop(int pg, String pt) {
	ProcessorGeneration = pg;
	ProcessorType = pt;
	
}

public Laptop(String bn, String os) {
	BrandName = bn;
	OperatingSystem = os;
}

public static void YearsOwned() {
	YearsOwned = 1;
	
}
public static void RandomAccessMemory() {
	RandomAccessMemory = 16;
}



}