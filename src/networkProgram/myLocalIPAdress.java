package networkProgram;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class myLocalIPAdress {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("IP address: " + address.toString());
        } catch (UnknownHostException e) {
            System.out.println("Couldn't find local host");
        }
    }
}
