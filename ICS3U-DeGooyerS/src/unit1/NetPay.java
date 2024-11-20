package unit1;
/**
 * Description: this program prints the Net Pay (after tax) of an employee based on the hours they worked and their pay.
 * Date: Oct. 7, 2024
 * @author Simon de Gooyer
 */
public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring Variables
		double netPay, wage, insurance, tax;
		int hours = 40;
		wage = 5.00;
		insurance = 2.00;
		tax = 0.22;
		// Calculating and printing net pay
		netPay = (hours * wage - insurance) - tax *(hours * wage - insurance);
		System.out.println("The Net Pay for an employee who works 40 hours at $5.00 is " + netPay);

	}

}
