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
public class YBankCreditSender {
    public void sendCreditForValidate(final YBankCreditApprove request, final YBankCreditSenderListener listener) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("YBank recibió la solicitud, en un momento tendrá la respuesta, sea paciente por favor.");
                YBankCreditApproveResult response = new YBankCreditApproveResult();
                
                if (request.getCredit() <= 1500) {
                    response.setApproved("Y");
                }else{
                    response.setApproved("N");
                }
                
                try {
                    Thread.sleep(1000 * 30);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YBankCreditSender.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                listener.notifyCreditResult(response);
            }
        }).start();
    }
}
