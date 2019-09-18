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
public class YBankCreditApproveResult {
    public String approved;

    public YBankCreditApproveResult() {
        approved = "N";
    }

    public YBankCreditApproveResult(String approved) {
        this.approved = approved;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }
    
    
}
