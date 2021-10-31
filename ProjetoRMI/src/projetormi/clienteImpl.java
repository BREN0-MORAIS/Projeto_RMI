/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetormi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author BRENO MORAIS
 */
public class clienteImpl extends UnicastRemoteObject implements iCliente {

   protected clienteImpl() throws RemoteException{
     super();
   }
   
    @Override
    public long add(long a, long b) throws RemoteException {
        return a + b;
    }
    
}
