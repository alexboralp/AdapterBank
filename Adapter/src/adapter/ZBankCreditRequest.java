/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author aborbon
 */
public class ZBankCreditRequest {
    private String customerName;
    private double requestAmount;

    public ZBankCreditRequest() {
        customerName = "";
        requestAmount = 0;
    }

    public ZBankCreditRequest(String customerName, double requestAmount) {
        this.customerName = customerName;
        this.requestAmount = requestAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(double requestAmount) {
        this.requestAmount = requestAmount;
    }
    
    
}
