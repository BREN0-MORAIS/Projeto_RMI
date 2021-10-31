/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetormi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author BRENO MORAIS
 */
public interface iCliente extends Remote {
  public long add(long a, long b)throws RemoteException;  
}
