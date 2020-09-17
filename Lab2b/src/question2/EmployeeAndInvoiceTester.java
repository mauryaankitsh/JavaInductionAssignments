package question2;

import java.math.BigDecimal;

import org.omg.CORBA.DynAnyPackage.Invalid;

public class EmployeeAndInvoiceTester {
	public static void main(String[] args) {
		Employee e=new SalariedEmployee(1,"Ankit","CSE",new BigDecimal(100));
		e.getPayment();
		e.setSalary(200);
		e.getPayment();
		InVoice in=new InVoice();
		in.setPartNum("1");
		in.setPartDescription("this is a tool");
		in.setQuality(5);
		in.setPricePerItem(5);
		in.getPayment();
		
	}
}
