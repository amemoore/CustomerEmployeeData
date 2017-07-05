package ced;

public class Customer extends Person{
	
	private int customerNo;
	
	public Customer(){
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	
	@Override 
	public String getDisplayText(){
		return super.toString() + "Customer Number: " + customerNo + "\n";
	}
}
