package networkProgram;
//Import Library
import java.net.*;
import java.util.*;

//Find ip
public class IPFinder {
    public static void main(String[] args) {
        String hostName;
        Scanner input = new Scanner(System.in);
        InetAddress address;
        System.out.println("\nEnter your host name: ");
        hostName = input.next();
        try {
            address = InetAddress.getByName(hostName);
            System.out.println("IP address: " + address.toString());
        } catch (UnknownHostException e) {
            System.out.println("Couldn't find host");
        }
    }
}