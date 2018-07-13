/**
 * 
 */
package com.test.invoice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gopal.r
 *
 */
public class Tax {

	public Map<String, Double> calculate(Double amount) {
		Map<String, Double> taxDetails = new HashMap<String, Double>();
		taxDetails.put("service_tax", calculateServiceTax(amount));
		taxDetails.put("swach_bharat_cess",  calculateSwachBharatCess(amount));
		taxDetails.put("krishi_kalyan_cess",  calculateKrishiKalyanCess(amount));
		return taxDetails;
	}

	private Double calculateKrishiKalyanCess(Double amount) {
		return amount * 0.005;
	}

	private Double calculateSwachBharatCess(Double amount) {
		return amount * 0.005;
	}

	private Double calculateServiceTax(Double amount) {
		return amount * 0.14;
	}

}
