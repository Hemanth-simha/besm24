package com.jspiders.solidprinciples.ocp;

public class HomeInsuranceProfile implements CustomerProfile {

	@Override
	public boolean isLoyalCustomer() {
		return false;
	}

}
