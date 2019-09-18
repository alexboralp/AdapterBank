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
public class ZBankCreditAdaptee implements IBankAdapter{

    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        
        BankCreditResponse response = new BankCreditResponse();
        
        ZBankCreditRequest zrequest = new ZBankCreditRequest();
        zrequest.setCustomerName(request.getCustomer());
        zrequest.setRequestAmount(request.getAmount());
        
        ZBankCreditAPI api = new ZBankCreditAPI();
        try{
            ZBankCreditResponse xresponse = api.sendCreditRequest(zrequest);

            response.setApproved(xresponse.isAproval());
        }catch(ZBankCreditRejectedException ex){
            response.setApproved(false);
            return response;
        }
        
        return response;
    }
    
}
