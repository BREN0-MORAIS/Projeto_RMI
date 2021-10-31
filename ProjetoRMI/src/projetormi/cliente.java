/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetormi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BRENO MORAIS
 */
public class cliente {
    public static void main(String[] args) throws NotBoundException{
    
            try{
              iCliente cliente  = (iCliente) Naming.lookup("rmi://192.168.99.2:1099/ClienteServer");
                System.out.println("Adição:"+cliente.add(2, 3));
            }
         catch (MalformedURLException ex) {
             Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
            catch (RemoteException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
