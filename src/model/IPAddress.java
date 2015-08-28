
package GameEngineSystem;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IPAddress {
    
    private static String name;
    private static String ipAddress;
    
    public IPAddress() {
        try {
            getAddress();
        } catch (UnknownHostException ex) {
            Logger.getLogger(IPAddress.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void getAddress() throws UnknownHostException {
        
        InetAddress addr = InetAddress.getLocalHost(); //address of client
        ipAddress = addr.getHostAddress(); //* ip number of client
        //System.out.println("IP address: " + ipAddress); //testing print ip
        
        name = addr.getHostName(); //name of the client
        //System.out.println("Name of hostname: " + name); //testing print name
    }
    
    public String getIP() {
        return ipAddress;
    }
    
    public String getName() {
        return name;
    }
}