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
public class XBankCreditAdaptee implements IBankAdapter{

    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        ZBankCreditRequest xrequest = new ZBankCreditRequest();
        xrequest.setCustomerName(request.getCustomer());
        xrequest.setRequestAmount(request.getAmount());
        
        XBankCreditAPI api = new XBankCreditAPI();
        XBankCreditResponse xresponse = api.sendCreditRequest(xrequest);
        
        BankCreditResponse response = new BankCreditResponse();
        response.setApproved(xresponse.isAproval());
        
        return response;
    }
    
}
