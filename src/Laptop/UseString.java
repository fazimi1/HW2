package Laptop;

public class UseString {
	public static void main(String[] args) {
		String BrandName = "Lenovo";
		String BrandName2 = "Dell";
		String ProcessorType = "Corei7";
		String Empty = "";
		int Year = 1;
		
		System.out.println(BrandName.charAt(2));
		System.out.println(BrandName.length());
		System.out.println(BrandName.substring(2,4));
		System.out.println(BrandName.contains("v"));
		System.out.println(BrandName.equals(ProcessorType));
		System.out.println(Empty.isEmpty());
		System.out.println(ProcessorType.replace("i7", "i8"));
		System.out.println(ProcessorType.split(""));
		System.out.println(ProcessorType.indexOf("e"));
		System.out.println(BrandName.toLowerCase());
		System.out.println(BrandName.toUpperCase());
		System.out.println(BrandName.valueOf("L"));
		System.out.println(BrandName.trim());
		System.out.println(BrandName.getBytes());
		System.out.println(BrandName.startsWith("G"));
		System.out.println(BrandName.intern());
		System.out.println(BrandName.hashCode());
		System.out.println(ProcessorType.codePointAt(2));
		System.out.println(BrandName.endsWith(Empty));
		System.out.println(BrandName.replaceFirst("Le", "Ge"));
		System.out.println(BrandName.replaceAll("Lenovo", "Dell"));
		System.out.println(BrandName.endsWith("L"));
		System.out.println(BrandName.lastIndexOf("n"));
		System.out.println(BrandName.compareTo(BrandName2));
		System.out.println(BrandName.equalsIgnoreCase(BrandName2));
		System.out.println(BrandName.toString());
		System.out.println(BrandName.contentEquals("Dell"));
		System.out.println(BrandName.copyValueOf(null));
		System.out.println(BrandName.subSequence(1,2));
	}
}
