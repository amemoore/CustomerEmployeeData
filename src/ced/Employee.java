package ced;

public class Employee extends Person{
	
	private String socialSecurityNo;
	
	public Employee(){
	}

	public String getSocialSecurityNo() {
		return socialSecurityNo;
	}

	public void setSocialSecurityNo(String socialSecurityNo) {
		this.socialSecurityNo = socialSecurityNo;
	}
	
	@Override
	public String getDisplayText(){
		return super.toString() + socialSecurityNo;
	}
	
	
}
