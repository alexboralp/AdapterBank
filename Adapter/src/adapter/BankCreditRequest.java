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
public class BankCreditRequest {
    private String customer;
    private double amount;

    public BankCreditRequest() {
        customer = "";
        amount = 0;
    }

    public BankCreditRequest(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
