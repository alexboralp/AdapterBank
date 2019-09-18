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
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Request genérico para las dos APIs
        BankCreditRequest request = new BankCreditRequest();
        request.setCustomer("Oscar Blancarte");
        request.setAmount(6000);
        
        IBankAdapter xBank = new XBankCreditAdaptee();
        BankCreditResponse xresponse = xBank.sendCreditRequest(request);
        System.out.println("xBank approved > " + xresponse.isApproved() + "\n");
        
        IBankAdapter yBank = new YBankCreditAdaptee();
        BankCreditResponse yresponse = yBank.sendCreditRequest(request);
        System.out.println("yBank approved > " + yresponse.isApproved() + "\n");
        
        IBankAdapter zBank = new ZBankCreditAdaptee();
        BankCreditResponse zresponse = zBank.sendCreditRequest(request);
        System.out.println("zBank approved > " + zresponse.isApproved() + "\n");
        
        if(xresponse.isApproved()){
            System.out.println("xBank aprovó su crédito, felicidades!!");
        }else if(yresponse.isApproved()){
            System.out.println("yBank aprovó su crédito, felicidades!!");
        }else if(zresponse.isApproved()){
            System.out.println("zBank aprovó su crédito, felicidades!!");
        }else{
            System.out.println("Lo sentimos, su crédito no ha sido aprovado.");
        }
    }
    
}
