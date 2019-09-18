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
public class ZBankCreditAPI {
    public ZBankCreditResponse sendCreditRequest(ZBankCreditRequest request) throws ZBankCreditRejectedException {
        ZBankCreditResponse response = new ZBankCreditResponse();
        
        if (request.getRequestAmount() <= 7000) {
            response.setAproval(true);
        }else{
            throw new ZBankCreditRejectedException("Crédito rechazado.");
        }
        
        return response;
    }
}
