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
public class XBankCreditResponse {
    private boolean aproval;

    public XBankCreditResponse() {
        aproval = false;
    }
    
    public XBankCreditResponse(boolean aproval) {
        this.aproval = aproval;
    }

    public boolean isAproval() {
        return aproval;
    }

    public void setAproval(boolean aproval) {
        this.aproval = aproval;
    }
    
    
}
