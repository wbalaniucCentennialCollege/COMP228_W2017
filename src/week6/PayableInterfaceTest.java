package week6;

public class PayableInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create array with 4 payable object slots
		Payable[] payableObjects = new Payable[4];
		
		// Assign array with payable objects
		payableObjects[0] = new Invoice("01234", "Seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "Tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee("Wallace", "Balaniuc", "111-11-1111", 800.00);
		payableObjects[3] = new SalariedEmployee("Bob", "Barker", "222-22-2222", 500.00);
		
		// Print out information
		System.out.println("Invoices and Employees processed polymorphically");
		
		for(Payable currentPayable : payableObjects) {
			System.out.printf("%n%s %n%s: $%.2f%n", currentPayable.toString(), 
					"Payment Due", currentPayable.getPaymentAmount());
		}
	}
}







