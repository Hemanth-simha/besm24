package com.jspiders.solidprinciples.ocp;

//Extension
public class VehicalInsuranceProfile implements CustomerProfile {

	@Override
	public boolean isLoyalCustomer() {
		return true;
	}

}
