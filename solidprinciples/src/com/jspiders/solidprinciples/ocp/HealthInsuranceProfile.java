package com.jspiders.solidprinciples.ocp;

public class HealthInsuranceProfile implements CustomerProfile {

	@Override
	public boolean isLoyalCustomer() {
		return false;
	}

}
