package com.test.invoice;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Invoice invoice = new Invoice();
        Map<String, Double> invoiceDetails = invoice.generate(new InvoiceItem[]{new InvoiceItem("Test product", 10, 200.00)}, new Tax());
        System.out.println("Invoice details: " + invoiceDetails);
    }
}
