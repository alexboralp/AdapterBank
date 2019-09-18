/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aborbon
 */
public class YBankCreditAdaptee implements IBankAdapter, YBankCreditSenderListener{
    
    private YBankCreditApproveResult yresponse;

    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        YBankCreditApprove yrequest = new YBankCreditApprove();
        yrequest.setCredit((float)request.getAmount());
        yrequest.setName(request.getCustomer());
        
        YBankCreditSender sender = new YBankCreditSender();
        sender.sendCreditForValidate(yrequest, this);
        
        do{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(YBankCreditAdaptee.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("YBank, petición en espera...");
        } while(yresponse == null);
        
        BankCreditResponse response = new BankCreditResponse();
        response.setApproved(yresponse.getApproved()=="Y"?true:false);
        
        return response;
    }

    @Override
    public void notifyCreditResult(YBankCreditApproveResult result) {
        this.yresponse = result;
    }
    
}
