

package mavengit;


import java.io.FileNotFoundException;
	import java.io.IOException;

	public class ExcelMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
     System.out.println("Excel Details ");
     
	// Read String data
	String name = ExcelCode.readStringData(1, 0); 
	System.out.println("Name: " + name);
	
	// Read Integer data
	String value = ExcelCode.readIntegerData(1, 1);
	System.out.println("Value: " + value);
	
	String  name1= ExcelCode.readStringData(2, 0);
	System.out.println("Name: " + name1);
	
	String value1 = ExcelCode.readIntegerData(2, 1);
	System.out.println("Value: " + value1);
	
	
	String  name2= ExcelCode.readStringData(3, 0);
	System.out.println("Name: " + name2);
	
	String value2 = ExcelCode.readIntegerData(3, 1);
	System.out.println("Value: " + value2);
	
	
	
	
	}
	
	}