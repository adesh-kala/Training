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
public class Invoice {

	public Map<String, Double> generate(InvoiceItem[] items, Tax tax) {
		Map<String, Double> invoiceDetails = new HashMap<String, Double>();
		Double amount = 0.00;
		for(int i=0;i<items.length;i++)
		{
			amount = amount + (items[i].getQuantity() * items[i].getRate());
		}
		invoiceDetails.put("amount", amount);
		if(amount!=0.0)
    		invoiceDetails.putAll(tax.calculate(amount));
		return invoiceDetails;
	}

}
