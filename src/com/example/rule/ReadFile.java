package com.example.rule;

public class ReadFile implements File1 {

	private String RuleTyeRec;
	private String customerIDRec;
	
	public ReadFile () {
		
	}

	
	public void setRuleTyeRec(String ruleTyeRec) {
		RuleTyeRec = ruleTyeRec;
	}


	public void setCustomerIDRec(String customerIDRec) {
		this.customerIDRec = customerIDRec;
	}


	public String getRuleTyeRec() {
		return RuleTyeRec;
	}


	public String getCustomerIDRec() {
		return customerIDRec;
	}


	@Override
	public String getRuleTypeRec() {
		return null;
	}


	@Override
	public String getcustomerIDRec() {
		return null;
	}
		
	


    
	
}
