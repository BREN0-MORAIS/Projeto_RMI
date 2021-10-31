
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import projetormi.cliente;

/**
 *
 * @author BRENO MORAIS
 */
public class ClienteServer {
    ClienteServer(){
        try{
             System.setProperty("java.rmi.server.hostname","192.168.99.2:1099");
             LocateRegistry.createRegistry(1099);
             cliente cliente = new cliente();
             Naming.bind("ClienteServer", (Remote) cliente);
            
        }catch(Exception e){
        }
    }
}
