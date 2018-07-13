/**
 * 
 */
package com.test.invoice;

/**
 * @author gopal.r
 *
 */
public class InvoiceItem {

	final private String productName;
	private final int quantity;
	private final Double rate;
	
	public InvoiceItem(String productName, int quantity, Double rate)
	{
		this.productName = productName;
		this.quantity = quantity;
		this.rate = rate;
	}
	
	public String getProductName() {
		return productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public Double getRate() {
		return rate;
	}
}
