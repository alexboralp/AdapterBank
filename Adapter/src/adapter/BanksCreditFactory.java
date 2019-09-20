/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author alexander
 */
public class BanksCreditFactory {
    
    public enum BANK {XBANK, YBANK, ZBANK}
    
    public static IBankAdapter getBankCreditAdaptee(BANK bank) {
        switch (bank) {
            case XBANK:
                return new XBankCreditAdaptee();
            case YBANK:
                return new YBankCreditAdaptee();
            case ZBANK:
                return new ZBankCreditAdaptee();
            default:
                return null;
        }
    }
    
    public static BankCreditRequest getBankCreditRequest() {
        return new BankCreditRequest();
    }
    
    public static BankCreditRequest getBankCreditRequest(String name, double amount) {
        return new BankCreditRequest(name, amount);
    }
    
    public static BankCreditResponse getBankCreditResponse() {
        return new BankCreditResponse();
    }
    
}
