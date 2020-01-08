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
public class StartInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mail mail = new MailImpl();
        mail.sendMail();
        mail.log();
    }
    
}
