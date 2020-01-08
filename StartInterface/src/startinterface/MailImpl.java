/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startinterface;

/**
 *
 * @author Yui
 */
public class MailImpl implements Mail{

    @Override
    public void sendMail() {
        System.out.println("Sending email");
    }

    @Override
    public void log() {
        System.out.println("Log!!!");
    }
    
}
